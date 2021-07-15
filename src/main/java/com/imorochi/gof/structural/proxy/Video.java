package com.imorochi.gof.structural.proxy;

/*
* SujetoReal (Video) es el objeto que el proxy controla y representa.
* */
public class Video implements Animacion {
    @Override
    public void display() {
        System.out.println("Show video");
    }

    @Override
    public void clic() {
        System.out.println("Clic Video");
    }

    public void load() {
        System.out.println("Upload the video.");
    }

    public void play(){
        System.out.println("Play the video.");
    }
}
