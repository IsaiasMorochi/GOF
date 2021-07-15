package com.imorochi.gof.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.display();
        animacion.clic();
        animacion.display();
    }
}
