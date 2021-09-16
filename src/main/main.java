/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.Artefacto;
import Interfaces.Item;
import Utilidades.TecladoIn;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class main {

    public static void main(String[] args) {

        ArrayList<Artefacto> listaArtefactos;

        listaArtefactos = crearArtefactos();

    }

    public static ArrayList<Artefacto> crearArtefactos() {
        ArrayList<Artefacto> res = new ArrayList();
        int cantArtefactos, caloriasArtefacto;
        double metrosArtefacto;
        String nombreArtefacto;

        System.out.println("Cantidad de artefactos: ");
        cantArtefactos = TecladoIn.readLineInt();

        for (int i = 1; i <= cantArtefactos; i++) {
            System.out.println("Nombre artefacto " + (i + 1) + ": ");
            nombreArtefacto = TecladoIn.readLine();
            System.out.println("Calorias: ");
            caloriasArtefacto = TecladoIn.readLineInt();
            System.out.println("Metros artefacto: ");
            metrosArtefacto = TecladoIn.readLineDouble();

            Artefacto nuevoArtefacto = new Artefacto((i + 1), nombreArtefacto, caloriasArtefacto, metrosArtefacto);
            res.add(nuevoArtefacto);
        }

        return res;
    }

    public static void conectar() {
        String cadena;
        ArrayList items;

        System.out.println("Ingresar lista de items (por ejemplo 5-C 4-C) separados por un espacio: ");
        cadena = TecladoIn.readLine();
        cadena = cadena.trim();
        items = parser(cadena);

    }

    public static ArrayList<Item> parser(String cad) {
        String sub;

        sub = cad.substring(0, cad.indexOf(" "));

        System.out.println("Subcadena: " + sub);

        return null;
    }
}
