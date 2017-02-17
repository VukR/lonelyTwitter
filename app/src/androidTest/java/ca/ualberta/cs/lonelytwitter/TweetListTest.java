package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by Vuk on 2/14/2017.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another test tweet");

        tweets.add(tweet);
        Tweet returneedTweet = tweets.getTweet(0);

        assertEquals(returneedTweet.getMessage(), tweet.getMessage());
        assertEquals(returneedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last Tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings(){
        assertEquals("'test' should be 'test'", "test", "test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    //counts of number of tweets
    public void testCountTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        tweets.add(tweet);

        assertTrue("size return", 1 == (tweets.getCount()));
    }

    //return true if tweet already exists
    public void testHasTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        tweets.add(tweet);

        assertTrue("tweets are equal", tweets.hasTweet(tweet));
    }

    //checks for duplicate tweets,
    public void testAddTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        tweets.addTweet(tweet);
        try{
            tweets.addTweet(tweet);
            //if eception not caught, then test will fail here
            assertFalse(true);

        }catch(IllegalArgumentException e){

        }
    }

    //returns tweet list
    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");
        Tweet secondTweet = new NormalTweet("test tweet two");

        tweets.addTweet(secondTweet);
        tweets.addTweet(tweet);

        ArrayList<Tweet> newTweets = tweets.getTweets();
        assertNotSame(tweets, newTweets);
    }


}
