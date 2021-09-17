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

    Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
    ArrayList a, b, c, d, e, f;

    public Tabla() {
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();

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
    }

    public void asd() {
        map.put("1", a);
        map.put("2", b);
        map.put("3", c);
        map.put("4", d);
        map.put("5", e);
        map.put("6", f);
    }

}
