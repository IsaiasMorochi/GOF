package com.imorochi.gof.behavioral.observer.v1;

public class Client {

    public static void main(String[] args) {

        Follower followerIsaias = new Follower("Isaias");
        Follower followerMario = new Follower("Mario");
        Follower followerMaria = new Follower("Maria");

        Channel channelTwitch = new Channel("Design Patterns", "Offline");
        channelTwitch.registerObserver(followerIsaias);
        channelTwitch.registerObserver(followerMario);
        channelTwitch.registerObserver(followerMaria);

        System.out.println("Channel: " + channelTwitch.getChannelName());
        System.out.println("Status: " + channelTwitch.getStatus());
        System.out.println("*******************");
        channelTwitch.setStatus("Online");
        System.out.println("*******************");
        System.out.println("Status: " + channelTwitch.getStatus());

        System.out.println("*******************");
        channelTwitch.removeObserver(followerMaria);
        channelTwitch.setStatus("Offline");
        System.out.println("*******************");
        System.out.println("Status: " + channelTwitch.getStatus());
    }
}
