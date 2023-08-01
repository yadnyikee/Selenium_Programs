package ReadingData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData4 {

	public static void main(String[] args) throws IOException {
       FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\selenium_program\\TestData\\11March_Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet Sheet=workbook.getSheetAt(2);
		
		int Rows=Sheet.getLastRowNum();
		
		System.out.println(Rows);
		
		int Cell=Sheet.getRow(1).getLastCellNum();
		
		System.out.println(Cell);
		
		
		for(int r=0;r<Rows;r++) {
			
			XSSFRow row=Sheet.getRow(r);
			
			for(int c=0;c<Cell;c++) {
				
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType()){
				
				
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
				   System.out.print(cell.getNumericCellValue());
				   break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					
				break;
					
					
				
					
					
					
				}
				
				System.out.print("  ||  ");	
				
			}
			System.out.println();
		}
		
		

	}

}
