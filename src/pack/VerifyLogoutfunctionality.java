package pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogoutfunctionality 
{
	@Test
	public void verifyLogoutFunctionality() {
		System.setProperty("webdriver.chrome.driver","G:\\automation files\\chrome folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPomClass lp=new LoginPomClass(driver);
		lp.sendusername();
		lp.sendPassword();
		lp.clickonloginbutton();
		
		LogoutPomClass np=new LogoutPomClass(driver);
		np.clickonsettingButton();
		np.clickonlogoutButton();
		
        String expectedTitle = "Swag Labs";
        String actualresult=driver.getTitle();
        
        if(expectedTitle.equals(actualresult)) 
        {
        	System.out.println("tc is passed");
        }
        else 
        {
        	System.out.println("tc is failed");
        	driver.quit();
    		System.out.println("broswer is closed");
        }
		
		
	}

}
