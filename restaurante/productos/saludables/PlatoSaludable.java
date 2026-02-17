/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.productos.saludables;
import restaurante.interfaces.PlatoPrincipal;

/**
 *
 * @author JUANCA
 */
public class PlatoSaludable implements PlatoPrincipal {
    
    @Override
    public void servir(){
        System.out.println("Plato saludable servido");
    }
    
}
