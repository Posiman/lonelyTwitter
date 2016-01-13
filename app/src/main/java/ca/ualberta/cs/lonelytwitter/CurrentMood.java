package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by rbrewer on 1/12/16.
 */
public abstract class CurrentMood {
    private Date date;
    private String mood;

    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
