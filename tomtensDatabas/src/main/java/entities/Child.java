/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Elev
 */
public class Child {
    //members
    private int id;
    private String namn;
    private String adress;
    private String land;

    public Child(int id, String namn, String adress, String land) {
        this.id = id;
        this.namn = namn;
        this.adress = adress;
        this.land = land;
    }
    
    public Child() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }


    
    
}
