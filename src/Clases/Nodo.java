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
    private ArrayList<Item> hijos = new ArrayList();
    private double metros;

    public Nodo(String nombre) {
        this.nombreNodo = nombre;
    }

    @Override
    public double getCalorias() {
        double total = 0;

        for (int i = 0; i < hijos.size(); i++) {
            total += hijos.get(i).getCalorias();
        }

        return total;
    }

    public void setMetros(double m) {
        this.metros = m;
    }

    @Override
    public double getMetros() {
        return this.metros;
    }

    @Override
    public String getNombre() {
        return this.nombreNodo;
    }

    @Override
    public int getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esNodo() {
        return true;
    }

    public void agregar(Item item) {
        String nombreItem = item.getNombre();

        if (nombreItem.endsWith(this.nombreNodo.substring(0, 1))) {
            this.hijos.add(item);
        }
    }

}
