/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calfracciones;

import java.util.Scanner;

/**
 *
 * @author Noriega
 */
public class CalFracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fraccion frac1 = new Fraccion();
        Fraccion frac2 = new Fraccion();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---Calculadora de Fracciones---");
        
        System.out.println("Fraccion 1");
        System.out.println("Numerador");
        int numerador = leer.nextInt();
        frac1.setNumerador(numerador);
        System.out.println("Denominador");
        int denominador = leer.nextInt();
        frac1.setDenominador(denominador);
        
        System.out.println("Fraccion 2");
        System.out.println("Numerador");
        numerador = leer.nextInt();
        frac2.setNumerador(numerador);
        System.out.println("Denominador");
        denominador = leer.nextInt();
        frac2.setDenominador(denominador);
        
        Fraccion f1 = frac1.suma(frac2);
        Fraccion f2 = frac1.resta(frac2);
        Fraccion f3 = frac1.multi(frac2);
        Fraccion f4 = frac1.div(frac2);
       frac1.simplificar(f1, f2, f3, f4);
        System.out.println(frac1.toString(f1,f2,f3,f4));
    }
    
}
