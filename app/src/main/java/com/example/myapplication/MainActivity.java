package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton lotr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lotr=(ImageButton) findViewById(R.id.film);

        lotr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity2();

            }
        });

    }
    public void activity2(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
