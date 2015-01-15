package edu.asu.bscs.jbihms.lab1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //calls parent
        setContentView(R.layout.activity_main); //R is generated when built, sets the content view from the xml file (deseralization), creates the UI objects then loads the objects (view group objects) for the view
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

    @Override
      public void onRestart(){
        super.onRestart();
        Log.d(getClass().getSimpleName(), "onRestart");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(getClass().getSimpleName(), "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(getClass().getSimpleName(), "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(getClass().getSimpleName(), "onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(getClass().getSimpleName(), "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(getClass().getSimpleName(), "onDestroy");
    }

    public void startDialog(View v){
        
    }




}
