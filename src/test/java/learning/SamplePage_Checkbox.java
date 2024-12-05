package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplePage_Checkbox {
	
	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		//Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
//		WebElement option = driver.findElement(By.className("grunion-field-wrap grunion-field-checkbox-multiple-wrap"));
		List <WebElement> options= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i < options.size(); i++) {
		//	System.out.println("Checkboxes are: "+i);
			WebElement option=options.get(i);
			option.click();
			
			System.out.println("Cboxheck " + (i + 1) + " has been clicked"); 
			
		}
					}

}
