package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCart {
	
	public static void main (String [] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		String searchKeyword = "Samsung Smartphones";
		
		WebElement searchTextbox= driver.findElement(By.id("twotabsearchtextbox")); 
		searchTextbox.sendKeys(searchKeyword);
		
		WebElement searchButtom = driver.findElement(By.id("nav-search-submit-button"));
		searchButtom.click();
		
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
		
		Boolean isTitleContains = wait.until(ExpectedConditions.titleContains(searchKeyword));
		System.out.println("Search result displayed: "+isTitleContains);
		
		List<WebElement> itemTotalList = driver.findElements(By.xpath("//span[contains(text(), 'Samsung Galaxy')]"));
		System.out.println("Total Items: " + itemTotalList.size());

		String[] items  = {
							"Samsung Galaxy S23 Ultra 5G AI Smartphone (Green, 12GB, 256GB Storage)",
							"Samsung Galaxy F15 5G (Groovy Violet, 6GB RAM, 128 GB Storage)",
							"Samsung Galaxy S20 FE 5G (Cloud Navy, 8GB RAM, 128GB Storage)"
				
		
		}; //, "Galaxy M35", "Galaxy M05", "Galaxy M35"
		String addItems = String.join(", ", items);
		System.out.println("Added Item: " + addItems);

		// Loop through the found items
		for (WebElement item : itemTotalList) {
		    String itemText = item.getText();
		    System.out.println("Available Items: " + itemText);
		    
		    // Check if item text is part of the added items
		    if (addItems.contains(itemText)) {  // Changed to contains for partial match
		        // Check if the item is displayed and clickable
		        if (item.isDisplayed() && item.isEnabled()) {
		            item.click();
		            System.out.println("Clicked on item: " + itemText);
		           		            
		        } else {
		            System.out.println("Item is not clickable: " + itemText);
		        }
		    }
		}
		
		

		
	}

}
