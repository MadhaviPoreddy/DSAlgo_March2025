package com.dsalgo.automation.utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReader {
    private static final String EXCEL_FILE_PATH = "src/test/resources/testdata/TestData.xlsx";

    public static List<Map<String, String>> getAllRows(String sheetName) {
        List<Map<String, String>> allData = new ArrayList<>();
        try (FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);

            if (headerRow == null) {
                throw new RuntimeException("Header row is missing in the Excel sheet.");
            }

            int totalColumns = headerRow.getLastCellNum(); // Total number of columns

            // Loop through all rows, including empty ones
            for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row dataRow = sheet.getRow(rowNum);
                Map<String, String> rowData = new LinkedHashMap<>();

                for (int col = 0; col < totalColumns; col++) {
                    Cell headerCell = headerRow.getCell(col, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    Cell dataCell = (dataRow != null) ? dataRow.getCell(col, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK) : null;

                    String header = headerCell.getStringCellValue().trim();
                    String value = (dataCell != null) ? getCellValue(dataCell) : ""; 

                    rowData.put(header, value);
                }
                allData.add(rowData); // Ensure even empty rows are included
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read Excel file", e);
        }
        return allData;
    }

    // Helper method to handle different cell types
    private static String getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue()); // Convert numeric to string
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
            case ERROR:
            default:
                return "";
        }
    }
    
    //To retrieve single cell value
    public static String getCellValue(String sheetName, int rowIndex, int colIndex) {
        try (FileInputStream file = new FileInputStream(EXCEL_FILE_PATH);
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowIndex);

            if (row == null) return "";

            Cell cell = row.getCell(colIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
            return getCellValue(cell); // Reuses your existing method
        } catch (IOException e) {
            throw new RuntimeException("Failed to read cell from Excel file", e);
        }
    }
}
