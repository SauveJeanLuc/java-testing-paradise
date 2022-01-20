package com.testing.paradise.Excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelTest {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Documents\\MEGA\\MEGAsync\\professional-work\\RTB Project\\excelTest.xlsx");

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();

        int i = 0;

        for (Row row : sheet) {
            data.put(i, new ArrayList<String>());
            for (Cell cell : row) {
                switch (cell.getCellTypeEnum()) {
                    case STRING:
                        data.get(new Integer(i)).add(cell.getRichStringCellValue().getString());
                        break;
                    case NUMERIC:
                        if(DateUtil.isCellDateFormatted(cell)){
                            data.get(new Integer(i)).add(cell.getDateCellValue() + "");
                        } else {
                            data.get(new Integer(i)).add(cell.getNumericCellValue() + "");
                        }
                        break;
                    case BOOLEAN:
                        data.get(new Integer(i)).add(cell.getBooleanCellValue() + "");
                        break;
                    default:
                        data.get(new Integer(i)).add(" ");
                }
            }
            i++;
        }

        System.out.println("================================");
        System.out.println(data);
        System.out.println("================================");

    }

}
