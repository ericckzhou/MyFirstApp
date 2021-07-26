package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<view> extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    This is the main activity.
    It's the entry point for your app.
    When you build and run your app,
    the system launches an instance of this Activity
    and loads its layout.
     */

    public void sendMessage(View view){
        /*
        An Intent is an object that provides runtime binding between separate components,
         such as two activities. The Intent represents an app’s intent to do something.
         You can use intents for a wide variety of tasks, but in this lesson,
         your intent starts another activity.
In MainActivity, add the EXTRA_MESSAGE constant and the sendMessage() code, as shown:

The Intent constructor takes two parameters, a Context and a Class.

The Context parameter is used first because the Activity class is a subclass of Context.

The Class parameter of the app component, to which the system delivers the Intent, is, in this case, the activity to start.

The putExtra() method adds the value of EditText to the intent. An Intent can carry data types as key-value pairs called extras.

Your key is a public constant EXTRA_MESSAGE because the next activity uses the key to retrieve the text value. It's a good practice to define keys for intent extras with your app's package name as a prefix. This ensures that the keys are unique, in case your app interacts with other apps.

The startActivity() method starts an instance of the DisplayMessageActivity that's specified by the Intent. Next, you need to create that class.
         */
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}