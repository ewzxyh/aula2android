package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class NewActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aula_teste);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> finish());
    }
}
