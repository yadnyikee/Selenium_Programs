package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdata2usingifelse {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		
		System.out.println("last row number--->"+row);
		
		
		int cell=sheet.getRow(1).getLastCellNum();
		
		System.out.println("last cell number--->"+cell);
		
		
		System.out.println();
		
		for(int r=0;r<row;r++) {
			
			XSSFRow row1=sheet.getRow(r);
			
			for(int c=0;c<cell;c++) {
				
			
				XSSFCell cell1=row1.getCell(c);
			
				if (cell1.getCellType() == CellType.NUMERIC) {//CellType enum is used to represent the different types of
					                                            //cells that can exist in an Excel spreadsheet. 
                    double value = cell1.getNumericCellValue();
                    System.out.print(cell1.getNumericCellValue());
				}
                    
                    else
                    	if (cell1.getCellType() == CellType.STRING) {
                            String value1 = cell1.getStringCellValue();
                            System.out.print(value1);
				
			           
				
		}
				System.out.print("  ||  ");
		
		}
		
			System.out.println("  ");
		
		
		
		}	
		
		
		
	}
}
		
		
		



	


