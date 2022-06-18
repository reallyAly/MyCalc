package br.edu.utfpr.aly;

import io.javalin.Javalin;

public class Test {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> ctx.result("Hello World"));
    }
}
