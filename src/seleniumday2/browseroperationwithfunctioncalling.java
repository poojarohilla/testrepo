package seleniumday2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseroperationwithfunctioncalling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       browseroperationwithfunctioncalling obj = new  browseroperationwithfunctioncalling();
       obj.bo();
	}



  void bo() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://dev.facilityhealthinc.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String WH = driver.getWindowHandle();
		System.out.println(WH);
		
		driver.manage().window().minimize();
  }
  
}