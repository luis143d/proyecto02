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
public class Ejercicio07 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el capital inicial: ");
        double capital = scanner.nextDouble();
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasa = scanner.nextDouble();
        System.out.print("Ingrese el tiempo en años: ");
        double tiempo = scanner.nextDouble();
        
        double montoTotal = capital * Math.pow(1 + tasa/100, tiempo);
        double interesCompuesto = montoTotal - capital;
        
        System.out.println("El monto total es: " + montoTotal);
        System.out.println("El interés es: " + interesCompuesto);
    }
}


