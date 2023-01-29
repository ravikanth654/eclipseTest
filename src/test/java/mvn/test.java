package mvn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test 
{
	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String s=driver.getCurrentUrl();
		Assert.assertEquals("https://www.google.com/", s);
		
	}

}
