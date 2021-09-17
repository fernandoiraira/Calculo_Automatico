/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fernando
 */
public class Tabla {

    Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
    ArrayList a, b, c, d, e, f, g, h, i, j, k, l, m;
    int[] arrayMetros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48};

    public Tabla() {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();

        a.add(5.594);
        a.add(12.377);
        a.add(27.244);
        a.add(54.867);
        a.add(105.108);

        b.add(3.956);
        b.add(8.752);
        b.add(19.264);
        b.add(38.797);
        b.add(74.323);

        c.add(3.230);
        c.add(7.146);
        c.add(15.729);
        c.add(31.678);
        c.add(60.684);

        d.add(2.797);
        d.add(6.188);
        d.add(13.622);
        d.add(27.434);
        d.add(52.554);

        e.add(2.502);
        e.add(5.535);
        e.add(12.184);
        e.add(24.537);
        e.add(47.006);

        f.add(2.284);
        f.add(5.053);
        f.add(11.122);
        f.add(22.399);
        f.add(42.910);

        g.add(2.114);
        g.add(4.678);
        g.add(10.297);
        g.add(20.738);
        g.add(39.727);

        h.add(1.978);
        h.add(4.376);
        h.add(9.632);
        h.add(19.399);
        h.add(37.161);

        i.add(1.865);
        i.add(4.126);
        i.add(9.081);
        i.add(18.299);
        i.add(35.036);

        j.add(1.769);
        j.add(3.914);
        j.add(8.615);
        j.add(17.351);
        j.add(33.238);

        map.put(1, a);
        map.put(2, b);
        map.put(3, c);
        map.put(4, d);
        map.put(5, e);
        map.put(6, f);
        map.put(7, g);
        map.put(8, h);
        map.put(9, i);
        map.put(10, j);
    }

    public String pedirDiametro(double metros, double consumo) {
        ArrayList fila;
        int indice = 0;
        String res = "";

        //Levanto metros a los valores de la tabla
        metros = haciaArriba(metros);

        System.out.println("metros elegidos " + metros);
        fila = map.get((int) metros);

        while (consumo > (double) fila.get(indice)) {
            indice++;
        }

        switch (indice) {
            case 0:
                res = "20";
                break;
            case 1:
                res = "25";
                break;
            case 2:
                res = "32";
                break;
            case 3:
                res = "40";
                break;
            case 4:
                res = "50";
                break;
            default:
                throw new AssertionError();
        }

        return res;
    }

    private double haciaArriba(double metros) {
        int indice = 0;

        metros = Math.ceil(metros);

        //ej: metros: 20.23 roundup: 21
        //metros = 21
        while (metros > this.arrayMetros[indice]) {
            indice++;
        }

        metros = this.arrayMetros[indice];

        return metros;
    }

}
