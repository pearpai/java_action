package com.action.gaobingfachenxusheji.chapter05.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {
        ServerSocket echoServer = null;
        BufferedReader is = null;
        PrintWriter os = null;
        Socket clientSocket = null;

        try {
            echoServer = new ServerSocket(8000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                assert echoServer != null;
                clientSocket = echoServer.accept();
                System.out.println(clientSocket.getRemoteSocketAddress() + " connect!");
                is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                os = new PrintWriter(clientSocket.getOutputStream());

                // 从InputStream当中读取客户端所发送的数据
                String inputLine = null;
                while ((inputLine = is.readLine()) != null) {
                    os.println(inputLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("close connection");
                try {
                    if (is != null) is.close();
                    if (os != null) os.close();
                    assert clientSocket != null;
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }


}
