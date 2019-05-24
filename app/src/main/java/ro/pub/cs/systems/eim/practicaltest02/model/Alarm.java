package ro.pub.cs.systems.eim.practicaltest02.model;

public class Alarm {
    private String hour;
    private String minute;

    public Alarm() {
        this.hour = null;
        this.minute = null;
    }

    public Alarm(String hour, String minute) {
        this.hour = hour;
        this.minute = minute;
    }
}
