/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio02;

import java.util.Scanner;

/**
 *
 * @author LUIS FERNANDO SINTICALA OLIVA
 */
public class Ejercicio02 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el dividendo: ");
            int dividend = scanner.nextInt();
            
            System.out.println("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            
            System.out.println("El resultado de la división es: " + quotient);
            System.out.println("El residuo de la división es: " + remainder);
        }
    }
}


