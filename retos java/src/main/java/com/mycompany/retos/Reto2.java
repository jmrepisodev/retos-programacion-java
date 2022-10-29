/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ¿ES UN ANAGRAMA?
 * 
 * Escribe una función que reciba dos palabras (String) y 
 * retorne verdadero o falso (Boolean) según sean o no anagrama.
 * 
 * @author José Miguel Repiso
 */
public class Reto2 {
    
    public Boolean isAnAnagrama(String palabra1, String palabra2){
      
       if(palabra1.equalsIgnoreCase(palabra2)) return false;
       //arrays de chars
       char[] arr1=palabra1.toCharArray();
       char[] arr2=palabra2.toCharArray();
       
       if(arr1.length!=arr2.length) return false;
       //ordena los arrays
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]) return false;   
        }
       
       return true;
    }
    
    
    
    public static void main(String[] args) {
        Reto2 reto=new Reto2();
        
        System.out.println("Palabra 1");
        Scanner sc=new Scanner(System.in);
        String palabra1=sc.nextLine();
        
        System.out.println("Palabra 2");
        String palabra2=sc.nextLine();
        
        Boolean resultado=reto.isAnAnagrama(palabra1,palabra2);
        
        if(resultado){
            System.out.println("Es anagrama");
        }else{
            System.out.println("No es anagrama");
        }
        
    }
}
