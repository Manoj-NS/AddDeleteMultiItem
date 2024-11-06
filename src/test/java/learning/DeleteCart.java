package learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteCart {
	
	public static void main(String[] args) {

	 // Setup WebDriver (use WebDriverManager if configured, else provide driver path)
	ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.manage().window().maximize();
    
    // Initialize WebDriverWait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    
    try {
        // Navigate to the shopping site
        driver.get("https://www.amazon.in/s?k=Samsung+Smartphones&ref=nb_sb_noss");
        
        // Add 3 items to the cart (assuming items have 'Add to Cart' buttons with a similar selector)
        for (int i = 1; i <= 3; i++) {
            WebElement addToCartButton = wait.until
            (ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Add to Cart')])[" + i + "]")));
            addToCartButton.click();
            System.out.println("Item " + i + " added to the cart.");
            
        }
        
        Thread.sleep(5000);

        // Go to the cart page
        WebElement cartButton = driver.findElement(By.id("nav-cart-count"));
        cartButton.click();
        
        

        // Remove all items from the cart
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//input[@value='Delete']"));
		
		  for (int i = 0; i < deleteButtons.size(); i++) {
		
          WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(deleteButtons.get(i)));
          deleteButton.click(); 
		  System.out.println("Item " + (i + 1) + " removed from the cart."); 
		  
		  }
		 
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    } 
    
//    finally {
//        // Close the browser
//        driver.quit();
//    }
}
}
