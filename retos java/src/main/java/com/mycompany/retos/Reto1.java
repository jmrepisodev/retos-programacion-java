/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

/**
 * EL FAMOSO FIZZBUZZ
 * 
 * Escribe un programa que muestre en pantalla los números del 1 al 100, 
 * sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por “buzz” 
 * y los múltiplos de ambos, es decir, los múltiplos de 3 y 5, por la palabra “fizzbuzz”.
 * 
 * @author José Miguel Repiso
 */
public class Reto1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FIZZBUZZ");
            }else if(i%5==0){
                System.out.println("BUZZ"); 
            }else if(i%3==0){
                System.out.println("FIZZ");
            }else{
                System.out.println(i);
            }
            
        }
    }
}
