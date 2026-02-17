/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.productos.gourmet;

import restaurante.interfaces.Postre;
/**
 *
 * @author JUANCA
 */
public class PostreGourmet implements Postre {

    @Override
    public void servir() {
        System.out.println("Postre gourmet servido");
    }
}
