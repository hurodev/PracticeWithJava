package OpenBootCamp;

import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {

        double iva = 1.16;


    Scanner scan = new Scanner(System.in);

    System.out.println("ingresa el precio:");

    float precio = scan.nextFloat();

    System.out.println("el precio con iva es de " + (precio * iva));





    }



}
