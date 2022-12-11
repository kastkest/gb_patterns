package com.github.kastkest.gb.patterns.lesson_1.server;


import com.github.kastkest.gb.patterns.lesson_1.common.RequestHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private static String PATH = "/Users/macbook/IdeaProjects/first-geek-web-server/www";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started!");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected!");

                new Thread(new RequestHandler(socket, PATH)).start();

                System.out.println("Client disconnected!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
