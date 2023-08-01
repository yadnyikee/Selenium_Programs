package ReadingData;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 String path="C:\\Users\\yadnyikee suresh kam\\Desktop\\StudentInfo.xlsx";
		 
		 FileInputStream file=new FileInputStream(path);
		 
	    String data1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		
		
		System.out.println(data1);

	
		
		
	//XSSFWorkbook workbook = new XSSFWorkbook(file);
//		
///	String data5= workbook.getSheet("sheet").getRow(0).getCell(0).getStringCellValue();
//        System.out.print(data5);	
        
        
		
		
	

	}

}
