package com.example.natasha.dailybucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Login extends AppCompatActivity {

    private static Button button;
    private static Button eye;
    private static TextView texty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OnClickListener(){
        texty = (TextView) findViewById(R.id.textView8);
        texty.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getBaseContext(), SignUp.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button2);
        texty.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getBaseContext(), Home.class);
                startActivity(intent);
            }
        });


        // Add the code for passing variables in intent .
        // Add the code for the password visibility on the imagebutton of eye



    }
}
