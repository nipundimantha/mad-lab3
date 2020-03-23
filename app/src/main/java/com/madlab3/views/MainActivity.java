package com.madlab3.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * The Main Activity program implements an application that
 * simply displays the message to another activity with hold data's.
 *
 * @author  Dimantha H.V.N
 * @version 1.0
 * @since   2020-03-23
 *
 */

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.madLab3.Views";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
