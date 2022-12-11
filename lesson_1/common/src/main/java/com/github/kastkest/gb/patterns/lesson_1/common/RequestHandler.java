package com.github.kastkest.gb.patterns.lesson_1.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class RequestHandler implements Runnable {
    private Socket socket;
    private String localPath;

    public RequestHandler(Socket socket, String localPath) {
        this.socket = socket;
        this.localPath = localPath;
    }

    @Override
    public void run() {
        try (BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter output = new PrintWriter(socket.getOutputStream())) {
            while (!input.ready()) ;

            String firstLine = input.readLine();
            String[] parts = firstLine.split(" ");
            System.out.println(firstLine);
            while (input.ready()) {
                System.out.println(input.readLine());
            }

            Path path = Paths.get(localPath, parts[1]);
            if (!Files.exists(path)) {
                statusError(output);
            } else {
                statusOk(output);
            }

            Files.newBufferedReader(path).transferTo(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void statusError(PrintWriter output) {
        output.println("HTTP/1.1 404 NOT_FOUND");
        output.println("Content-Type: text/html; charset=utf-8");
        output.println();
        output.println("<h1>Файл не найден!</h1>");
        output.flush();
        return;
    }

    private void statusOk(PrintWriter output) {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: text/html; charset=utf-8");
        output.println();
    }
}
