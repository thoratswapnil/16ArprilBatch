package pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginFunctionality
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","G:\\automation files\\chrome folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		LoginPomClass lp=new LoginPomClass(driver);
		lp.sendusername();
		lp.sendPassword();
		lp.clickonloginbutton();
		
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("we have successfully logined to saucedmo ");
		    System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.quit();
		System.out.println("broswer is closed");

	}

}
