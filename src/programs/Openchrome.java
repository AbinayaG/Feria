package programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Openchrome {

	public static void main(String[] args) {
		// --> Firefox driver
		
	//	System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
	//	FirefoxDriver driver = new FirefoxDriver();
	//	driver.get("https://www.google.co.in");
	//	System.out.println(driver.getTitle());
		//driver.close();
		
		//--> Internet Explorer driver
		
		/*System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
		InternetExplorerDriver driver1 = new InternetExplorerDriver();
		driver1.get("https://www.amazon.com/");
		System.out.println(driver1.getTitle());
*/
		// --> Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\workspace\\Seleniumtraining\\driver\\chromedriver.exe");
		ChromeDriver driver2= new ChromeDriver();
		driver2.get("https://www.facebook.com/");
		System.out.println(driver2.getTitle());
		
	}

}
