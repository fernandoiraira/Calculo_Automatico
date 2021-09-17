/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.Artefacto;
import Clases.Nodo;
import Interfaces.Item;
import Utilidades.TecladoIn;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class main {

    public static void main(String[] args) {

        ArrayList<Item> lista;
        Nodo raiz;

        lista = listarItems();

        System.out.println("LISTA:");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        raiz = cargaPublica(lista);

        System.out.println("Calorias totales: " + raiz.getCalorias());

    }

    public static ArrayList<Item> listarItems() {
        String cadena;
        ArrayList items;

        System.out.println("Ingresar lista de items (por ejemplo 5-C 4-C) separados por un espacio: ");
        cadena = TecladoIn.readLine();
        cadena = cadena.trim();
        items = parser(cadena);

        return items;
    }

    public static ArrayList<Item> parser(String cadena) {
        String sub, primerCaracter, nombreArtefacto;
        int caloriasArtefacto;
        double metrosArtefacto;
        ArrayList res = new ArrayList();

        cadena = cadena + " ";

        while (cadena.length() > 0) {
            sub = cadena.substring(0, cadena.indexOf(" "));

            cadena = cadena.substring(cadena.indexOf(" ") + 1);

            primerCaracter = sub.substring(0, 1);

            if (esNumero(primerCaracter)) {
                nombreArtefacto = sub;
                System.out.println("----------");
                System.out.println(sub);
                System.out.println("Calorias: ");
                caloriasArtefacto = TecladoIn.readLineInt();
                System.out.println("Metros artefacto: ");
                metrosArtefacto = TecladoIn.readLineDouble();

                Artefacto nuevoArtefacto = new Artefacto(Integer.valueOf(sub.substring(0, 1)), nombreArtefacto, caloriasArtefacto, metrosArtefacto);
                res.add(nuevoArtefacto);
            } else {
                Nodo nuevoNodo = new Nodo(sub);
                res.add(nuevoNodo);
            }
        }

        return res;
    }

    public static boolean esNumero(String letra) {
        return (letra.equals("0")
                || letra.equals("1")
                || letra.equals("2")
                || letra.equals("3")
                || letra.equals("4")
                || letra.equals("5")
                || letra.equals("6")
                || letra.equals("7")
                || letra.equals("8")
                || letra.equals("9"));
    }

    public static Nodo cargaPublica(ArrayList lista) {
        Nodo raiz;
        int indice = lista.size() - 1;

        raiz = (Nodo) lista.get(lista.size() - 1);
        cargaAux(raiz, lista, indice - 1);

        return raiz;
    }

    private static void cargaAux(Nodo visitado, ArrayList<Item> lista, int indice) {
        Item aux;

        for (int i = indice; i >= 0; i--) {
            visitado.agregar(lista.get(i));
        }

        indice--;
        aux = lista.get(indice);

        while (!aux.esNodo() && indice > 0) {
            indice--;
            aux = lista.get(indice);
        }

        if (indice > -1 && aux.esNodo()) {
            cargaAux((Nodo) aux, lista, indice);
        }
    }
}
