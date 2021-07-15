package com.imorochi.gof.behavioral.observer.v2;

public interface Observer {
    void update(String description);
    void subscribe();
    void unSubscribe();
}
