package com.imorochi.gof.behavioral.observer.v2;

import java.util.ArrayList;

public class ClientCommentary {

    public static void main(String[] args) {


        CommentaryObject commentarySubject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Chile - Bolivia");

        Observer observer1 = new SMSUsers(commentarySubject, "Adam Warner [New York]");
        observer1.subscribe();

        System.out.println();
        Observer observer2 = new SMSUsers(commentarySubject, "Tim Ronney [London]");
        observer2.subscribe();

        commentarySubject.setDescription("Hla");

        commentarySubject.setDescription("Welcome to live Soccer match");
        commentarySubject.setDescription("Current score 0-0");
        System.out.println();
        observer2.unSubscribe();
        System.out.println();

        commentarySubject.setDescription("It’s a goal!!");
        commentarySubject.setDescription("Current score 1-0");

        System.out.println();


        Observer observer3 = new SMSUsers(commentarySubject, "Marrie [Paris]");
        observer3.subscribe();
        System.out.println();
        commentarySubject.setDescription("It’s another goal!!");
        commentarySubject.setDescription("Half-time score 2-0");
    }
}
