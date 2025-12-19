package hashMap.mediumProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class designTwitter {
    int time;
    HashMap<Integer,ArrayList<int[]>> tweets;
    HashMap<Integer,HashSet<Integer>> followMap;
    public Twitter() {
        time=0;
        tweets=new HashMap<>();
        followMap=new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId,new ArrayList<>());
        tweets.get(userId).add(new int[]{tweetId,time++});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        HashSet<Integer>followees=followMap.getOrDefault(userId,new HashSet<>());
        followees.add(userId);
        for(Integer followeeId:followees){
            ArrayList<int[]>tweetList=tweets.getOrDefault(followeeId,new ArrayList<>());
            for(int [] arr:tweetList){
                pq.add(arr);
                if(pq.size()>10)
                pq.poll();
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!pq.isEmpty()){
           ans.add(0,pq.poll()[0]);
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId,new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId))
        followMap.get(followerId).remove(followeeId);
    }
}
