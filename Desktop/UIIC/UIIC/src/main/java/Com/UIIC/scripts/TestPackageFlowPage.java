package Com.UIIC.scripts;

import java.util.Set;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Com.UIIC.genrics.BaseTestclass;
import Com.UIIC.genrics.FWUtills;
import Com.UIIC.object.HomePage;
import Com.UIIC.object.PackageFlowPage;

public class TestPackageFlowPage extends BaseTestclass
{
	@Test
	public void testHome() throws InterruptedException
	{
		String us = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,0);
		String ps = FWUtills.read_XL_Data(XL_DATA_PATH,"LoginPage",1,1);
		System.out.println(us);
		System.out.println(ps);
		HomePage hp=new HomePage(driver);
		hp.enterUser(us);
		Thread.sleep(500);
		hp.selectRole();
		Thread.sleep(500);
		hp.enterPass(ps);
		Thread.sleep(500);
		hp.clickLogin();
		String pwh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs.size());
		for(String k:whs)
		{
		   System.out.println(k);
			if(k.equals("CDwindow-F2A0C204E2E40BC2F072BD777B1FC57B"))
			{
				driver.close();
			}
			
		}
	    Thread.sleep(2000);
			hp.enterPass(ps);
			hp.clickLogin();
		
		for(String k:whs)
		{
		
			if(k.equals("CDwindow-F2A0C204E2E40BC2F072BD777B1FC57B"))
			{
				driver.close();
			}
	
		}
		Thread.sleep(2000);
		hp.enterPass(ps);
		hp.clickLogin();
		Thread.sleep(3000);		
		
		PackageFlowPage pf=new PackageFlowPage(driver);
		pf.clickProcessFlowLink();
		Thread.sleep(5000);
		pf.clickUnderWrite();
	    
   }

}