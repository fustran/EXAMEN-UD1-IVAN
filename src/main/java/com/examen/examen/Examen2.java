package com.examen.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen2 {

    public void ejercicio2() {

        int nota1 ;
        int nota2 ;
        int nota3 ;
        int suma = 0;
        int notaMedia ;       
        boolean entradaValida = false;
    
        try (Scanner entrada = new Scanner(System.in)) {
           while (!entradaValida) {
             try {
                System.out.println("Introduce la nota del primer trimestre");
                nota1 = entrada.nextInt();
                

                System.out.println("Introduce la nota del segundo trimestre");
                nota2 = entrada.nextInt();

                System.out.println("Introduce la nota del tercer trimestre");
                nota3 = entrada.nextInt();

                suma = ((nota1 + nota2 + nota3) / 3);

                if (suma < 5){
                    System.out.println("Lo siento, nota media inferior a 5");
                } else if (suma >= 5){
                    System.out.println("Has aprobado, tu nota media es igual o superior a 5");

                }
                entradaValida = true;
   

             } catch (InputMismatchException e) {
                    System.out.println("ERROR: No se pueden introducir letras...");
                    entrada.next();
             }
            
           }

        }
    }
}
