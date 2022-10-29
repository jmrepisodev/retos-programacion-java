/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

import java.util.ArrayList;
import java.util.Arrays;
import javax.security.auth.callback.TextOutputCallback;

/**
 * Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Por ejemplo, si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 * 
 * @author Jose Miguel Repiso
 */
public class Reto6 {
   
   //primera forma
    public String reverseString (String text){
        String textToReverse ="";
        char[] array1=text.toCharArray();
        
        for(int i=array1.length-1;i>=0;i--){
            //casting implícito de Char a String
            textToReverse+=array1[i];
        }
        
        return textToReverse;
       
    }
    
    //otra forma
     public String reverseString2 (String text){
        String textToReverse ="";
        int count=text.length();
        
        //System.out.println(count);
         
        for(int i=count;i>0;i--){
            //extrae una subcadena (índice inicio, índice final(no incluído))
            textToReverse+=text.substring((i-1),i);
        }
        
        return textToReverse;
       
    }
    
    public static void main(String[] args) {
        Reto6 reto=new Reto6();
        String texto=reto.reverseString2("hola mundo");
        System.out.println(texto);
    }
    
}
