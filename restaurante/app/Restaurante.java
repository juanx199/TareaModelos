/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.app;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import restaurante.factories.MenuSaludableFactory;
import restaurante.factories.MenuVegetarianoFactory;
import restaurante.factories.MenuGourmetFactory;


import restaurante.interfaces.Entrada;
import restaurante.interfaces.PlatoPrincipal;
import restaurante.interfaces.Bebida;
import restaurante.interfaces.Postre;
import restaurante.interfaces.MenuFactory;
/**
 *
 * @author JUANCA
 */
public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("#### BIENVENIDO A MI RESTAURANTE ####");
        MenuFactory factory = null;
        
        
        while(factory == null){
            System.out.println("Seleccione el menú que desea obtener\n");
            System.out.println("1) Menú gourmet");
            System.out.println("2) Menú Saludable");
            System.out.println("3) Menú Vegetariano");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1 -> factory = new MenuGourmetFactory();
                case 2 -> factory = new MenuSaludableFactory();
                case 3 -> factory = new MenuVegetarianoFactory();
                default -> {
                    System.out.println("No puedes elegir eso ;( intenta otra vez ");
                }
            }
        }//Acá el usuario elige que producto comer
        
        factory.crearEntrada().servir();
        factory.crearPlatoPrincipal().servir();
        factory.crearBebida().servir();
        factory.crearPostre().servir();
        
        
        
        
           
        sc.close();
    }
}
