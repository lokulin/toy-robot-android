package com.lauchlin.toyrobot;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


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

    public void onPlace(View view) {
        EditText reportText = (EditText) findViewById(R.id.reportEditText);
        reportText.setText("Place");
    }

    public void onMove(View view) {
        EditText reportText = (EditText) findViewById(R.id.reportEditText);
        reportText.setText("Move");
    }

    public void onLeft(View view) {
        EditText reportText = (EditText) findViewById(R.id.reportEditText);
        reportText.setText("Left");
    }

    public void onRight(View view) {
        EditText reportText = (EditText) findViewById(R.id.reportEditText);
        reportText.setText("Right");
    }

    public void onReport(View view) {
        EditText reportText = (EditText) findViewById(R.id.reportEditText);
        reportText.setText("Report");
    }
}