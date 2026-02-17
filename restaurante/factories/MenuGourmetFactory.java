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

import restaurante.productos.gourmet.BebidaGourmet;
import restaurante.productos.gourmet.EntradaGourmet;
import restaurante.productos.gourmet.PlatoGourmet;
import restaurante.productos.gourmet.PostreGourmet;

/**
 *
 * @author JUANCA
 */
public class MenuGourmetFactory implements MenuFactory {
    
    @Override
    public Entrada crearEntrada(){
        return new EntradaGourmet();
    }
    @Override
    public Bebida crearBebida(){
        return new BebidaGourmet();
    }
    @Override
    public Postre crearPostre(){
        return new PostreGourmet();
    }
    @Override
    public PlatoPrincipal crearPlatoPrincipal(){
        return new PlatoGourmet();
    }
    
}
