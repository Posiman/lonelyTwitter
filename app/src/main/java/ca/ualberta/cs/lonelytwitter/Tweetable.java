package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * !!! Docs contained in /lonelyTwitter/doc !!!<br>
 * Created by romansky on 1/12/16.<br>
 * These files have been documented:
 * <ul><br>
 *     <li>- LonelyTwitterActivity</li><br>
 *     <li>- Tweet</li><br>
 *     <li>- NormalTweet</li><br>
 *     <li>- ImportantTweet</li><br>
 * </ul>
 */
public interface Tweetable {
    // getMessage returns the tweet message.
    public String getMessage();
    public Date getDate();
}
