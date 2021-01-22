
package Selenium.CaseStudyAssignment;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Assignment extends globalDriver{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		driver = initializeDriver();
		
		driver.get("file:///C:/Users/123/Selenium%20Case%20Study/login.html");
		String PageHeading=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div/h1")).getText();
		System.out.println("page heading is "+ PageHeading);
		
		driver.findElement(By.name("userPwd")).sendKeys("admin");
		driver.findElement(By.cssSelector(".btn")).click();
		String UsernameErrorMsg=driver.findElement(By.id("userErrMsg")).getText();
		System.out.println("Username field error message is "+ UsernameErrorMsg);
		
		driver.findElement(By.name("userPwd")).clear();
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.cssSelector(".btn")).click();
		String PasswordErrorMsg=driver.findElement(By.id("pwdErrMsg")).getText();
		System.out.println("Password field error message is "+ PasswordErrorMsg);
		
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("userPwd")).sendKeys("admin");
		driver.findElement(By.cssSelector(".btn")).click();
		String PageHeading1=driver.findElement(By.xpath("/html/body/div/h2")).getText();
		System.out.println("page heading is "+ PageHeading1);
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg1=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg1);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtFirstName")).sendKeys("Mohan");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg2=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg2);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtLastName")).sendKeys("Gond");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg3=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg3);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("txtEmail")).sendKeys("shreyas.jaidhar");
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg4=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg4);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtEmail")).clear();
		driver.findElement(By.id("txtEmail")).sendKeys("shreyasjaidhar@gmail.com");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg5=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg5);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("txtPhone")).sendKeys("123456");
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg6=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg6);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtPhone")).clear();
		driver.findElement(By.id("txtPhone")).sendKeys("987654321");
		
		String address="Brigade Bhuwalka Icon Bangalore Karnataka";
		driver.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys(address);
		
		
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg7=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg7);
		driver.switchTo().alert().accept();	
		WebElement s1=driver.findElement(By.name("city"));
		Select d1=new Select(s1);
		d1.selectByIndex(2);
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg8=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg8);
		driver.switchTo().alert().accept();
		
		WebElement s2=driver.findElement(By.name("state"));
		Select d2=new Select(s2);
		d2.selectByIndex(2);
		
		WebElement s3=driver.findElement(By.name("persons"));
		Select d3=new Select(s3);
		d3.selectByVisibleText("5");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg9=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg9);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtCardholderName")).sendKeys("abcd");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg10=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg10);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtDebit")).sendKeys("123456");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg11=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg11);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtCvv")).sendKeys("123");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg12=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg12);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtMonth")).sendKeys("20/01/2021");
		
		driver.findElement(By.id("btnPayment")).click();
		String alertmsg13=driver.switchTo().alert().getText();
		System.out.println("alert message is "+alertmsg13);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtYear")).sendKeys("2022");
		
		driver.findElement(By.id("btnPayment")).click();
		String Successmsg=driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println("Booking completed success message is "+Successmsg);
		
		driver.quit();
	}

}