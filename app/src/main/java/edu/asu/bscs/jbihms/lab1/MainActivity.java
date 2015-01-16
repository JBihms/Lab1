/*
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

Copyright Joseph Bihms
@author Joseph Bihms
@mailto jbihms@asu.edu
@version Jan 15, 2015
 */

package edu.asu.bscs.jbihms.lab1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;


public class MainActivity extends ActionBarActivity {
    TextView helloTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //calls parent
        setContentView(R.layout.activity_main); //R is generated when built, sets the content view from the xml file (deseralization), creates the UI objects then loads the objects (view group objects) for the view
        helloTV = (TextView) findViewById(R.id.helloTV);

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

        /*
        When the user click the Click Me button do the following!
        */
    public void startDialog(View v) {
        android.util.Log.w("ActivityMain", "called startDialog()");
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);

    }

    public void showTime(View v){
        android.util.Log.w("ActivityMain", "called startDialog()");
        String curr = DateFormat.getDateTimeInstance().format(new Date());

        helloTV.setText(curr);
    }


}
