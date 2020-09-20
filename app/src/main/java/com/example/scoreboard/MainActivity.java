package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final Button buttonLeft = findViewById(R.id.button);
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(buttonLeft.getText().toString())+1;
                buttonLeft.setText(String.valueOf(x));
            }
        });
        final Button buttonRight = findViewById(R.id.button2);
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(buttonRight.getText().toString())+1;
                buttonRight.setText(String.valueOf(x));
            }
        });
        final Button buttonReset = findViewById(R.id.button3);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonLeft.setText("0");
                buttonRight.setText("0");

                buttonLeft.setTextColor(Color.BLUE);
                buttonRight.setTextColor(Color.RED);
            }
        });
        final Button buttonChange = findViewById(R.id.button4);
        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = buttonLeft.getText().toString();
                String y = buttonRight.getText().toString();

                int btn1 = buttonLeft.getCurrentTextColor();
                int btn2 = buttonRight.getCurrentTextColor();
                
                buttonLeft.setText(y);
                buttonRight.setText(x);

                buttonLeft.setTextColor(btn2);
                buttonRight.setTextColor(btn1);
            }
        });
    }

}