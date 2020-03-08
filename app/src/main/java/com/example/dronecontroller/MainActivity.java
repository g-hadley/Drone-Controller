package com.example.dronecontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // forward button event handler
        Button forward_button = (Button) findViewById(R.id.forward_button);
        forward_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // backward button event handler
        Button backward_button = (Button) findViewById(R.id.backward_button);
        backward_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // left button event handler
        Button left_button = (Button) findViewById(R.id.left_button);
        left_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // right button event handler
        Button right_button = (Button) findViewById(R.id.right_button);
        right_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // up button event handler
        Button up_button = (Button) findViewById(R.id.up_button);
        up_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // down button event handler
        Button down_button = (Button) findViewById(R.id.down_button);
        down_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // left rotation button event handler
        Button left_rot_button = (Button) findViewById(R.id.left_rot_button);
        left_rot_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

        // right rotation button event handler
        Button right_rot_button = (Button) findViewById(R.id.right_rot_button);
        right_rot_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
            }
        });

    }
}

