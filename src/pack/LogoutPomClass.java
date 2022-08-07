package pack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPomClass
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement settingButton;
	
	public void clickonsettingButton() 
	{
		settingButton.click();
	}

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutButton;
	
	public void clickonlogoutButton() 
	{
		logoutButton.click();
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocartbutton;
	
	public void clickonaddtocartbutton() 
	{
		addtocartbutton.click();
	}
	
	
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement adcart;
	
	public String getTextFromCartButton()
	{
		 String totalProducts= adcart.getText();
		 return totalProducts;
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> addtoMultiplecarts;
	

	public void Addall() 
	{
		for(int i=1;i<addtoMultiplecarts.size();i++) 
		{
			addtoMultiplecarts.get(i).click();
		}
	}
	
//	@FindBy(xpath="")
//	private WebElement clickall;
//	
//	public String clickallproduct()
////	{}
	
	public LogoutPomClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
