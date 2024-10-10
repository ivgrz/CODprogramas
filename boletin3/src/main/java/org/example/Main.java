package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Bolentin22ej1
        Double pagado, tarifa, porcent;

        Scanner entradaTec = new Scanner(System.in);
        System.out.println("introduce el precio pagado");
        pagado = entradaTec.nextDouble();

        System.out.println("introduce la tarifa");
        tarifa = entradaTec.nextDouble();

        porcent = 100 - ((pagado/tarifa) * 100);
        System.out.println("El porcentaje realizado fue de: "+ porcent + "%");
//Boletin 22 ej2







    }
}