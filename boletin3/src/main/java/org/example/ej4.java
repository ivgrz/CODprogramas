package org.example;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        double x, y,z, d, r;
        Scanner tec = new Scanner(System.in);
        System.out.println("introduce la cantidad de billetes de 100");
        x = tec.nextDouble();

        System.out.println("introduce la cantidad de billetes de 20");
        y = tec.nextDouble();

        System.out.println("introduce la cantidad de billetes de 5");
        z = tec.nextDouble();

        System.out.println("introduce la cantidad de monedas de 1");
        d = tec.nextDouble();

        r = (x * 100) + (20 * y) + (5 * z) + (1 * d);
        System.out.println("tu cantidad de dinero es: " + r);


    }
}
