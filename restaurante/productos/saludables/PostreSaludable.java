/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.productos.saludables;
import restaurante.interfaces.Postre;

/**
 *
 * @author JUANCA
 */
public class PostreSaludable implements Postre {
    
    @Override
    public void servir(){
        System.out.println("Postre saludable servido");
    }
    
}
