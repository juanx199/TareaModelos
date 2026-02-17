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

import restaurante.productos.saludables.BebidaSaludable;
import restaurante.productos.saludables.EntradaSaludable;
import restaurante.productos.saludables.PlatoSaludable;
import restaurante.productos.saludables.PostreSaludable;

/**
 *
 * @author JUANCA
 */
public class MenuSaludableFactory implements MenuFactory {
    
    @Override
    public Entrada crearEntrada(){
        return new EntradaSaludable();
    }
    @Override
    public Bebida crearBebida(){
        return new BebidaSaludable();
    }
    @Override
    public Postre crearPostre(){
        return new PostreSaludable();
    }
    @Override
    public PlatoPrincipal crearPlatoPrincipal(){
        return new PlatoSaludable();
    }
    
}
