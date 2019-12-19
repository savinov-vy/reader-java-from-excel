import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.util.Date;

public class readFromExcel {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook vb = readWorkbook("d:\\data.xlsx");
        HSSFSheet sheet= vb.getSheet("Лист 1");
        HSSFRow row = sheet.getRow(1); //строка

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
}
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
