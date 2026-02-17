/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.productos.vegetarianos;

import restaurante.interfaces.Bebida;

/**
 *
 * @author JUANCA
 */
public class BebidaVegetariana implements Bebida {
    
    @Override
    public void servir(){
        System.out.println("Bebida vegetariana servida");
    }
    
}
