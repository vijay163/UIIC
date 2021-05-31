package Com.UIIC.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage 
{
	@FindBy(xpath = "//div[@id='e0_6840i']")
	private WebElement AccountInbox;
	
	@FindBy(xpath = "//div[@id='e0_6841i']")
	private WebElement bankGuarantee;
	
	@FindBy(xpath = "//div[@id='e0_6852i']")
	private WebElement bulkJVEntry;
	
	@FindBy(xpath = "//div[@id='e0_6853i']")
	private WebElement chequeMatiance;
	
	@FindBy(xpath = "//div[@id='e0_6854i']")
	private WebElement chequeBookMaster;
	
	@FindBy(xpath = "//div[@id='e0_6855i']")
	private WebElement chequeBookMasterAdd;
	
	@FindBy(xpath = "//div[@id='e0_6856i']")
	private WebElement chequeBookMasterModify;
	
	@FindBy(xpath = "//div[@id='e0_6857i']")
	private WebElement chequeBookMasterView;
	
	@FindBy(xpath = "//div[@id='e0_6859i']")
	private WebElement coinsureSetteliment;
	
	@FindBy(xpath = "//div[@id='e0_6860i']")
	private WebElement collectionProcess;
	
	@FindBy(xpath = "//div[@id='e0_6876i']")
	private WebElement commissionmng;
	
	@FindBy(xpath = "//div[@id='e0_6877i']")
	private WebElement adminChargeDis;
	
	@FindBy(xpath = "//div[@id='e0_6878i']")
	private WebElement billCancellation;
	
	@FindBy(xpath = "//div[@id='e0_6880i']")
	private WebElement billGeneration;
	
	@FindBy(xpath = "//div[@id='e0_6881i']")
	private WebElement billReportDetails;
	
	@FindBy(xpath = "//div[@id='e0_6882i']")
	private WebElement billTracker;
	
	@FindBy(xpath = "//div[@id='e0_6883i']")
	private WebElement bussinessTrans;
	
	@FindBy(xpath = "//div[@id='e0_6884i']")
	private WebElement interMediatoryCon;
	
	@FindBy(xpath = "//div[@id='e0_6885i']")
	private WebElement MISPrewardBIll;
	
	@FindBy(xpath = "//div[@id='e0_6886i']")
	private WebElement NonMispRewardBill;
	
	@FindBy(xpath = "//div[@id='e0_6887i']")
	private WebElement profisinolTaxCer;
	
	@FindBy(xpath = "//div[@id='e0_6888i']")
	private WebElement rewardBillEdit;
	
	@FindBy(xpath = "//div[@id='e0_6889i']")
	private WebElement disburesMentprocess;
	
	@FindBy(xpath = "//div[@id='e0_6890i']")
	private WebElement depositRefund;
	
	@FindBy(xpath = "//div[@id='e0_6891i']")
	private WebElement misDisburse;
	
	@FindBy(xpath = "//div[@id='e0_6892i']")
	private WebElement misDisburesGST;
	
	@FindBy(xpath = "//div[@id='e0_6893i']")
	private WebElement NeftApproval;
	
	@FindBy(xpath = "//div[@id='e0_6894i']")
	private WebElement pettyCash;
	
	@FindBy(xpath = "//div[@id='e0_6895i']")
	private WebElement reinsuranceMisc;
	
	@FindBy(xpath = "//div[@id='e0_6896i']")
	private WebElement rewardBillDisburse;
	
	@FindBy(xpath = "//div[@id='e0_6897i']")
	private WebElement genralLedgerView;
	
	@FindBy(xpath = "//div[@id='e0_6898i']")
	private WebElement genralSolution;
	
	@FindBy(xpath = "//div[@id='e0_6899i']")
	private WebElement interOfficeFundTrans;
	
	@FindBy(xpath = "//div[@id='e0_6900i']")
	private WebElement journalVocherEntry;
	
	@FindBy(xpath = "//div[@id='e0_6901i']")
	private WebElement journalVocherwithGST;
	
	@FindBy(xpath = "//div[@id='e0_6902i']")
	private WebElement masterEntry;
	
	@FindBy(xpath = "//div[@id='e0_6941i']")
	private WebElement MiscelaneousCollection;
	
	@FindBy(xpath = "//div[@id='e0_6942i']")
	private WebElement periodicProcess;
	
	@FindBy(xpath = "//div[@id='e0_6943i']")
	private WebElement certificateAccountCloser;
	
	@FindBy(xpath = "//div[@id='e0_6944i']")
	private WebElement certificateAccountCloserWF;
	
	@FindBy(xpath = "//div[@id='e0_6945i']")
	private WebElement monthCloseOper;
    
	@FindBy(xpath = "//div[@id='e0_6946i']")
	private WebElement openingBalanceCapture;
	
	@FindBy(xpath = "//div[@id='e0_6947i']")
	private WebElement yearEndingJV;
	
	@FindBy(xpath = "//div[@id='e0_6948i']")
	private WebElement yearOpenOperation;
	
	@FindBy(xpath = "//div[@id='e0_6949i']")
	private WebElement yearOpenOperationWF;
	
	@FindBy(xpath = "//div[@id='e0_6950i']")
	private WebElement Query;
	
	
	@FindBy(xpath = "//div[@id='e0_6958i']")
	private WebElement reports;
	
	@FindBy(xpath = "//div[@id='e0_6959i']")
	private WebElement SixtyFourVBreports;
	
	@FindBy(xpath = "//div[@id='e0_6960i']")
	private WebElement agentCommissionRep;
	
	@FindBy(xpath = "//div[@id='e0_6961i']")
	private WebElement cdUtilizationReports;
	
	@FindBy(xpath = "//div[@id='e0_6962i']")
	private WebElement centralizedreceipt;
	
	@FindBy(xpath = "//div[@id='e0_6963i']")
	private WebElement chequeDishonouredSta;
	
	@FindBy(xpath = "//div[@id='e0_6964i']")
	private WebElement dealerDialyPortalPremiumRep;
	
	@FindBy(xpath = "//div[@id='e0_6965i']")
	private WebElement duplicatePaySlip;
	
	@FindBy(xpath = "//div[@id='e0_6966i']")
	private WebElement journalVocherRep;
	
	@FindBy(xpath = "//div[@id='e0_6967i']")
	private WebElement SummaryOf64VBCompliantForMigratedPolicy;
	
	@FindBy(xpath = "//div[@id='e0_6968i']")
	private WebElement sunGLExtractRep;
	
	@FindBy(xpath = "//div[@id='e0_6969i']")
	private WebElement systemHealthCheck;
	
	@FindBy(xpath = "//div[@id='e0_6970i']")
	private WebElement tpaServiceChargeRep;
	
	@FindBy(xpath = "//div[@id='e0_6971i']")
	private WebElement trailBalaceRep;
	
	@FindBy(xpath = "//div[@id='e0_6972i']")
	private WebElement voucherPrinting;
	
	@FindBy(xpath = "//div[@id='e0_6973i']")
	private WebElement stalechequeMNG;
	
	@FindBy(xpath = "//div[@id='e0_6974i']")
	private WebElement tdsMNG;
	
	@FindBy(xpath = "//div[@id='e0_6975i']")
	private WebElement tdsApproval;
	
	@FindBy(xpath = "//div[@id='e0_6976i']")
	private WebElement tdsApprovalWidth;
	
	@FindBy(xpath = "//div[@id='e0_6977i']")
	private WebElement tdsChallan;
	
	@FindBy(xpath = "//div[@id='e0_6978i']")
	private WebElement tdsPayments;
	
	@FindBy(xpath = "//div[@id='e0_6979i']")
	private WebElement vocherCancellation;
	
	
	
	
	
	
	
	
	
	
	
	public AccountsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
