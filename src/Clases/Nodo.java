/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Item;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Nodo implements Item {

    private String nombreNodo;
    private ArrayList<Item> hijos;

    public Nodo(String nombre) {
        this.nombreNodo = nombre;
    }

    @Override
    public int getCalorias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getMetros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return this.nombreNodo;
    }

    @Override
    public int getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
