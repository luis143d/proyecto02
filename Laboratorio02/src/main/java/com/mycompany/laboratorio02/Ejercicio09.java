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
public class Ejercicio09 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();
        
        int horas = segundos / 3600;
        int segundosRestantes = segundos % 3600;
        int minutos = segundosRestantes / 60;
        segundosRestantes = segundosRestantes % 60;
        
        System.out.println(segundos + " segundos son " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");
    }
}


