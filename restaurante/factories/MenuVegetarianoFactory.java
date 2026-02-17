/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.factories;

import restaurante.interfaces.Entrada;
import restaurante.interfaces.PlatoPrincipal;
import restaurante.interfaces.Bebida;
import restaurante.interfaces.Postre;
import restaurante.interfaces.MenuFactory;

import restaurante.productos.vegetarianos.BebidaVegetariana;
import restaurante.productos.vegetarianos.EntradaVegetariana;
import restaurante.productos.vegetarianos.PlatoVegetariano;
import restaurante.productos.vegetarianos.PostreVegetariano;

/**
 *
 * @author JUANCA
 */
public class MenuVegetarianoFactory implements MenuFactory {
    
    @Override
    public Entrada crearEntrada(){
        return new EntradaVegetariana();
    }
    @Override
    public Bebida crearBebida(){
        return new BebidaVegetariana();
    }
    @Override
    public Postre crearPostre(){
        return new PostreVegetariano();
    }
    @Override
    public PlatoPrincipal crearPlatoPrincipal(){
        return new PlatoVegetariano();
    }
    
}
