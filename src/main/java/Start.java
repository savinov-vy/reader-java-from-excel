
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// ALT+F12
public class Start {
    //ReadExcelDemo
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(5000);

        // Read XSL file
        FileInputStream inputStream = new FileInputStream(new File("d:\\data.xlsx"));

        // Get the workbook instance for XLS file
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Get first sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = sheet.iterator();
        Manipulator manipulator = new Manipulator();
        Handler handler = new Handler();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // Get iterator to all cells of current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                // Change to getCellType() if using POI 4.x
                CellType cellType = cell.getCellTypeEnum();

                switch (cellType) {
                    case _NONE:
                        Manipulator.stopAllowed = true;
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());

                        break;
                    case BLANK:
                        Manipulator.stopAllowed = true;
                        break;
                    case FORMULA:
                        // Formula
                        System.out.print(cell.getCellFormula());

                        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
                        // Print out value evaluated by formula
                        System.out.print(evaluator.evaluate(cell).getNumberValue());
                        break;
                    case NUMERIC:
                        Manipulator.stopAllowed = false;
                        Double num = cell.getNumericCellValue();
                        ArrayList<Character> chList = handler.work(num);
                        manipulator.robotWriting(chList);
                        chList.clear();
                        handler.list.clear();
                        break;
                    case STRING:
                        Manipulator.stopAllowed = true;
                        break;
                    case ERROR:
                        System.out.print("!");
                        System.out.print("\t");
                        break;
                }

            }
            if (!Manipulator.stopAllowed)  {
                manipulator.robotEnter();
                Manipulator.stopAllowed = true;
            }
        }
        manipulator.robotEscape();
    }

}

