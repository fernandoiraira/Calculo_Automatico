/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Fernando
 */
public interface Item {
   public double getCalorias();
   public double getMetros();
   public String getNombre();
   public int getNumero();
   public boolean esNodo();
   public void setMetros(double metros);
}
