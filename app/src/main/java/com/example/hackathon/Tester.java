package com.example.hackathon;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        String[] nightclubs = {"Café Campus", "Suwu", "Madame Lee","Kampai","Tokyo","Mayfair", "New City Gas", "Salon Daomé","Newspeak","Ecole privée","Stereo","Foufounes Electriques"};

        System.out.println("You decided to go out, it is going to be fun!");;
        System.out.println("Don't forget to be an active bystander.");
        Random r = new Random();
        int randomNumber = r.nextInt(nightclubs.length);
        System.out.println("♬ Tonight, let's go to " + nightclubs[randomNumber] + " ♬");
    }
}
