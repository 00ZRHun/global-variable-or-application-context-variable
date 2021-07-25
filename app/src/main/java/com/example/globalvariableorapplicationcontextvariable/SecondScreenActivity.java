package com.example.globalvariableorapplicationcontextvariable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        // [START add_code_here]
        TextView showGlobal     = (TextView) findViewById(R.id.textViewShowGlobal);
        final Button thirdBtn = (Button) findViewById(R.id.buttonGotoThirdScreen);

        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();

        // Get name and email from global/application context
        final String name  = globalVariable.getName();
        final String email = globalVariable.getEmail();

        String showString = "Name : "+name+" "+"Email : "+email+" ";

        // Show name/email values in TextView
        showGlobal.setText(showString);

        thirdBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), ThirdScreenActivity.class);
                startActivity(i);
            }
        });
        // [END add_code_here]
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}