package com.imorochi.gof.behavioral.observer.v2;

public interface Subject {
    void subscribeObserver(Observer observer);
    void unSubscribeObserver(Observer observer);
    void notifyObservers();
    String subjectDetails();
}
