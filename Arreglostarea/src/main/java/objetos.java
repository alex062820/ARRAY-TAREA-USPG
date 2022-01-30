/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Santos
 */
public class objetos {
    
    private String nombre;
    private int precio;
    private double descuento;
    
    public objetos(String nom, int pre, double des )
    {
    nombre=nom;
    precio=pre;
    descuento=des;
        
    
    }
    
    public String toString()
    {
         return nombre+","+precio+","+descuento;
    }
    
    
    
    
    
    
    
}
