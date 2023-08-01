package ReadingData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	   String path="C:\\Users\\yadnyikee suresh kam\\Desktop\\Employee.xlsx";
		
		FileInputStream file1=new FileInputStream(path);
		
		String data=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();		
		
		System.out.println(data);
		
		
		FileInputStream file2=new FileInputStream(path);
		
		String data2=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();	
		
		System.out.println(data2);
		
		
		
		FileInputStream file3=new FileInputStream(path);
		
		String data3=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data3);
		
        FileInputStream file4=new FileInputStream(path);
		
		String data4=WorkbookFactory.create(file4).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data4);
		
		
		System.out.println();
		
		
		
		FileInputStream file5=new FileInputStream(path); 

		 
		double data5=WorkbookFactory.create(file5).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
				
		System.out.println(data5);	
				
		
		FileInputStream file6=new FileInputStream(path); 

		double data6=WorkbookFactory.create(file6).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
				
		System.out.println(data6);	
		
		
		FileInputStream file7=new FileInputStream(path); 

		
		double data7=WorkbookFactory.create(file7).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
				
		System.out.println(data7);	
		
		    		 
		}		

}
