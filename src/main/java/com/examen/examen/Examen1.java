package com.examen.examen;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Examen1 {

    public void ejercicio1() {

        int num = 0;
        boolean entradaValida = false;
    
        try (Scanner entrada = new Scanner(System.in)) {
           while (!entradaValida) {
             try {
                System.out.println("Introduce un número");
                num = entrada.nextInt();
                entradaValida = true;
   

             } catch (InputMismatchException e) {
                    System.out.println("ERROR: Introduce un Valor Valido...");
                    entrada.next();
             }

            }
            if (num < 0){
                num = (num  * -1);

             }

             System.out.println("El Valor absoluto es " + num);
        }
    }
}
