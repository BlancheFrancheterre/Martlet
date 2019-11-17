package com.example.hackathon;

public class Sweater {
    private String color;
    private char size;
    private boolean hygiene;
    private static String[] colors = {"red", "grey" ,"blue" , "black"};
    private static char[] sizes = {'S','M','L'};
    public Sweater(String color, char size, boolean hygiene) {
        this.color = color;
        this.size = size;
        this.hygiene = hygiene;
    }
    public String getColor() {
        return this.color;
    }
    public char getSize() {
        return this.size;
    }
    public boolean getHygiene() {
        return this.hygiene;
    }
    public void setColor(String color) {
        if (color.equals("red") || color.equals("black") || color.equals("grey") || color.equals("blue")) {
            this.color = color;
        } else {
            System.out.println("The McGill Sweater has only four possible colors : red, blue, grey and black");
        }
    }
    public void setSize(char size) {
        if (size == 'S' || size == 'M' || size == 'L') {
            this.size = size;
        } else {
            System.out.println("The McGill Sweater has only three possible sizes : S,M and L.");
        }
    }
    public void setHygiene(boolean hygiene) {
        this.hygiene = hygiene;
    }
}