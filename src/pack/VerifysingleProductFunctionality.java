package pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifysingleProductFunctionality 
{
	WebDriver driver;
		@BeforeMethod
		public void method1() {
		System.setProperty("webdriver.chrome.driver","G:\\automation files\\chrome folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPomClass lp=new LoginPomClass(driver);
		lp.sendusername();
		lp.sendPassword();
		lp.clickonloginbutton();}
		@Test
		public void method2() {
		LogoutPomClass np=new LogoutPomClass(driver);
         np.clickonaddtocartbutton();
         String actualtotalcount=np.getTextFromCartButton();
         String expectedcount="1";
         System.out.println(actualtotalcount);
         if(expectedcount.equals(actualtotalcount))
        		 {
        	 System.out.println("tc is passed");
        		 }
         else 
         {
        	 System.out.println("tc is passed");
         }}
        
}
