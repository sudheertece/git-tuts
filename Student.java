package com.learnjava.data;

import java.util.List;

public class Student {
    private String name;
    private Integer gradeLevel;
    private double gpa;
    private String gender;


    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    private List<String> activities;
    private int noteBooks;

    public Student(String name, Integer gradeLevel, double gpa, String gender, List<String> activities, int noteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBooks = noteBooks;
    }

    public Student(String name, Integer gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void printListOfActivities(){
        System.out.println(activities);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                '}';
    }
}
