/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author chave
 */
public class Producto {
    private final String marca;
    private final String nombre;
    private final double precio;
    
    public Producto(String marca,String nombre,double precio){
        this.nombre= nombre;
        this.marca = marca;
        this.precio =precio;    
    }
    public String getMarca(){
        return  marca;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    private static String padRight(String str, int length, char padChar) {
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < length) {
            sb.append(padChar);
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return padRight(marca, 20, ' ')+padRight(nombre,20, ' ')+"S/"+precio;
    }
    
    
    
}
