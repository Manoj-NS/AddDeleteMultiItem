package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingCart {
	
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
	
/*	
	// Re-locate the search box after the page reloads, then perform a new search with Enter key
    searchTextbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
    searchTextbox.clear();
    searchTextbox.sendKeys(searchKeyword + Keys.ENTER);
  
    */
	
    // Verify that the search results page is displayed again
    isTitleContains = wait.until(ExpectedConditions.titleContains(searchKeyword));
    System.out.println("Enter key search result displayed: " + isTitleContains);
    
	List<WebElement> itemTotalList = driver.findElements(By.xpath("//span[contains(text(), 'Samsung Galaxy')]"));
	System.out.println("Total Items: "+itemTotalList.size());
		
	   String[] items = {"Galaxy S23", "Galaxy M35", "Galaxy M05","Galaxy M35"};
	  
	   String addItems=String.join(", ", items); 
	  System.out.println("Added Item: "+addItems);
	
	for (WebElement item : itemTotalList) {
		String itemText=item.getText();
		
	    System.out.println("Available Items: "+itemText);
	
	if(addItems.contains(itemText)) {
			
		if (item.isDisplayed() && item.isEnabled()) {
            item.click();
            System.out.println("Clicked on item: " + itemText);
        } else {
            System.out.println("Item is not clickable: " + itemText);
        }
    }
	
	}
	
	
	
	
	
	
//	driver.quit();
	
	}

}
	
	
