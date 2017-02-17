package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by Vuk on 2/14/2017.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }


    public int getCount() {
        return tweets.size();
    }

    public void addTweet(Tweet tweet) {
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException("Duplicate tweet");
        }
        else{
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }
}



