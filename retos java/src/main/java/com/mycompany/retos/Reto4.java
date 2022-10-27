/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

/**
 * 
 * ÁREA DE UN POLÍGONO
 * 
 * Crea UNA ÚNICA FUNCIÓN que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 * 
 * @author Jose Miguel Repiso
 */
public class Reto4 {
    public interface Area{
        public float calcularArea(float base, float altura);
    }
    
    
    public static class Triangule implements Area{

        @Override
        public float calcularArea(float base, float altura) {
           
            return (base*altura)/2;
        }

    }
    
    public static class Rectangule implements Area{

        @Override
        public float calcularArea(float base, float altura) {
            
            return base*altura;
        }
    
    }
    
    public static void main(String[] args) {
        Rectangule r=new Rectangule();
        float area=r.calcularArea(3, 4);
        
        System.out.println(area);
        
    }
}
