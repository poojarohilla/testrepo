package seleniumday4;

import org.openqa.selenium.By;

public interface I {

	String baseurl=  "https://www.selenium.dev/selenium/web/web-form.html";
	String TCP = "test case pass";
	String TCF = "test case fail";
	
	
	//By webform = By.tagName("h1");
	
	//By textinput = By.className("form-label");
	
	
	
	void verify_webpage();
	void open_webpage();
    void enter_data();
	void close_chrome();
}
