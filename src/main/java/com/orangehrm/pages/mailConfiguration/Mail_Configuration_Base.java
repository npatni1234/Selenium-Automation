package com.orangehrm.pages.mailConfiguration;



import com.orangehrm.base.BasePage;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Mail_Configuration_Base extends BasePage  {
		
	 //function for getting the cell value
	public static String getCellValue(String xl, String Sheet, int r, int c)

	      {

	          try

	                {

	                             FileInputStream fis = new FileInputStream(xl);

	                             Workbook wb = WorkbookFactory.create(fis);

	                             Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);

	                              return cell.getStringCellValue();

	                                }

	                                catch (Exception e)

	                                {

	                                                return "";

	                                }

	                }
                    //function to get the row count
	                public static int getRowCount (String xl, String Sheet)

	                {

	                    try

	                         {

	                             FileInputStream fis = new FileInputStream(xl);

	                             Workbook wb = WorkbookFactory.create(fis);

	                             return wb.getSheet(Sheet).getLastRowNum();

	                                }

	                                catch (Exception e)

	                                {

	                                  return 0;

	                                }

	                }

	

}
