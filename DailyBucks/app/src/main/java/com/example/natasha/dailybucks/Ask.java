package com.example.natasha.dailybucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Ask extends AppCompatActivity {

    private static Button button;
    private static TextView texty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);
        OnClickButtonListener();
        OnClickTextListener();


    }

    public void OnClickButtonListener() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Splash.class);
                startActivity(intent);
            }
        });
    }
    public void OnClickTextListener() {
        texty = (TextView) findViewById(R.id.textView4);
        texty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Splash.class);
                startActivity(intent);
            }
        });
    }
}
