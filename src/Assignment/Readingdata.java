package Assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdata {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		String data=workbook.getSheetAt(0).getRow(3).getCell(3).getStringCellValue();
		
		System.out.println("HR Manager data"+data);
		
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		
		System.out.println(row);
		
		
		int cell=sheet.getRow(1).getLastCellNum();
		
		System.out.println(cell);
		
		
		System.out.println("");
		
		for(int r=0;r<row;r++) {
			
			XSSFRow row1=sheet.getRow(r);
			
			for(int c=0;c<cell;c++) {
				
			
				XSSFCell cell1=row1.getCell(c);
			
				switch(cell1.getCellType()) {
				
				case STRING:
				System.out.print(cell1.getStringCellValue());
				break;
				
				case NUMERIC:
				   System.out.print(cell1.getNumericCellValue());
				   break;
				
			
				
		}
				System.out.print("  ||  ");
		
		}
		
			System.out.println("  ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
		
		
		
		
		
		



	}

}
