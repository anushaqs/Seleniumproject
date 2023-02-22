package genericlibraries;

import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXCELUTILITY {
	private Workbook wb;
	
	/

	public void excelInitialization(String excelpath) {
		FileInputStream fis = null;
		try {
			fis =new FileInputStream(excelpath);
				{catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				try {
					Wb = WorkbookFactory.create(fis);
					{catch (EncryptedDocumentException | IOException e) {
						e.printstackTrace();
					}
					}
					 public String readDataFromExcel(string sheetName,int rowNum,int cellNum) {
						 return wb.getSheetName(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue()
								 {
							 
								 }
						
							
						}
						
					
				}
			}
		}

	}

}
