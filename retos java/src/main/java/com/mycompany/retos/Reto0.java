/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

/**
 *¿ES UN NÚMERO PRIMO?
 * 
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * A continuación, imprime los números primos entre 1 y 100.
 * 
 * @author José Miguel Repiso
 */
public class Reto0 {
    
    public boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero <2 || numero==4) {
          return false;
        }
        for (int i = 2; i < numero / 2; i++) {
     
          if (numero % i == 0) return false;
        }
        // Si solo es divisible por sí mismo (o por 1), sí es primo
        return true;
    }
    
    public static void main(String[] args) {
        Reto0 reto=new Reto0();
        
        for (int i = 0; i <= 100; i++) {
            if(reto.esPrimo(i)){
                System.out.println(i+" SI es primo");
            }else{
                System.out.println(i+" NO es primo");
            }
            
        }
    }
  
}
