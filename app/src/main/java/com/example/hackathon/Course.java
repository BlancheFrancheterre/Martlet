package com.example.hackathon;

public class Course {
    double classAverage;
    double levelOfDifficulty;	//from 1 to 5
    String courseCode;
    String subject;

    public Course(String courseCode, String subject, double classAverage, double levelOfDifficulty){
        this.classAverage = classAverage;
        this.courseCode = courseCode;
        this.levelOfDifficulty = levelOfDifficulty;
        this.subject = subject;
    }
    public double getclassAverage() {
        return this.classAverage;
    }
    public String getcourseCode() {
        return this.courseCode;
    }
    public double getlevelOfDifficulty() {
        return this.levelOfDifficulty;
    }
}