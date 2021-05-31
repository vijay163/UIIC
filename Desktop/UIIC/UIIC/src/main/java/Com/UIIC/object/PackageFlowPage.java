package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.UIIC.genrics.FWUtills;

public class PackageFlowPage 
{
	@FindBy(xpath = "//a[text()='Process Flow']")
	private WebElement processFlowLink;
	
	@FindBy(xpath = "//select[@id='LobMenu_ddlLOB']")
	private WebElement LOBlistBox;
	
	@FindBy(xpath = "//input[@id='LobMenu_btnClose']")
	private WebElement LOBcloseBTN;
	
	@FindBy(xpath = "//input[@id='LobMenu_btnPanelController']")
	private WebElement notiExpandBTN;
	
    @FindBy(xpath = "//select[@id='ConfiguratorTracker_ddlSearchID']")
	private WebElement selectIdDorpBox;
	
	@FindBy(xpath = "//input[@id='ConfiguratorTracker_txtID']")
	private WebElement IdCheckBox;
	
	@FindBy(xpath = "//input[@value='Go']")
	private WebElement idGoBtn;
	
	@FindBy(xpath = "//input[@value='Initiate']")
	private WebElement IdInitiateBTn;
	
	@FindBy(xpath = "//select[@id='ProductMenu_ddlProduct']")
	private WebElement ProductDRopbox;
	
	@FindBy(xpath = "//select[@id='ProductMenu_ddlMode']")
	 private WebElement UWDropBox;
	
	@FindBy(xpath = "//input[@id='ProductMenu_chkQuoteToProposal']")
	private WebElement UWQoCheckBox;
	
	@FindBy(xpath = "//input[@id='ProductMenu_chkViewPolicy']")
	private WebElement UICheckBox;
	
	@FindBy(xpath = "//input[@id='ProductMenu_rblUISetList_0']")
	private WebElement Uiset1;
	
	@FindBy(xpath = "//input[@id='ProductMenu_rblUISetList_1']")
	private WebElement Uiset3;
	
	@FindBy(xpath = "//input[@id='ProductMenu_rblUISetList_2']")
	private WebElement Uiset6;
	
	@FindBy(xpath = "//a[text()='Underwriting']")
	private WebElement UnderwriteLink;
	
	public PackageFlowPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickProcessFlowLink()
	{
		processFlowLink.click();
	}
	public Select select()
	{
		return FWUtills.select(LOBlistBox);
	}
//	public void selectLOB()
//	{
//      Select s = FWUtills.select(LOBlistBox);
//	}
	public void clickCloseLobBtn()
	{
		LOBcloseBTN.click();
	}
	public void clickdetailsExBtn()
	{
		notiExpandBTN.click();
	}
	public void selectIDtype(String id)
	{
		selectIdDorpBox.sendKeys(id);
	}
	public void enterID(String num)
	{
		IdCheckBox.sendKeys(num);
	}
	public void clickGoBtn()
	{
		idGoBtn.click();
	}
	public void clickInitateBtn()
	{
		IdInitiateBTn.click();
	}
	public void selectSubProduct(String pro)
	{
		ProductDRopbox.sendKeys(pro);
	}
	public void selectUW(String uw)
	{
		UWDropBox.sendKeys(uw);
	}
	public void selectUWchbox()
	{
		UWQoCheckBox.click();
	}
	public void selectviewchBOX()
	{
		UICheckBox.click();
	}
	public void selectSet1()
	{
		Uiset1.click();
	}
	public void selectSet3()
	{
		Uiset3.click();
	}
	public void selectSet6()
	{
		Uiset6.click();
	}
	public void clickUnderWrite()
	{
		UnderwriteLink.click();
	}
	
	
	
	


}
