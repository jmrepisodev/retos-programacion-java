/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

import java.util.ArrayList;

/**
 * SUCECIÓN DE FIBONACCI
 * 
 * Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 * 
 * @author Jose Miguel Repiso
 */
public class Reto3 {
    ArrayList<Integer> listaNumeros=new ArrayList();
    int numero=0;
    public void serieFibonacci(){
       for(int i=0;i<50;i++){
           if(i>1){ 
               //suma número última posición + número penúltima posición del array
               numero=(listaNumeros.get(listaNumeros.size()-1)) + (listaNumeros.get(listaNumeros.size()-2));
           }else{
               numero=i;
           }
           //agrega los números al array
           listaNumeros.add(numero);  
        }
       
        System.out.println("Total elementos: " + listaNumeros.size());
        
        for (int n: listaNumeros){
            System.out.println(n);
        };
    
    }
    
    public static void main(String[] args) {
        Reto3 reto=new Reto3();
        reto.serieFibonacci();
    }
}
