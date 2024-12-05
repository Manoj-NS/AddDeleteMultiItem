package learning;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		
		WebElement Searchboxelement = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Searchboxelement.sendKeys("Smarphones", Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(8));
		
		List<WebElement> brandCheckboxes= driver.findElements(By.xpath("//div[@class='ewzVkT _3DvUAf']"));
		int checkboxSize=brandCheckboxes.size();
		
		System.out.println("Visible Checkboxes are "+checkboxSize);
/*		
		for(int i=0; i<checkboxSize; i++) {
			
		}			
			if (i<5) {
			
			WebElement checkboxSelect=wait.until(ExpectedConditions.elementToBeClickable(brandCheckboxes.get(i)));
					
			checkboxSelect.click();
			Thread.sleep(8000);
			}
		}

		
		for (int i=checkboxSize-20; i<checkboxSize; i++) {
			
			WebElement checkboxSelect2=wait.until(ExpectedConditions.elementToBeClickable(brandCheckboxes.get(i)));
			
			checkboxSelect2.click();
			Thread.sleep(8000);
		}
		
		*/
		
		
		for (WebElement randomSelect: brandCheckboxes) {
		//	WebElement checkboxSelect=
					
			wait.until(ExpectedConditions.elementToBeClickable(randomSelect));
			}
		
			Random random = new Random();
			
			for (WebElement randomSelect2 : brandCheckboxes) {
	            String select = randomSelect2.getText();
						
	//		System.out.println(selct);
			
			
						 			
			if(select.equals("Apple") || select.equals("Google")|| select.equals("vivo")) 
			{
				if(random.nextBoolean()) {
					randomSelect2.click();
			//	Thread.sleep(6000);
					
				}
			}
		}
	}
}
