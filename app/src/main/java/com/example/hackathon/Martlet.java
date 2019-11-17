package com.example.hackathon;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Martlet implements Serializable {
    // characteristics
    private String name;
    private int age;
    private Course[] courses;
    private Sweater sweater;
    private String color;
    private String faculty;
    private int id;

    //private Faculty faculty;
    private double GPA;
    private int phoneNumber;
    // daily levels of energy
    private int energy; // de 0 à 100
    private double socialStatus;
    private double hygieneStatus; // de 0.0 à 10.0
    private double healthStatus; // de 0.0 à 10.0
    private double academicStatus; // de 0.0 à 10.0
    private double entertainmentStatus; // DE 0.0 à 10.0
    //private double experience;
    private final double MAX = 10.0;
    private final String[] nightclubs = {"Café Campus", "Suwu", "Madame Lee","Kampai","Tokyo","Mayfair", "New City Gas", "Salon Daomé","Newspeak","Ecole privée","Stereo","Foufounes Electriques","Muzique","Le Rouge Bar","La P'tite Grenouille","Flyjin","Apt 200"};
    // constructor with complete inputs
    public Martlet(String name, int id){
        this.id = id;
        this.name = name;
        this.age = 1;
        /*this.courses = courses;
        this.faculty = faculty;
        this.sweater = sweater;
        this.color = color;*/
        this.GPA = 0.0;
        this.energy = 100;
        this.academicStatus = 0.0;
        this.entertainmentStatus = MAX;
        this.healthStatus = MAX;
        this.hygieneStatus = MAX;
        this.socialStatus = MAX;
        //this.experience = 0.0;
        //Store the data of the Martlet in a CSV file
/*
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            try{
                FileWriter fw = new FileWriter(filename);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(this.ID+", "+this.name+", "+this.age+", "+this.courses+", "+this.faculty+", "+this.sweater+", "+this.color);
                bw.close();
                fw.close();
            }catch(IOException e){
                System.out.println("Could not create the Martlet")
            }
*/
    }

    public String getName() {
        return this.name;
    }
    public Sweater getSweater() {
        return this.sweater;
    }
    public String getcolor() {
        return this.color;
    }
    public String getfaculty() {
        return this.faculty;
    }
    public int getID() {
        return this.id;
    }
    public void washSweater() {
        System.out.println("Do you want to wash your Mcgill Sweater ? y/n");
        Scanner sc = new Scanner(System.in);
        char answer = sc.next().charAt(0);
        if (answer == 'y') {
            System.out.println("Vrooooom... Your McGill Sweater is all cleaned up!");
            this.hygieneStatus = MAX;
        } else {
            System.out.println("Okay, but don't forget : a healthy body is the start for a healthy mind!");
        }
    }
    public void checkHygiene() {
        if (this.hygieneStatus < 4.0) {
            washSweater();
        } else {
            System.out.println("You are still pretty clean !");
        }
    }
    public void party() {
        if (this.energy > 30) {
            System.out.println("Do you want to go out? y/n");;
            Scanner sc = new Scanner(System.in);
            char answer = sc.next().charAt(0);
            if (answer == 'n') {
                System.out.println("Okay, that's probably a wise decision.");
                System.out.println("It is not recommended to go out before exams, or when you need to get some sleep.");
                System.out.println("But don't forget to go out with your friends once in a while. You also need to have fun and enjoy McGill's night life.");
                return;
            } else if (answer == 'y'){
                System.out.println("You decided to go out, it is going to be fun!");;
                System.out.println("Don't forget to be an active bystander.");
                Random r = new Random();
                int randomNumber = r.nextInt(nightclubs.length);
                System.out.println("♬ Tonight, let's go to " + nightclubs[randomNumber] + " ♬");
                if (this.socialStatus < MAX)
                    this.socialStatus = MAX;
                this.energy = this.energy - 50;
                this.hygieneStatus = this.hygieneStatus - 5.0;
            }
        } else {
            System.out.println("Sorry, but I am too tired to go out right now...");
            sleep();
        }
    }
    public void sleep() {
        if (this.energy <= 0) {
            System.out.print("I am... sooo.... tired ...");
            System.out.println(":zzz: Good Night :zzz:");
            this.energy = 100;
            return;
        } else {
            System.out.print("Do you want to go to sleep ? y/n");
            Scanner sc = new Scanner(System.in);
            char answer = sc.next().charAt(0);
            if (answer == 'y') {
                this.energy = 0;
                sleep();
            } else {
                System.out.println("Okay, what do you want to do now?");
            }
        }
    }
    public void wakeup() {
        System.out.println("Good morning sunshine");
    }
    public void eat() {
        System.out.println("Yum Yum");
        this.energy=100;
    }
    public void gym() {
        System.out.print("What do you want to do? running/salsa/foot");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer == "running" || answer == "RUNNING") {
            this.energy = this.energy-10;
            this.healthStatus= this.healthStatus+5;
            System.out.println("What a nice run");
        }
        if (answer == "foot" || answer == "FOOT") {
            this.energy = this.energy-5;
            this.healthStatus= this.healthStatus+2;
            System.out.println("What a match, you aced it");
        }
        if (answer == "salsa" || answer == "SALSA") {
            this.energy = this.energy-10;
            this.healthStatus= this.healthStatus+5;
            this.entertainmentStatus=this.entertainmentStatus+2;
            System.out.println("Having fun while doing sport, that's cool");
        }
    }
    public void work() {
        if (this.academicStatus == 10.0) {
            System.out.println("Do you want to take your exam ? y/n");
            Scanner sc = new Scanner(System.in);
            char answer = sc.next().charAt(0);
            if (answer == 'y') {
                // Martlet.exam(this.academicStatus, this.healthStatus, this.hygieneStatus, this.socialStatus, this.entertainmentStatus, this.energy);
            } else {
                System.out.println("Okay no problem, it is always better to be at its best to take an exam!");
                System.out.println("Remember to sleep well before the exam.");
                System.out.println("Don't forget to eat and drink too, you don't want to be dehydrated or hungry to focuse well.");
            }
        }
    }
}