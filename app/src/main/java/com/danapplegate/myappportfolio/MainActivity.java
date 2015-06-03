package com.danapplegate.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clickSpotifyStreamerButton(View view) {
        showAppStartToast("Spotify Streamer App");
    }

    public void clickScoresAppButton(View view) {
        showAppStartToast("Football Scores App");
    }

    public void clickLibraryAppButton(View view) {
        showAppStartToast("Library App");
    }

    public void clickBuildItBiggerButton(View view) {
        showAppStartToast("Build It Bigger App");
    }

    public void clickXYZReaderButton(View view) {
        showAppStartToast("XYZ Reader App");
    }

    public void clickCapstoneButton(View view) {
        showAppStartToast("Capstone App");
    }

    private void showAppStartToast(String appName) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the " + appName + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
