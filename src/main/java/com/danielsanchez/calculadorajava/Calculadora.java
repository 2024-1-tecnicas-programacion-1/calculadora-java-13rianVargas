package com.danielsanchez.calculadorajava;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Calculadora {
    public static double calcular(int numero1, int numero2, char operacion) {
        double respuesta = 0;
        switch (operacion) {
            case '+' :
                // Operación suma:
                respuesta = numero1 + numero2;
                break;
            case '-' :
                // Operación resta:
                respuesta = numero1 - numero2;
                break;
            case '*' :
                // Operación multiplicación:
                respuesta = numero1 * numero2;
                break;
            case '/' :
                // Operación división:
                respuesta = (double) numero1 / numero2;
                break;
            case '^' :
                // Operación potencia:
                respuesta = (double) Math.pow(numero1,numero2);
                break;
            case '%' :
                // Operación residuo:
                respuesta = (double) numero1 % numero2;
                break;   
            default:
                throw new IllegalArgumentException("Operación inválida.");
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Lectura del valor de 2 variables enteras por consola:
        System.out.println("Ingrese el número 1");
        int numero1 = lector.nextInt();
        System.out.println("Ingrese el número 2");
        int numero2 = lector.nextInt();
        
        // Lectura de la operación a realizar
        // TODO: DEBES ADICIONAR EL SÍMBOLO DE ^ Y % PARA CALCULAR LA POTENCIA Y EL MÓDULO
        System.out.println("Ingrese la operación (+, -, *, /)");
        char operacion = lector.next().charAt(0);
        
        double respuesta = calcular(numero1, numero2, operacion);
        System.out.println("La respuesta es " + respuesta);
    }
}
