import org.openqa.selenium.remote.DesiredCapabilities;


public class HubNode {
	
	public static void main(String[] args) 
		
		DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName("firefox");
	dc.setPlatform(Platform.WINDOWS);
	
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.57:4444/wd/hub"),dc);

)
}
