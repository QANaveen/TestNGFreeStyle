package FreeStyle1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FreeStyle {
	
	@Test
	public void automate()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32new\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		WebElement editbutton = driver.findElement(By.xpath("//a[@href='pages/Edit.html']"));
		editbutton.click();
		WebElement mailbox = driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"email\" ]"));
		mailbox.sendKeys("Naveen@abc.com");
		WebElement append = driver.findElement(By.xpath("//input[@type='text' and @value='Append ']"));
		append.sendKeys("Hello world");
		WebElement gettext = driver.findElement(By.xpath("//input[@type='text' and @value='TestLeaf']"));
		String text = gettext.getAttribute("value");
		System.out.println(text);
		WebElement clear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clear.clear();
		WebElement check  = driver.findElement(By.xpath("//input[@type='text' and @disabled = 'true']"));
		System.out.println(check.isEnabled());
	}

}
