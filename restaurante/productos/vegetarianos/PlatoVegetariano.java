/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.productos.vegetarianos;

import restaurante.interfaces.PlatoPrincipal;

/**
 *
 * @author JUANCA
 */
public class PlatoVegetariano implements PlatoPrincipal {
    
    @Override
    public void servir(){
        System.out.println("Plato vegetariano servido");
    }
    
}
