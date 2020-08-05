package com.Eragoo.MclautBot.command;

public enum Commands {
    START("/start");

    Commands(String name) {
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }
}
