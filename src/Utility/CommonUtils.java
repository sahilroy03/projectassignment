package Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @author sahilroy
 * Description- This class provides method definition which are commonly required for test case execution
 * like reading data from excel etc.
 *
 */

public class CommonUtils {
	
		// Declaring the references required for excel utility
		private static XSSFSheet ExcelWSheet;
		private static XSSFWorkbook ExcelWBook;
		private static XSSFCell Cell;
		
		
		public static void setExcelFile(String path,String sheetName) throws Exception  	//Method to set the excel file from which data is to be read.
		
		{
			try
			{
				FileInputStream ExcelFile=new FileInputStream(path);
				ExcelWBook=new XSSFWorkbook(ExcelFile);
				ExcelWSheet=ExcelWBook.getSheet(sheetName);
			}
			
			catch(Exception e)
			{
				throw(e);
			}
		}
				
		public static String getCellData(int RowNum,int ColNum) throws Exception		//Method defined for extracting data from a cell in excel.
		
		{
			try
			{
				setExcelFile(System.getProperty("user.dir")+Constant.ExcelPath,Constant.ExcelSheet);
				Cell=ExcelWSheet.getRow(RowNum).getCell(ColNum);
				String CellData=Cell.getStringCellValue();
				return CellData;
			}
			catch(Exception e)
			{
				throw(e);
			}
			
		}
		
		public static String getCellDataByUid(String UserId,int ColNum) throws Exception	//Method to extract data corresponding to a user id
		{	
			setExcelFile(System.getProperty("user.dir")+Constant.ExcelPath,Constant.ExcelSheet);
			String CellValue="";
			
			for(int i=1;i<=ExcelWSheet.getLastRowNum();i++)
			{
				try
				{
						if(getCellData(i,Constant.Col_Uid).equals(UserId))
						{
							CellValue=getCellData(i,ColNum);
							break;
						}
				}
				catch (Exception e)
				{
					throw (e);
				}
			}
			return CellValue;
		}
		
		public static int getLanguageIndex() 				//Method to get the index of the Languages provided in the Languages dropdown to support xpath creation.
		{	
			int index=0;
			try
			{
			String Language=getCellDataByUid(EnvironmentConfig.UserID,Constant.Col_ProgrammingLanguage);	
			switch(Language)
				{
					case "Ruby":
					index=1;
					break;
					case "PHP":
					index=2;
					break;
					case "Scala":
					index=3;
					break;
					case "Python":
					index=4;
					break;
					case "Javascript":
					index=5;
					break;
					case "Java":
					index=6;
					break;
					case "C++":
					index=7;
					break;
					case "C#":
					index=8;
					break;
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return index;
		}

}
