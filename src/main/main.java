/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.Artefacto;
import Clases.Nodo;
import Clases.Tabla;
import Interfaces.Item;
import Utilidades.LectorExcel;
import Utilidades.TecladoIn;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class main {

    public static void main(String[] args) {
        Tabla tabla = new Tabla();
        ArrayList<Item> lista;
        Nodo raiz;

        lista = listarItems();

        raiz = cargaPublica(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("--------------------------------------");
            System.out.println("Consumo " + lista.get(i).getNombre() + ": " + (lista.get(i).getCalorias() / 9300));
            System.out.println("Metros reales: " + lista.get(i).getMetros() + " | Metros adaptados: " + (lista.get(i).getMetros() * 1.35));
            System.out.println("Diametro: " + tabla.pedirDiametro(lista.get(i).getMetros(), lista.get(i).getCalorias()));
        }

        System.out.println("----------");
        System.out.println("Calorias totales: " + raiz.getCalorias());
    }

    public static ArrayList<Item> listarItems() {
        String cadena = "";
        ArrayList items;
        String ruta = "C:/Users/Fernando/Desktop/datos_gas.xlsx";
        File f = new File(ruta);
        LectorExcel lector = null;

        if (f.exists()) {
            lector = new LectorExcel(f);
            cadena = lector.getLista();
            System.out.println("asd: " + cadena);
        } else {
            System.out.println("No existe el archivo especificado!");
        }

        cadena = cadena.trim();

        items = parser(cadena, lector);

        return items;
    }

    public static ArrayList<Item> parser(String cadena, LectorExcel lector) {
        String sub, primerCaracter, nombreArtefacto;
        int caloriasArtefacto, indice = 0;
        double metrosArtefacto, mayor = 0;
        ArrayList res = new ArrayList();
        double[] arrayMetros = lector.getMetros();

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
                metrosArtefacto = arrayMetros[indice];
                if (mayor < metrosArtefacto) {
                    mayor = metrosArtefacto;
                }
                Artefacto nuevoArtefacto = new Artefacto(Integer.valueOf(sub.substring(0, 1)), nombreArtefacto, caloriasArtefacto, metrosArtefacto);
                res.add(nuevoArtefacto);
            } else {
                Nodo nuevoNodo = new Nodo(sub);
                nuevoNodo.setMetros(arrayMetros[indice]);
                res.add(nuevoNodo);
            }
            indice++;
        }

        for (int i = 0; i < res.size(); i++) {
            Item vis = (Item) res.get(i);
            if (vis.esNodo()) {
                vis.setMetros(mayor);
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
