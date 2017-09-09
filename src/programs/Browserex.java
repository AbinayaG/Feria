package programs;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", ".//driver//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com/");
		System.out.println(driver.getTitle());
	}

}
