package com.example.natasha.dailybucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {


    private static TextView texty;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        OnClickListener();

        btn = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Successfully Created",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void OnClickListener() {
        texty = (TextView) findViewById(R.id.textView19);
        texty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Login.class);
                startActivity(intent);
            }
        });
    }


}
