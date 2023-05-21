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
public class Ejercicio01 {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número: ");
            int a = scanner.nextInt();
            
            System.out.println("Ingrese el segundo número: ");
            int b = scanner.nextInt();
            
            int sum = a + b;
            System.out.println("La suma de " + a + " y " + b + " es " + sum);
        }
    }
}

