package SeleniumDemo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLanuch {

	public static void main(String[] args) {
		
//		To set project location in the variable 
		String projectPath = System.getProperty("user.dir");
		
//		To print the location of project 
		System.out.println("projectPath: " +projectPath);
		
		System.setProperty("webdriver.gecko.driver",projectPath+ "\\Drivers\\geckodriver\\geckodriver.exe");
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());
		
		driver.quit();

		

	}

}
