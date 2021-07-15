package com.imorochi.gof.behavioral.observer.v2;

import java.util.List;

public class CommentaryObject implements Subject {
    private final List<Observer> observers;
    private String description;
    private final String subjectDetails;

    public CommentaryObject(List<Observer>observers, String subjectDetails){
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for(Observer observer : observers){
            observer.update(description);
        }
    }
    @Override
    public String subjectDetails() {
        return subjectDetails;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyObservers();
    }

}
