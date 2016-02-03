package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 * Sets up an abstract class for tweets, extended by:
 * <ul>
 *     <li>NormalTweet</li>
 *     <li>ImportantTweet</li>
 * </ul>
 * Includes a date and message, and an unimplemented mood.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;
    private ArrayList<CurrentMood> moods;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }


    /**
     * @deprecated
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * @deprecated
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the current date, user cannot enter custom date
     * @return current cate
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Gets message which user inputted
     * @return user's message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Converts date to string and returns it in the following format: <br>
     *     Current date | This is user's message
     * @return string consisting of date and message
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }


}
