package com.example.globalvariableorapplicationcontextvariable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // [START add_code_here]
        final Button secondBtn = (Button) findViewById(R.id.buttonGotoSecondScreen);

        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();

        //Set name and email in global/application context
        globalVariable.setName("Android Example context variable");
        globalVariable.setEmail("xxxxxx@aaaa.com");


        secondBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), SecondScreenActivity.class);
                startActivity(i);
            }
        });
        // [END add_code_here]

    }
}