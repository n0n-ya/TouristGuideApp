package com.example.myapplication.Domain;

public class Location {
    private int Id;
    private String Loc;





    public Location() {
    }

    @Override
    public String toString() {
        return Loc;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }
}
