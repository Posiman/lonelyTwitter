package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 * Class for regular tweets, when isImportant() returns True.
 * Has higher priority than NormalTweet.
 */
public class ImportantTweet extends Tweet implements Tweetable {

    /** @return TRUE */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    public ImportantTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    /**
     * @return the regular getMessage, with !IMPORTANT! before it
     */
    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }
}
