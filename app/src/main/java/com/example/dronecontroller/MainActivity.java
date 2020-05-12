package com.example.dronecontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // forward button event handler
        Button forward_button = findViewById(R.id.forward_button);
        forward_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("0");
            }
        });

        // backward button event handler
        Button backward_button = findViewById(R.id.backward_button);
        backward_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("1");
            }
        });

        // left button event handler
        Button left_button = findViewById(R.id.left_button);
        left_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("2");
            }
        });

        // right button event handler
        Button right_button = findViewById(R.id.right_button);
        right_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("3");
            }
        });

        // up button event handler
        Button up_button = findViewById(R.id.up_button);
        up_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("4");
            }
        });

        // down button event handler
        Button down_button = findViewById(R.id.down_button);
        down_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("5");
            }
        });

        // left rotation button event handler
        Button left_rot_button = findViewById(R.id.left_rot_button);
        left_rot_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("6");
            }
        });

        // right rotation button event handler
        Button right_rot_button = findViewById(R.id.right_rot_button);
        right_rot_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendCommand("7");
            }
        });
    }

    private void sendCommand(final String num) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    // convert number to bytes
                    byte buf[] = null;
                    buf = num.getBytes();

                    // create UDP socket
                    DatagramSocket sock = new DatagramSocket();

                    // address of WiFi module
                    InetAddress ip = InetAddress.getByName("192.168.4.1");

                    // create and send datagram
                    DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, 8888);
                    sock.send(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}

