package StepDef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  public void f() throws IOException {
	
	  File src=new File("C:\\Users\\aravind.g.kumar\\Desktop\\SampleData.xlsx");
	  FileInputStream fis= new FileInputStream(src);
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	  System.out.println("First row number"+sh.getFirstRowNum());
	  System.out.println("Last row Number"+sh.getLastRowNum());
	  int rowCount=sh.getLastRowNum()-sh.getFirstRowNum()+1;
	  int noofcolumns=sh.getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Row Count is "+rowCount);
	  System.out.println("number of columns"+noofcolumns);
	  //System.out.println(sh.getRow(0).getCell(0).getStringCellValue()+"\t\t\t"+sh.getRow(0).getCell(1).getStringCellValue());
	  //System.out.println(sh.getRow(1).getCell(0).getStringCellValue()+"\t\t\t"+sh.getRow(1).getCell(1).getStringCellValue());
	  //System.out.println(sh.getRow(2).getCell(0).getStringCellValue()+"\t\t\t"+sh.getRow(2).getCell(1).getStringCellValue());

	  for (int i=1;i<rowCount;i++) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver =new  ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize(); //maximize Browser
			driver.findElement(By.linkText("Log in")).click();  
			driver.findElement(By.id("Email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			driver.findElement(By.name("Password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
            
			//writing back to excel
			
			XSSFRow header=sh.getRow(0);
			XSSFCell head=header.createCell(2);
			head.setCellValue("Status");
			sh.getRow(1).createCell(2).setCellValue("PASS");
			sh.getRow(2).createCell(2).setCellValue("FAIL");
			FileOutputStream fos= new FileOutputStream(src);
			wb.write(fos);
			
			driver.quit();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
