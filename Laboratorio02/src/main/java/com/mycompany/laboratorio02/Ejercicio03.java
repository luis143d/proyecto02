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
public class Ejercicio03 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de venta del producto: ");
        double valorVenta = scanner.nextDouble();
        double igv = 0.19; // IGV del 19%
        double precioVenta = valorVenta * (1 + igv);
        System.out.println("El precio de venta del producto es: " + precioVenta);
    }
}

