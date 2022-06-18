package br.edu.utfpr.aly.api;

import io.javalin.Javalin;

public class Start {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
