/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Santos
 */
public class principal {
    
     public static void main(String[] args) 
     {
       objetos arr[]={new objetos("pc",100,10), new objetos("cpu",200,20),
         new objetos("teclado",300,30),new objetos("mouse",400,40),new objetos("webcam",500,50), 
         new objetos("bocinas",600,60)};
               
     for(int i=0;i<arr.length;i++)
               {
                  System.out.println(arr[i]);
                 }
    
     
     
     }
    
}
