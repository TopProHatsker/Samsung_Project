package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button apply_btn, settings_btn, menu_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apply_btn = findViewById(R.id.apply_btn_ID);
        settings_btn = findViewById(R.id.settings_btn_ID);
        menu_btn = findViewById(R.id.menu_tn_ID);

    }
}
