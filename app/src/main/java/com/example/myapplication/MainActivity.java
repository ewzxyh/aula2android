package com.example.myapplication;

import static com.example.myapplication.R.id;
import static com.example.myapplication.R.layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        TextView alterar = findViewById(id.aula2);
        alterar.setOnClickListener(view -> {
        Intent main = new Intent(MainActivity.this, NewActivity.class);
        startActivity(main);
        });
    }
}