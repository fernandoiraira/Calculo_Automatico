/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Fernando
 */
public class LectorExcel {

    private List cellData = new ArrayList();

    public LectorExcel(File filename) {

        try {

            FileInputStream fileInputStream = new FileInputStream(filename);
            XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);

            XSSFSheet hssfSheet = workBook.getSheetAt(0);

            Iterator rowIterator = hssfSheet.rowIterator();

            while (rowIterator.hasNext()) {
                XSSFRow hssfRow = (XSSFRow) rowIterator.next();
                Iterator iterator = hssfRow.cellIterator();
                List cellTemp = new ArrayList();

                while (iterator.hasNext()) {
                    XSSFCell hssfCell = (XSSFCell) iterator.next();
                    cellTemp.add(hssfCell);
                }

                this.cellData.add(cellTemp);
            }

        } catch (Exception e) {
        }

    }

    public String getLista() {
        String res = "";

        for (int i = 0; i < this.cellData.size(); i++) {
            List cellTempList = (List) this.cellData.get(i);
            for (int j = 0; j < 1; j++) {
                XSSFCell hssfCell = (XSSFCell) cellTempList.get(j);
                String stringCellValue = hssfCell.toString();
                res += stringCellValue + " ";
            }
        }
        return res;
    }

    public double[] getMetros() {
        double[] resultado = new double[this.cellData.size()];

        for (int i = 0; i < this.cellData.size() - 1; i++) {
            List cellTempList = (List) this.cellData.get(i);
            for (int j = 1; j < 2; j++) {
                XSSFCell hssfCell = (XSSFCell) cellTempList.get(j);
                String stringCellValue = hssfCell.toString();
                resultado[i] = Double.parseDouble(stringCellValue);
            }
        }
        return resultado;
    }
}
