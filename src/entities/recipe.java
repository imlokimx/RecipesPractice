/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rycks
 */
public class recipe {
    //Definimos los atributos
    private int id;
    private String name;
    private String ingredients;
    private String Preparation;
    private int cid;
    
    //Creamos un constructor vacio
    public recipe(){}
    
    //Creamos los setters and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ingredients
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the Preparation
     */
    public String getPreparation() {
        return Preparation;
    }

    /**
     * @param Preparation the Preparation to set
     */
    public void setPreparation(String Preparation) {
        this.Preparation = Preparation;
    }

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }
    
    
}
