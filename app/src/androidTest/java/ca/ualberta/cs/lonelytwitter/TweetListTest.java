package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by rbrewer on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        //tweet = new NormalTweet("Test tweet");
        tweet = new NormalTweet("Test tweet 2");
        tweets.addTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        tweet = new NormalTweet("Test tweet 2");
        tweets.addTweet(tweet);

        ArrayList<Tweet> sortedTweets = tweets.getTweets(tweet);
        Date t1 = sortedTweets.get(0).getDate();
        Date t2 = sortedTweets.get(1).getDate();
        if(t1.equals(t2)) { }
        else {
            //assertTrue(t2.before(t1));
            assertTrue(t1.before(t2));
        };
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweets.hasTweet(tweet));

        tweets.addTweet(tweet);
        tweets.hasTweet(tweet);

        //assertFalse(tweets.hasTweet(tweet));
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testRemoveTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

        tweets.removeTweet(tweet);
        //assertTrue(tweets.hasTweet(tweet));
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        tweet = new NormalTweet("Test tweet 2");
        tweets.addTweet(tweet);

        tweets.getCount();

        //assertEquals(tweets.getCount(), 3);
        assertEquals(tweets.getCount(), 2);
    }

    public void testGetTweetIndex() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweetIndex(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

}
