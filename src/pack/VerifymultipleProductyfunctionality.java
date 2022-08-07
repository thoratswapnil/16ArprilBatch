package pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifymultipleProductyfunctionality
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\automation files\\chrome folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPomClass lp=new LoginPomClass(driver);
		lp.sendusername();
		lp.sendPassword();
		lp.clickonloginbutton();
		
		LogoutPomClass np=new LogoutPomClass(driver);
		np.Addall();
		
		String Actualcount=np.getTextFromCartButton();
		String expectedCount="6";
		
		if(expectedCount.equals(Actualcount))
		{
			System.out.println("tc is passed");
		}
		else 
		{
			System.out.println("tc is failed");
		}
	}

}
