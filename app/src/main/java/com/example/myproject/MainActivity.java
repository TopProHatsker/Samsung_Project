package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button apply_btn, settings_btn, menu_btn;
    SeekBar bright_val, R_val, G_val, B_val;
    Switch mode_switch;
    TextView bright_val_text, R_val_text, G_val_text, B_val_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apply_btn = findViewById(R.id.apply_btn_ID);
        settings_btn = findViewById(R.id.settings_btn_ID);
        menu_btn = findViewById(R.id.menu_tn_ID);

        apply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("btn", "apply");
            }
        });
        settings_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("btn", "settings");
            }
        });
        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("btn", "menu");
            }
        });

        bright_val = findViewById(R.id.bright);
        R_val = findViewById(R.id.R);
        G_val = findViewById(R.id.G);
        B_val = findViewById(R.id.B);

        bright_val.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bright_val_text.setText(bright_val.getProgress()+"%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        R_val.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                R_val_text.setText(R_val.getProgress()+"%");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        bright_val_text = findViewById(R.id.bright_val);
        bright_val_text.setText(bright_val.getProgress()+"%");
        R_val_text = findViewById(R.id.R_val);
        R_val_text.setText(R_val.getProgress()+"%");
        G_val_text = findViewById(R.id.G_val);
        G_val_text.setText(G_val.getProgress()+"%");
        B_val_text = findViewById(R.id.B_val);
        B_val_text.setText(B_val.getProgress()+"%");


        mode_switch = findViewById(R.id.mode_switch);

    }
}
