package com.example.dronecontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BasicNetworking connection = null;
        try {
            connection = new BasicNetworking("192.168.4.1", 70);
        } catch (IOException e) {
            e.printStackTrace();
        }
        final BasicNetworking finalConnection = connection;

        // forward button event handler
        Button forward_button = findViewById(R.id.forward_button);
        forward_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(0);
            }
        });

        // backward button event handler
        Button backward_button = findViewById(R.id.backward_button);
        backward_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(1);
            }
        });

        // left button event handler
        Button left_button = findViewById(R.id.left_button);
        left_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(2);
            }
        });

        // right button event handler
        Button right_button = findViewById(R.id.right_button);
        right_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(3);
            }
        });

        // up button event handler
        Button up_button = findViewById(R.id.up_button);
        up_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(4);
            }
        });

        // down button event handler
        Button down_button = findViewById(R.id.down_button);
        down_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(5);
            }
        });

        // left rotation button event handler
        Button left_rot_button = findViewById(R.id.left_rot_button);
        left_rot_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(6);
            }
        });

        // right rotation button event handler
        Button right_rot_button = findViewById(R.id.right_rot_button);
        right_rot_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finalConnection.SendCommand(7);
            }
        });

    }
}

