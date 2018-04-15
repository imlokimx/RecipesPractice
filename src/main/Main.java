/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.chef;
import entities.recipe;
import java.util.ArrayList;
import views.addRecipe;
import views.home;

/**
 *
 * @author loki
 */
public class Main {
// Definimos nuestro "almacenamiento" en tiempo de ejecución

    public static final ArrayList<recipe> recipes = new ArrayList();
    public static final ArrayList<chef> chefs = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Iniciamos agregando chefs
        chef c1 = new chef();
        chef c2 = new chef();
        chef c3 = new chef();
        chef c4 = new chef();
        // Agregamos info a los objetos
        c1.setID(1);
        c1.setName("Loki");
        c1.setLastname("De Asgard");
        c2.setID(2);
        c2.setName("Jaz");
        c2.setLastname("Williams");
        c3.setID(3);
        c3.setName("Damian");
        c3.setLastname("Bojorquez");
        c4.setID(4);
        c4.setName("Thor");
        c4.setLastname("De Asgard");
        // Empujamos los objetos al almacenamiento
        chefs.add(c1);
        chefs.add(c2);
        chefs.add(c3);
        chefs.add(c4);
        // Corremos el formulario
        // NOTA: cambiar esto por la home cuando la hagas
        for(int i= 0; i<chefs.size();i++){
            System.out.println(chefs.get(i).getName());           
        }
        String L2 = Integer.toString(c1.getID());
        if("35143".equals(L2)){
            System.out.println("Si");
        }else{
            System.out.println("no");
        }
        new home().setVisible(true);
        
             
        }
       
    
    
}
