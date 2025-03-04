package programs;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Maximumfromtable {
	
	    public static void main (String[] args) throws ParseException { 
	        String max;
	        double m=0,r=0;
	        WebDriver wd; 
	        
	        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	        wd = new ChromeDriver();
	        
	        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
	        //No. of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        
	        for (int i =0;i<rows.size();i++)
	        {    
	            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	           
	            NumberFormat f =   NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
	        wd.close();
	    }
	}
