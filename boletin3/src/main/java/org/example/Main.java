package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Bolentin22ej1

        double pagado, tarifa, porcent;

        Scanner entradaTec = new Scanner(System.in);
        System.out.println("introduce el precio pagado");
        pagado = entradaTec.nextDouble();

        System.out.println("introduce la tarifa");
        tarifa = entradaTec.nextDouble();

        porcent = 100 - ((pagado/tarifa)*100);


        System.out.println("El porcentaje realizado fue de: "+ porcent + "%");


//Boletin 22 ej2

double  c, ef, ek;
    Scanner eTec = new Scanner(System.in);

    System.out.println("ingresa la temperatura en ºC:");
        c = eTec.nextDouble();

        ef = ((c * 5)/9) + 32;
        System.out.println("La temperatura en farenheit es:" + ef + " grados farenheit");

        ek = (c + 273);
        System.out.println("La temperatura en kelvin es:" + ek + " grados kelvin");
*/
//Boletin 22 ej3
/*
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
*/

//

    }
}