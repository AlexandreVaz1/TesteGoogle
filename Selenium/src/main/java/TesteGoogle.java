import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Alexandre Vaz\\Documents\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	 	WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		System.out.println(driver.getTitle());
	}
}
