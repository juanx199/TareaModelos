/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.productos.gourmet;

import restaurante.interfaces.Entrada;
/**
 *
 * @author JUANCA
 */
public class EntradaGourmet implements Entrada{
    
    @Override
    public void servir(){
        System.out.println("Entrada gourmet servida c:");
    }
}
