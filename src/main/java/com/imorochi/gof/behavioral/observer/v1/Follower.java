package com.imorochi.gof.behavioral.observer.v1;

public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println("Send message to "+ getFollowerName()+" that Channel "+ status);
    }

    public void play() {
        System.out.println("Play Channel to ");
    }

}
