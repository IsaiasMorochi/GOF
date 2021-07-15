package com.imorochi.gof.structural.proxy;

/*
* Proxy (AnimacionProxy) es el objeto que se sustituye por el sujeto real.
* Posee una interfaz identica al (Interfaz Sujeto).
* Se encarga de crear y de destruir al sujeto real y de delgarle los mensajes.
* */
public class AnimacionProxy implements Animacion {

    protected Video video = null;
    protected String foto = "Show photo";

    @Override
    public void display() {
        if (video != null) {
            video.display();
        } else {
            display(foto);
        }
    }

    @Override
    public void clic() {
        if (video == null) {
            video = new Video();
            video.load();
        }
        video.play();
    }

    public void display(String foto) {
        System.out.println(foto);
    }

}
