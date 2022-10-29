/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retos;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * OBTENER RELACIÓN DE ASPECTO DE UNA IMAGEN ONLINE
 * 
 * Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 * 
 * @author Jose Miguel Repiso
 */
public class Reto5 {
    
    //primera forma
    public void saveImage(String imageUrl){
    
        try {
            //Obtiene el recurso de la URL
            URL url=new URL(imageUrl);
            String fileName=url.getFile();
            //recorta el nombre y genera la ruta de destino
            String destName = "./images"+ fileName.substring(fileName.lastIndexOf("/"));
            System.out.println(destName);
            //genera un flujo I/O de datos
            InputStream in = url.openStream();
            OutputStream out = new FileOutputStream(destName);

            byte[] buffer = new byte[2048];
            int length;
            //Guarda el archivo de imagen
            while ((length = in.read(buffer)) != -1) {
               out.write(buffer,0,length);
            }

            out.close();
            in.close();
            
            BufferedImage readImage = null;

            try {
                readImage = ImageIO.read(new File(destName));
                int h = readImage.getHeight();
                int w = readImage.getWidth();
                
                System.out.println("altura: "+h + " ancho: "+w);
                
                int ancho=w/256;
                int alto=h/256;
                
            
                System.out.println("Relacion de aspecto: "+ ancho+"/"+alto);
            } catch (Exception e) {
                 System.out.println("Exception occured :" + e.getMessage());
            }
           
            
        } catch (MalformedURLException ex){
             System.out.println("Exception occured :" + ex.getMessage());
        }catch (FileNotFoundException ex1) {
            System.out.println("Exception occured :" + ex1.getMessage());
        }catch(IOException ex2){
             System.out.println("Exception occured :" + ex2.getMessage());
        }
    
    };
    
    //segunda forma
    public void saveImage2(String imageurl){
        BufferedImage image=null;
        try {
            URL url=new URL(imageurl);
            String fileName=url.getFile();
            String destName = "./images"+ fileName.substring(fileName.lastIndexOf("/"));
            
            image=ImageIO.read(url);
            
            BufferedImage writeImage=null;
            
            ImageIO.write(image, "png", new File(destName));
            
        } catch (MalformedURLException ex) {
            System.out.println("Exception occured :" + ex.getMessage());
        }catch (FileNotFoundException ex1) {
            System.out.println("Exception occured :" + ex1.getMessage());
        }catch(IOException ex2){
             System.out.println("Exception occured :" + ex2.getMessage());
        }
        
    }
    
    
    public static void main(String[] args) throws IOException {
        Reto5 reto=new Reto5();
        String imageUrl="https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
        reto.saveImage(imageUrl);
    } 
        
    
    
   
}
