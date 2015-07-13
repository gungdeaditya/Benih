package id.zelory.benih;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BenihActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getActivityView());
        onViewReady(savedInstanceState);
    }

    protected abstract int getActivityView();

    protected abstract void onViewReady(Bundle savedInstanceState);

    protected void log(String message)
    {
        try
        {
            Log.d(getClass().getSimpleName(), message);
        } catch (Exception e)
        {
            Log.d(getClass().getSimpleName(), "Null message.");
        }
    }
}
