package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		System.out.println("rowCount"+rowCount);
		
		int cellCount = ws.getRow(0).getLastCellNum();
		System.out.println("cell count:"+cellCount);
		String[][] data = new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			
		//	int cellCount = ws.getRow(i).getLastCellNum();
			
			for(int j=0;j<cellCount;j++) {
				
				//String text = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=ws.getRow(i).getCell(j).getStringCellValue();
				//System.out.println("text:"+text);
			}
			
		}
		wb.close();
		return data;

	}
		
		
	}

//}
