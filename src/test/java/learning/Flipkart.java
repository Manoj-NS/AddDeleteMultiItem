package learning;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Flipkart {


public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		WebElement Searchboxelement = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Searchboxelement.sendKeys("Smarphones", Keys.ENTER);
		
		
		
		List<WebElement> brandCheckboxes= driver.findElements(By.xpath("//div[@class='ewzVkT _3DvUAf']"));
		
		int checkboxSize=brandCheckboxes.size();
		System.out.println("Visible Checkboxes are "+checkboxSize);
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		
			
	//		Random random = new Random();
			
			for (WebElement randomSelect : brandCheckboxes) {
				
	            String select = randomSelect.getText();
	            wait.until(ExpectedConditions.elementToBeClickable(randomSelect));
						
	            // System.out.println(selct);
									 			
			if(select.equals("Apple") || select.equals("Google")|| select.equals("vivo")) {
		//		if(random.nextBoolean()) {
					randomSelect.click();
					System.out.println("Selected: " + select);
					
					
				//		Thread.sleep(6000);
					
		//			}
				
			}
	    }
	}

}