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
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de la raiz: ");
        double num = scanner.nextDouble();
        System.out.print("Ingrese el valor del radicando: ");
        double radicando = scanner.nextDouble();
        double resultado = Math.pow(num, 1.0/radicando);
        System.out.println("La raíz " + radicando + " de " + num + " es " + resultado);
    }
}
