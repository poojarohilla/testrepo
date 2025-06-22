package seleniumday4;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class locators implements I {
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  driver = new ChromeDriver();
		
		 locators obj1 = new locators();
		 obj1.open_webpage();
		 Thread.sleep(3000);
		 obj1.verify_webpage();
		 obj1.enter_data();
		 Thread.sleep(3000);
		 obj1.close_chrome();
		 
	}

	@Override
	public void verify_webpage() {
		// TODO Auto-generated method stub
		 String webform =driver.findElement(By.tagName("h1")).getText();
		  String textinput =driver.findElement(By.className("form-label")).getText();
		  String password = driver.findElement(By.name("my-password")).getText();
	     //String password = driver.findElement(By.xpath("//label['form-label w-100' and text()='Password']")).getText();
		 if (webform.equals("Web form"))
				 {
			 System.out.println(TCP);
				 }
		 else
		 {
			 System.out.println(TCF);
		 }
		 
		 //String input = driver.findElement(By.name("my-text"))
		 System.out.println(webform);
		 System.out.println(textinput);
		 System.out.println(password);
	}
     public void open_webpage() 
     {
    	 driver.get(baseurl);
		 driver.manage().window().maximize();
		
     }
     
     public void close_chrome()
     {
    	 driver.close();
     
     }
     
     public void enter_data()
     {
    	 driver.findElement(By.id("my-text-id")).sendKeys("Pooja Rohilla");
    	 driver.findElement(By.name("my-password")).sendKeys("123456"); // driver.findElement(By.name("my-text")).sendKeys("Pooja Rohilla");
     }
}
