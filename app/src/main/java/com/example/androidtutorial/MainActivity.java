package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Constants
    public static final String EXTRA_MESSAGE = "com.example.androidtutorial.MESSAGE";

    //View References
    private  Button dbPg, snd_msg;
    private EditText msg_val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbPg = findViewById(R.id.dbPg);
        snd_msg = findViewById(R.id.snd_msg);
        EditText msg_val = findViewById(R.id.msg_val);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = msg_val.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**   Called when user clicks the database button */
    public void goToDB(View view) {
        Intent intent = new Intent(this, DataBaseActivity.class);
        startActivity(intent);
    }
}