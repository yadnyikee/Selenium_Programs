package ReadingData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData2 {//using for loop

	public static void main(String[] args) throws IOException {
      
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\11March_Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
			


		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
		
				 String data= workbook.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
			        System.out.print(data);	
			        
			        System.out.print(" ");
				
			}
			System.out.println();
		}
    
        
	}

}
