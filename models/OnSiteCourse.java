package models;

public class OnSiteCourse extends Course {
    private String room;
    private int maxQuota;

    public OnSiteCourse(String title, int duration, String room, int maxQuota) {
        super(title, duration);
        this.room = room;
        this.maxQuota = maxQuota;
    }

    public OnSiteCourse(String title, int duration, String professor, String room, int maxQuota) {
        super(title, duration, professor);
        this.room = room;
        this.maxQuota = maxQuota;
    }

    @Override
    public String showInformation() {
        return "[OnSite] " + super.showInformation() + " - Room: " + room + ", Quota: " + maxQuota;
    }
}