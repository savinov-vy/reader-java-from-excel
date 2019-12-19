import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.Iterator;

public class readFromExcel {

    // получаем файл в формате xls
    FileInputStream file = new FileInputStream(new File("d:\\data.xlsx"));

    // формируем из файла экземпляр HSSFWorkbook
    HSSFWorkbook workbook = new HSSFWorkbook(file);

    // выбираем первый лист для обработки
// нумерация начинается с 0
    HSSFSheet sheet = workbook.getSheetAt(0);

    // получаем Iterator по всем строкам в листе
    Iterator<Row> rowIterator = sheet.iterator();

    // получаем Iterator по всем ячейкам в строке
    Iterator<Row> rowIter = sheet.rowIterator();
    HSSFRow row = (HSSFRow) rowIter.next();
    Iterator<Cell> cellIterator = row.cellIterator();

    public readFromExcel() throws IOException {
    }


/*
    public static void main(String[] args) throws IOException {
        HSSFWorkbook vb = readWorkbook("d:\\data.xls");
        HSSFSheet sheet= vb.getSheet("Лист 1");
        HSSFRow row = sheet.getRow(1); //строка
        HSSFCell cell = row.getCell(0);
        double d = cell.getNumericCellValue();
        System.out.println(d);
    }

    public static HSSFWorkbook readWorkbook(String filename) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(filename));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            return wb;
        }
        catch (Exception e) {
            return null;
        }
    }
}*/
//https://stackoverflow.com/questions/14734519/apache-poi-celliterator-skips-blank-cells-but-not-in-first-row
//https://javadevblog.com/rabotaem-s-excel-v-java.html
//https://habr.com/ru/post/56817/
//https://stackoverflow.com/questions/14734519/apache-poi-celliterator-skips-blank-cells-but-not-in-first-row

// получаем файл в формате xls
  /*  @SuppressWarnings("deprecation")
    public static void writeIntoExcel(String file) throws FileNotFoundException, IOException {
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Birthdays");

        // Нумерация начинается с нуля
        Row row = sheet.createRow(0);

        // Мы запишем имя и дату в два столбца
        // имя будет String, а дата рождения --- Date,
        // формата dd.mm.yyyy
        Cell name = row.createCell(0);
        name.setCellValue("John");

        Cell birthdate = row.createCell(1);

        DataFormat format = book.createDataFormat();
        CellStyle dateStyle = book.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
        birthdate.setCellStyle(dateStyle);


        // Нумерация лет начинается с 1900-го
        birthdate.setCellValue(new Date(110, 10, 10));

        // Меняем размер столбца
        sheet.autoSizeColumn(1);

        // Записываем всё в файл
        book.write(new FileOutputStream(file));
        book.close();
    }
}*/
