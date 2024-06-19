package SeleniumLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WikipediaSearch {

    public static void main(String[] args) {
	        // Set the path to your FirefoxDriver (if not already in PATH)
	        System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");

	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();

	        // Navigate to Wikipedia
	        driver.get("https://www.wikipedia.com/");

	        // Search for "Artificial Intelligence"
	        WebElement searchInput = driver.findElement(By.name("q"));
	        searchInput. sendKeys("Artificial intelligence"+Keys.ENTER);
	        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
	         searchButton.click();
	        // Click on "History" section
	        WebElement historyLink = driver.findElement(By.linkText("History"));
	        historyLink.click();

	        // Get and print the title of the section
	        String sectionTitle = driver.getTitle();
	        System.out.println("Title of the History section: " + sectionTitle);

	        // Close the browser
	        driver.quit();
	    }
	}


