package com.example.demo.dp;

public class Client {

    public static Client instance;

    public Client() {

    }

    public static synchronized Client getInstance() {
        if (instance == null) {
            instance = new Client();
        }
        return instance;

    }
}
