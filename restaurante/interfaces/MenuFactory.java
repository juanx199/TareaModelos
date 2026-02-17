/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restaurante.interfaces;

/**
 *
 * @author JUANCA
 */
public interface MenuFactory {
    Entrada crearEntrada();
    PlatoPrincipal crearPlatoPrincipal();
    Bebida crearBebida();
    Postre crearPostre();
}
