package main;

import core.Avion;
import core.Bulto;

public class Main {
    public static void main(String[] args) {
        Avion boing747 = new Avion("boing");
        Bulto bulto1 = new Bulto(600.00);
        Bulto bulto2 = new Bulto(100.00);
        Bulto bulto3 = new Bulto(400.00);
        Bulto bulto4 = new Bulto(700.00);
        Bulto bulto5 = new Bulto(50.00);
        Bulto bulto6 = new Bulto(40.00);
        Bulto bulto7 = new Bulto(60.00);
        Bulto bulto8 = new Bulto(10.00);
        Bulto bulto9 = new Bulto(490.00);
        Bulto bulto10 = new Bulto(660.00);
        Bulto bulto11 = new Bulto(110.00);
        Bulto bulto12 = new Bulto(470.00);
        Bulto bulto13 = new Bulto(690.00);
        Bulto bulto14 = new Bulto(190.00);
        Bulto bulto15 = new Bulto(450.00);

        boing747.agregarBulto(bulto1);
        boing747.agregarBulto(bulto2);
        boing747.agregarBulto(bulto3);
        boing747.agregarBulto(bulto5);
        boing747.agregarBulto(bulto6);
        boing747.agregarBulto(bulto7);
        boing747.agregarBulto(bulto8);
        boing747.agregarBulto(bulto9);
        boing747.agregarBulto(bulto10);
        boing747.agregarBulto(bulto11);
        boing747.agregarBulto(bulto12);
        boing747.agregarBulto(bulto13);
        boing747.agregarBulto(bulto14);
        boing747.agregarBulto(bulto15);


        boing747.informacionDelVuelo();

    }
}
