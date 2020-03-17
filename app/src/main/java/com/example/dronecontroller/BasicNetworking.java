package com.example.dronecontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class BasicNetworking {
    String host;
    int port;

    public BasicNetworking(String host, int port) throws IOException {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    Socket sock = new Socket(this.getHost(), this.getPort());

    OutputStream ostream = sock.getOutputStream();
    PrintWriter pwrite = new PrintWriter(ostream, true);

    public void SendCommand(int commandNum)
    {
        pwrite.println(commandNum);
        pwrite.flush();
    }

    // handle connection error message
    public BasicNetworking() throws IOException {
        System.out.println("Error: could not connect to socket...");
    }
}
