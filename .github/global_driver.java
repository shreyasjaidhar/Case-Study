package feature;
package Selenium.CaseStudyAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class global_driver {

	public static void main(String[] args) {
		
		
		public static WebDriver initializeDriver() throws IOException {
			// TODO Auto-generated method stub

			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\123\\eclipse-workspace\\CaseStudyAssignment\\src\\test\\java\\Selenium\\CaseStudyAssignment\\data.properties");
			prop.load(fis);
			String browserName=prop.getProperty("browser");
			
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Mohan\\Webdriver\\chromedriver.exe");
				driver=new ChromeDriver();
			}

			else if (browserName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\Mohan\\Webdriver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			}

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}
	


	}

}
