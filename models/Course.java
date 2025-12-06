package models;

public class Course {
    private String title;
    private int duration;
    private String professor;

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.professor = "unassigned";
    }

    public Course(String title, int duration, String professor) {
        this.title = title;
        this.duration = duration;
        this.professor = professor;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String showInformation() {
        return title + " (" + duration + " hs) - Professor: " + professor;
    }
}