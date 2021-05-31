package Main;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser
{
	static
	{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	 
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://10.95.63.14/configurator/HTML5/HtmlMenu.aspx");
		String wh = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='txtUserId']")).sendKeys("tester4");
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@id='ddlRole']")).click();
		Thread.sleep(2000);
		WebElement role = driver.findElement(By.xpath("//select[@id='ddlRole']"));
		Select s = select(role);
		s.selectByVisibleText("DO UNDERWRITER");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='txtPwd']")).sendKeys("cmc123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//		Alert al = driver.switchTo().alert();
//		al.accept();
//		Thread.sleep(3000);
//		Set<String> whs = driver.getWindowHandles();
//		System.out.println(whs.size());
//		for(String k:whs)
//		{
//		   System.out.println(k);
//			if(k.equals("CDwindow-F2A0C204E2E40BC2F072BD777B1FC57B"))
//			{
//				driver.close();
//			}
//			
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='txtPwd']")).sendKeys("cmc123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//		Thread.sleep(3000);
//		
//		
//		for(String k:whs)
//		{
//		
//			if(k.equals("CDwindow-F2A0C204E2E40BC2F072BD777B1FC57B"))
//			{
//				driver.close();
//			}
//		}
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='txtPwd']")).sendKeys("cmc123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();	
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Process Flow']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='MyFrame']"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		WebElement selectdrop = driver.findElement(By.xpath("//span[text()= 'LOB']/../../td[2]/select"));
		Select s1 = select(selectdrop);
		s1.selectByVisibleText("Health");
		Thread.sleep(3000);
		WebElement pro = driver.findElement(By.xpath("//select[@id='ProductMenu_ddlProduct']"));
		Select prod = select(pro);
		prod.selectByVisibleText("Overseas Mediclaim Policy");
		Thread.sleep(3000);
		String Pwh = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Underwriting']")).click();
		Thread.sleep(2000);
		Set<String> cwh = driver.getWindowHandles();
		System.out.println("windows size"+cwh.size());
		for(String w:cwh)
		{
			if(w.contains(Pwh))
			{
				System.out.println(driver.getTitle());
			}
			else
			{
				System.out.println("***********************");
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("(//input[@class='btn btn-link'])[1]")).click();
				Set<String> cwh1  =  driver.getWindowHandles();
				System.out.println("windows size"+cwh1.size());
				
			}
		}
		
		
		
	}
	 public static Select select(WebElement element)
	 {
		 return new Select(element);
	 }

}
