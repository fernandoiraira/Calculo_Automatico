/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Fernando
 */
public class CreadorExcel {

    private String nombreArchivo;
    private String rutaArchivo = "C:\\Ficheros_excel\\";
    private String hoja;
    private String[][] matrizDatos;

    public CreadorExcel(String nombre, String hoja, String[][] matriz) {

        nombreArchivo = nombre;
        rutaArchivo += nombreArchivo;
        this.hoja = hoja;

        XSSFWorkbook libro = new XSSFWorkbook();
        XSSFSheet hoja1 = libro.createSheet(this.hoja);
        //cabecera de la hoja de excel
        String[] header = new String[]{"TRAMO", "LONGIT. REAL (m)", "LONGIT. CALC. (m)", "CONSUMO m3", "DIAM mm"};

        //contenido de la hoja de excel
        this.matrizDatos = matriz;

        //poner negrita a la cabecera
        CellStyle style = libro.createCellStyle();
        Font font = libro.createFont();

        style.setFont(font);

        //generar los datos para el documento
        for (int i = 0; i <= this.matrizDatos.length; i++) {
            XSSFRow row = hoja1.createRow(i);//se crea las filas
            for (int j = 0; j < header.length; j++) {
                if (i == 0) {//para la cabecera
                    XSSFCell cell = row.createCell(j);//se crea las celdas para la cabecera, junto con la posición
                    cell.setCellStyle(style); // se añade el style crea anteriormente 
                    cell.setCellValue(header[j]);//se añade el contenido					
                } else {//para el contenido
                    XSSFCell cell = row.createCell(j);//se crea las celdas para la contenido, junto con la posición
                    cell.setCellValue(this.matrizDatos[i - 1][j]); //se añade el contenido
                }
            }
        }

        File file;
        file = new File(rutaArchivo);
        try ( FileOutputStream fileOuS = new FileOutputStream(file)) {
            if (file.exists()) {// si el archivo existe se elimina
                file.delete();
            }
            libro.write(fileOuS);
            fileOuS.flush();
            fileOuS.close();
            System.out.println("Archivo Excel Creado!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String[][] matriz = new String[][]{
            {"AP150", "ACCESS POINT TP-LINK TL-WA901ND 450Mbps Wireless N 1RJ45 10-100 3Ant.", "112.00", "50"},
            {"RTP150", "ROUTER TP-LINK TL-WR940ND 10-100Mbpps LAN WAN 2.4 - 2.4835Ghz", "19.60", "25"},
            {"TRT300", "TARJETA DE RED TPLINK TL-WN881ND 300Mpbs Wire-N PCI-Exp.", "10.68", "15"},
            {"TRT300", "DE RED TPLINK TL-WN881ND 300Mpbs Wire-N PCI-Exp.", "10.68", "15"},
            {"TR0", "DE RED TPLINK TL-WN881ND 300Mpbs Wire-N PCI-Exp.", "10.68", "15"}};

        CreadorExcel creador = new CreadorExcel("Prueba_objeto.xlsx", "Hoja1", matriz);
    }
}
