package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsQueryPage
{
	@FindBy(xpath = "//div[@id='e0_6951i']")
	private WebElement bankBalanceQuery;
	
	@FindBy(xpath = "//div[@id='e0_6952i']")
	private WebElement DailyCollectionSum;
	
	@FindBy(xpath = "//div[@id='e0_6953i']")
	private WebElement generalLedgerBal;
	
	@FindBy(xpath = "//div[@id='e0_6954i']")
	private WebElement paymentdetails;
	
	@FindBy(xpath = "//div[@id='e0_6955i']")
	private WebElement ProposalDetails;
	
	@FindBy(xpath = "//div[@id='e0_6956i']")
	private WebElement taggingDetails;
	
	@FindBy(xpath = "//div[@id='e0_6957i']")
	private WebElement voucherDetails;
	
	public AccountsQueryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickBankbalanceQuery()
	{
		bankBalanceQuery.click();
	}
	public void clickDailyCollection()
	{
		DailyCollectionSum.click();
	}
	public void clickGeneralledgerbal()
	{
		generalLedgerBal.click();
	}
	public void clickPaymentDetails()
	{
		paymentdetails.click();
	}
	public void clickPropDetails()
	{
		ProposalDetails.click();
	}
	public void clickTaggingDetails()
	{
		taggingDetails.clear();
	}
	public void clickVoucherDeatils()
	{
		voucherDetails.click();
	}

}
