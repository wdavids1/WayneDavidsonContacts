package edu.westga.cs6242.waynedavidsoncontacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void saveButtonClick(View v) {

        TextView inputNameText = (TextView) findViewById(R.id.nameText);
        TextView inputEmailText = (TextView) findViewById(R.id.emailText);
        TextView inputPhoneText = (TextView) findViewById(R.id.phoneText);
        RadioButton cellButton = (RadioButton)findViewById(R.id.cellButton);

        TextView outputMessageText = (TextView) findViewById(R.id.messageOutText);
        TextView outputNameText = (TextView) findViewById(R.id.nameOutText);
        TextView outputEmailText = (TextView) findViewById(R.id.emailOutText);
        TextView outputPhoneText = (TextView) findViewById(R.id.phoneOutText);

        outputMessageText.setText("Your contact has been saved.");
        outputNameText.setText("Name: " + inputNameText.getText());
        outputEmailText.setText("Email: " + inputEmailText.getText());
        if (cellButton.isChecked()) {
            outputPhoneText.setText("Phone: " + inputPhoneText.getText() + " (Cell)");
        } else {
            outputPhoneText.setText("Phone: " + inputPhoneText.getText() + " (Landline)");
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}
