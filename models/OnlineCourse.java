package models;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String title, int duration, String platform) {
        super(title, duration);
        this.platform = platform;
    }

    public OnlineCourse(String title, int duration, String professor, String platform) {
        super(title, duration, professor);
        this.platform = platform;
    }

    @Override 
    public String showInformation() {
        return "[Online] " + super.showInformation() + " - Platform: " + platform;
    }
}