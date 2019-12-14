package com.omnexyinc;

public class State {
    private String short_name;
    private String name;

    public State(String short_name, String name) {
        this.short_name = short_name;
        this.name = name;
    }

    public String getShortName() {
        return this.short_name;
    }

    public void setShortName(String short_name) {
        this.short_name = short_name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}