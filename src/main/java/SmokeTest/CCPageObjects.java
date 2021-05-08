package SmokeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CCPageObjects {

	public WebDriver driver;

	public CCPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='Login-LoginScreen-LoginDV-username']")
	public WebElement Username;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement Password;

	@FindBy(xpath = "//div[text()='Log In']")
	public WebElement LoginButton;

	@FindBy(xpath = "//div[@id='TabBar-ClaimTab']/child::*/following-sibling::*/following-sibling::*/child::*[@class='gw-icon gw-icon--expand']")
	public WebElement claimdropdown;

	@FindBy(xpath = "//input[@name='TabBar-ClaimTab-ClaimTab_FindClaim']")
	public WebElement enterClaimNumber;

	@FindBy(xpath = "//div[@id='TabBar-ClaimTab-ClaimTab_FindClaim_Button']/child::*")
	public WebElement claimSearch;

	@FindBy(xpath = "//div[@id='Claim-ClaimMenuActions']//child::*[@class='gw-action--inner']")
	public WebElement Actionstab;

	@FindBy(xpath = "//div[contains(text(),'Create from a template')]")
	public WebElement createfromtemplate;

	@FindBy(xpath = "//input[@name='ClaimNewDocumentFromTemplate_ZeusWorksheet-NewDocumentFromTemplate_ZeusScreen-DocumentTemplateSearch_ZeusDV-Keywords']")
	public WebElement templateID;

	@FindBy(xpath = "//div[@id='ClaimNewDocumentFromTemplate_ZeusWorksheet-NewDocumentFromTemplate_ZeusScreen-DocumentTemplateSearch_ZeusDV-SearchAndResetInputSet-SearchLinksInputSet-Search']")
	public WebElement searchTemplate;

	@FindBy(xpath = "(//div[contains(@id,'selectButton')])[4]")
	public WebElement selectTemplate4000;

	@FindBy(xpath = "//div[contains(@id,'selectButton')]")
	public WebElement selectTemplate;

	@FindBy(xpath = "//select[@name='DocumentTemplateSearch_ZeusPopup-NewTemplateDocument_ZeusScreen-DocumentDetails_ZeusInputSet-OutputChannel']")
	public WebElement outputChannel;

	@FindBy(name = "DocumentTemplateSearch_ZeusPopup-NewTemplateDocument_ZeusScreen-DocumentDetailsSet_ZeusInputSet-EmailGroup")
	public WebElement emailgroup;

	@FindBy(xpath = "//select[@name='DocumentTemplateSearch_ZeusPopup-NewTemplateDocument_ZeusScreen-DocumentDetailsSet_ZeusInputSet-EmailAddress']")
	public WebElement emailaddress;

	@FindBy(xpath = "//div[contains(text(),'Create Draft Document')]")
	public WebElement createdraftdocument;

	@FindBy(xpath = "//input[@id='okta-signin-username']")
	public WebElement oktaUsername;

	@FindBy(xpath = "//input[@id='okta-signin-submit']")
	public WebElement okatNextbutton;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement oktaPassword;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement okatSignin;

	@FindBy(xpath = "//input[@value='Save Draft']")
	public WebElement saveDraftbutton;

	@FindBy(xpath = "//div[contains(text(),'Return to New Document ')]")
	public WebElement returntonewdoc;

	@FindBy(xpath = "//div[contains(text(),'Send Document')]")
	public WebElement sendocument;

	@FindBy(xpath = "//div[contains(@id, 'selectButton')]")
	public WebElement select1009;

	// styel -- format
	@FindBy(xpath = "//span[contains(text(),'Body')]")
	public WebElement selectstyle;

	@FindBy(xpath = "//span[contains(text(),'Bold_KeepTogether_WithinLine')]")
	public WebElement boldstyle;

	@FindBy(xpath = "//div[contains(@id,'RelatedTo_Input')]//div[@id='DocumentTemplateSearch_ZeusPopup-NewTemplateDocument_ZeusScreen-DocumentDetails_ZeusInputSet-RelatedTo']")
	public WebElement relatedtodropdown;

	@FindBy(xpath = "//select[@name='DocumentTemplateSearch_ZeusPopup-NewTemplateDocument_ZeusScreen-DocumentDetails_ZeusInputSet-RelatedTo']")
	public WebElement RelatedTo;

	@FindBy(xpath = "//select[@name='DocumentTemplateSearch_ZeusPopup-NewTemplateDocument_ZeusScreen-DocumentDetails_ZeusInputSet-Recipient']")
	public WebElement Recepient;

	// redtext
	@FindBy(xpath = "(//div[contains(text(),'Please accept this letter as authority to proceed with repairs in accordance with your quote dated ')]//child::*)[1]")
	public WebElement redtext10091;

	@FindBy(xpath = "//div[contains(text(),'View / Edit Draft Document')]")
	public WebElement vieworeditdraft;

	// documnets downloads --> actions tab
	@FindBy(xpath = "//div[@id='Claim-MenuLinks-Claim_ClaimDocuments']//div[contains(text(),'Documents')]")
	public WebElement ActionsDocuments;

	@FindBy(xpath = "//input[@type='checkbox' and @name='ClaimDocuments-Claim_DocumentsScreen-DocumentsLV-0-_Checkbox']")
	public WebElement selectdocumentcheckbox;

	@FindBy(xpath = "//div[contains(text(),'Add to Download List')]")
	public WebElement addtoDownloadList;

	@FindBy(xpath = "//div[@id='ClaimDocuments-Claim_DocumentsScreen-DocumentsLV_tb-Download']//div[contains(text(),'Download')]")
	public WebElement downloadbutton;

	// Smartcomm username and Password

	@FindBy(xpath = "//input[contains(@id,'username')]")
	public WebElement smartcommusername;

	@FindBy(xpath = "//input[contains(@id,'password')]")
	public WebElement smartcommpassword;

	@FindBy(xpath = "//button[contains(@id,'button')]")
	public WebElement smartcommsignin;

	@FindBy(xpath = "//label[text()='No']//parent::div//input[@type='radio' and contains(@name,'MandatetobeIncluded')]")
	public WebElement mandatetobeIncluded;

	// Methods
	public void RelatedtoClaim() {
		Select relatedtodropdown = new Select(RelatedTo);
		List<WebElement> reldrop = relatedtodropdown.getOptions();
		for (int i = 0; i < reldrop.size(); i++) {
			String dropdownvalue = reldrop.get(i).getText();
			System.out.println(dropdownvalue);
			if (dropdownvalue.contains("Claim")) {
				reldrop.get(i).click();
			}
		}

	}

	public void RelatedtoThirdpartyExposure() {
		Select relatedtodropdown = new Select(RelatedTo);
		List<WebElement> reldrop = relatedtodropdown.getOptions();
		for (int i = 0; i < reldrop.size(); i++) {
			String dropdownvalue = reldrop.get(i).getText();
			if (dropdownvalue.contains("3rd Party")) {
				reldrop.get(i).click();
			}
		}

	}

	public void RelatedtoFirstpartyExposure() {
		Select relatedtodropdown = new Select(RelatedTo);
		List<WebElement> reldrop = relatedtodropdown.getOptions();
		for (int i = 0; i < reldrop.size(); i++) {
			String dropdownvalue = reldrop.get(i).getText();
			if (dropdownvalue.contains("1st Party")) {
				reldrop.get(i).click();
			}
		}

	}

	public void Recipientdropdown() throws InterruptedException {
		Select recipdropdown = new Select(Recepient);
		List<WebElement> recdrop = recipdropdown.getOptions();

		for (int k = 0; k < recdrop.size(); k++) {
			String recipientdropdownvalue = recdrop.get(k).getText();
			System.out.println(recipientdropdownvalue);
			if (recipientdropdownvalue.contains("xx")) {
				recdrop.get(k).click();
			}

		}
	}

	public void mailgroup() {
		Select emailgroupUI = new Select(emailgroup);
		List<WebElement> emailgroupdropdown = emailgroupUI.getOptions();
		for (int k = 0; k < emailgroupdropdown.size(); k++) {
			String emaildropdownvalueUI = emailgroupdropdown.get(k).getText();
			System.out.println(emaildropdownvalueUI);
			if (emaildropdownvalueUI.contains("@")) {
				emailgroupdropdown.get(k).click();
			}
		}

	}

	public void mailAddress() {
		Select selectEmail = new Select(emailaddress);

		List<WebElement> emaildropdown = selectEmail.getOptions();

		for (int k = 0; k < emaildropdown.size(); k++) {
			String emaildropdownvalue = emaildropdown.get(k).getText();
			System.out.println(emaildropdownvalue);
			if (emaildropdownvalue.contains("@")) {
				emaildropdown.get(k).click();
			}
		}

	}

	public void Login(String Uname, String Pword) {
		Username.sendKeys(Uname);
		Password.sendKeys(Pword);
		LoginButton.click();
	}

	public void clearsearch(String ClaimNum) throws InterruptedException {
		claimdropdown.click();
		enterClaimNumber.sendKeys(ClaimNum);
		claimSearch.click();
		Thread.sleep(2000);
	}

	public void createaTemplate4000(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate4000.click();
		Thread.sleep(3000);

		RelatedtoClaim();
		Thread.sleep(4000);
		Recipientdropdown();

		Thread.sleep(5000);
		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(4000);
		

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");

		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();

		Thread.sleep(130000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(2000);
		sendocument.click();

	}

	public void createatemplate1009(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		select1009.click();
		Thread.sleep(5000);
		Select related = new Select(RelatedTo);
		related.selectByVisibleText("(2) 3rd Party Vehicle - Pxxxx MxXxxxxx");
		Thread.sleep(2000);
		Select selectRecipient = new Select(Recepient);
		selectRecipient.selectByVisibleText("Pxxxx MxXxxxxx");

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		Select selectEmail = new Select(emailaddress);
		selectEmail.selectByVisibleText("a@a.com");
		Thread.sleep(2000);

		createdraftdocument.click();
		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		oktaUsername.sendKeys(username);
		okatNextbutton.click();
		oktaPassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		okatSignin.click();

		Thread.sleep(120000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		Thread.sleep(20000);
		saveDraftbutton.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(2000);

		// vieworeditdraft.click();

		Thread.sleep(5000);
		sendocument.click();
	}

	public void createaTemplate1013(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoThirdpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();
		Thread.sleep(3000);

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		Thread.sleep(1000);
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();

		Thread.sleep(120000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(2000);
		sendocument.click();

	}

	public void createaTemplate1010(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(3000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoThirdpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(6000);

		createdraftdocument.click();
		Thread.sleep(4000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();

		Thread.sleep(90000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(7000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate1040(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoThirdpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(4000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();

		Thread.sleep(90000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate3026(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoThirdpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(4000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();

		Thread.sleep(90000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate1045(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoClaim();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(6000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();
		
		Thread.sleep(90000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate1046(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoThirdpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(4000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();
		
		Thread.sleep(90000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate1115(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoFirstpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Central Print");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(4000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();
		
		Thread.sleep(90000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate1330(String templatenum, String username, String oktapwd) throws InterruptedException {

		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoClaim();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Fax");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(4000);
		createdraftdocument.click();
		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();
		
		Thread.sleep(90000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void createaTemplate3024(String templatenum, String username, String oktapwd) throws InterruptedException {
		Actionstab.click();
		Thread.sleep(2000);
		createfromtemplate.click();
		Thread.sleep(2000);
		templateID.sendKeys(templatenum);
		Thread.sleep(2000);
		searchTemplate.click();
		Thread.sleep(2000);
		selectTemplate.click();
		Thread.sleep(3000);

		RelatedtoThirdpartyExposure();
		Thread.sleep(2000);
		Recipientdropdown();

		Select selectOutputChannel = new Select(outputChannel);
		selectOutputChannel.selectByValue("Email");
		Thread.sleep(2000);

		Select selectOutputChannel2 = new Select(outputChannel);
		selectOutputChannel2.selectByValue("Fax");
		Thread.sleep(2000);

		Select selectOutputChannel3 = new Select(outputChannel);
		selectOutputChannel3.selectByValue("Email");
		Thread.sleep(2000);

		mailgroup();
		mailAddress();

		Thread.sleep(2000);
		createdraftdocument.click();
		Thread.sleep(4000);

		driver.switchTo().frame("inetframe");

		driver.switchTo().frame("thunderheadDraftEditorWindow");
		smartcommusername.sendKeys(username);

		smartcommpassword.sendKeys(oktapwd);
		Thread.sleep(1000);
		smartcommsignin.click();
		
		Thread.sleep(90000);

		mandatetobeIncluded.click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("inetframe");
		saveDraftbutton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		returntonewdoc.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		Thread.sleep(4000);
		sendocument.click();

	}

	public void downloaddoc() throws InterruptedException {

		ActionsDocuments.click();
		Thread.sleep(3000);
		selectdocumentcheckbox.click();
		Thread.sleep(2000);
		addtoDownloadList.click();
		Thread.sleep(5000);
		downloadbutton.click();
		Thread.sleep(5000);

	}

}
