/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Item;

/**
 *
 * @author Fernando
 */
public class Artefacto implements Item {

    private int numeroArtefacto;
    private String nombreArtefacto;
    private int calorias;
    private double metros;

    public Artefacto(int num, String nombre, int calorias, double metros) {
        this.numeroArtefacto = num;
        this.nombreArtefacto = nombre;
        this.calorias = calorias;
        this.metros = metros;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }

    @Override
    public double getMetros() {
        return this.metros;
    }

    @Override
    public String getNombre() {
        return this.nombreArtefacto;
    }

    @Override
    public int getNumero() {
        return this.numeroArtefacto;
    }
}
