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
    ArrayList a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
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
        k = new ArrayList();
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        o = new ArrayList();
        p = new ArrayList();
        q = new ArrayList();
        r = new ArrayList();
        s = new ArrayList();
        t = new ArrayList();
        u = new ArrayList();
        v = new ArrayList();
        w = new ArrayList();
        x = new ArrayList();
        y = new ArrayList();
        z = new ArrayList();

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

        k.add(1.615);
        k.add(3.573);
        k.add(7.865);
        k.add(15.839);
        k.add(30.342);

        l.add(1.495);
        l.add(3.308);
        l.add(7.281);
        l.add(14.664);
        l.add(28.091);

        m.add(1.399);
        m.add(3.094);
        m.add(6.811);
        m.add(13.717);
        m.add(26.277);

        n.add(1.319);
        n.add(2.917);
        n.add(6.421);
        n.add(12.932);
        n.add(24.774);

        o.add(1.251);
        o.add(2.768);
        o.add(6.092);
        o.add(12.269);
        o.add(23.503);

        p.add(1.193);
        p.add(2.639);
        p.add(5.808);
        p.add(11.698);
        p.add(22.409);

        q.add(1.142);
        q.add(2.526);
        q.add(5.561);
        q.add(11.200);
        q.add(21.455);

        r.add(1.097);
        r.add(2.427);
        r.add(5.343);
        r.add(10.760);
        r.add(20.613);

        s.add(1.057);
        s.add(2.339);
        s.add(5.149);
        s.add(10.369);
        s.add(19.864);

        t.add(1.021);
        t.add(2.260);
        t.add(4.974);
        t.add(10.017);
        t.add(19.190);

        u.add(0.989);
        u.add(2.188);
        u.add(4.816);
        u.add(9.699);
        u.add(18.581);

        v.add(0.959);
        v.add(2.123);
        v.add(4.672);
        v.add(9.410);
        v.add(18.026);

        w.add(0.932);
        w.add(2.063);
        w.add(4.541);
        w.add(9.145);
        w.add(17.518);

        x.add(0.908);
        x.add(2.008);
        x.add(4.420);
        x.add(8.901);
        x.add(17.051);

        y.add(0.885);
        y.add(1.957);
        y.add(4.308);
        y.add(8.675);
        y.add(16.619);

        z.add(0.863);
        z.add(1.910);
        z.add(4.204);
        z.add(8.466);
        z.add(16.219);

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
        map.put(12, k);
        map.put(14, l);
        map.put(16, m);
        map.put(18, n);
        map.put(20, o);
        map.put(22, p);
        map.put(24, q);
        map.put(26, r);
        map.put(28, s);
        map.put(30, t);
        map.put(32, u);
        map.put(34, v);
        map.put(36, w);
        map.put(38, x);
        map.put(40, y);
        map.put(42, z);
    }

    public String pedirDiametro(double metros, double consumo) {
        ArrayList fila;
        int indice = 0;
        double metrosAdaptados = metros * 1.35;
        String res = "";

        consumo = consumo / 9300;

        //Levanto metros a los valores de la tabla
        metrosAdaptados = haciaArriba(metrosAdaptados);

        fila = map.get((int) metrosAdaptados);

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
