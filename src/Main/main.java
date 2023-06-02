/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Producto;
import InterfacesGraficas.ListaDeProductos;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author chave
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Producto> listaProductos  = new ArrayList<>();
        agregarProductos(listaProductos);
        ListaDeProductos form = new ListaDeProductos(listaProductos);
        form.setVisible(true);
        
    }
    public static void agregarProductos(List<Producto> lista){
        Producto producto1 = new Producto("Nike", "Zapatillas", 99.99);
        Producto producto2 = new Producto("Adidas", "Camiseta", 29.99);
        Producto producto3 = new Producto("Puma", "Pantalón", 49.99);
        Producto producto4 = new Producto("Levi's", "Jeans", 79.99);
        Producto producto5 = new Producto("Gucci", "Cinturón", 199.99);
        Producto producto8 = new Producto("Vans", "Sneakers", 69.99);
        Producto producto9 = new Producto("H&M", "Vestido", 39.99);
        Producto producto10 = new Producto("Zara", "Chaqueta", 89.99);
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        lista.add(producto5);
        lista.add(producto8);
        lista.add(producto9);
        lista.add(producto10); 
        
    }
    
}
