package TestMethods;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SmokeTest.Base;
import SmokeTest.CCPageObjects;

public class CreateTemplates extends Base {

	// WebDriver driver;

	PDDocument document = null;
	String pdfcontent;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {

		driver = Base.initialiseBrowser();
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.Login("spandana.dasari", "Space@22");

		// ccwebelements.Login(TestDataInMap.get(0).get("Username"),
		// TestDataInMap.get(0).get("Password"));

	}

	@Test(priority = 0) // anylob
	public void SCTemplate4000() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407186");
		ccwebelements.createaTemplate4000("4000", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}
/*
	@Test(priority = 1) // Motor lob, dpa in 3rd page check once
	public void SCTemplate1013() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407186");
		ccwebelements.createaTemplate1013("1013", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}

	@Test(priority = 2) // Motor lob, dpa in 2nd page check once
	public void SCTemplate1010() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407186");
		ccwebelements.createaTemplate1010("1010", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}

	@Test(priority = 3) // Motor lob, dpa in 2nd page check once
	public void SCTemplate1040() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407186");
		ccwebelements.createaTemplate1040("1040", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}

	@Test(priority = 4) // property lob, dpa in 2nd page check once
	public void SCTemplate3026() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407187");
		ccwebelements.createaTemplate3026("3026", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}

	@Test(priority = 5) // Motor lob, dpa in 2nd page check once
	public void SCTemplate1045() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407188");
		ccwebelements.createaTemplate1045("1045", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}

	@Test(priority = 6) // Motor lob, dpa in 2nd page check once
	public void SCTemplate1046() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407188");
		ccwebelements.createaTemplate1046("1046", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);
	}

	@Test(priority = 7) // Motor lob, dpa in 3rd page check once policy#
	public void SCTemplate1115() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407188");
		ccwebelements.createaTemplate1115("1115", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}

	@Test(priority = 7) // Motor lob, dpa in 3rd page check once policy#
	public void SCTemplate1330() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407188");
		ccwebelements.createaTemplate1330("1330", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);
	}

	@Test(priority = 9) // Motor lob, dpa in 3rd page check once policy#
	public void SCTemplate3024() throws InterruptedException, IOException {
		CCPageObjects ccwebelements = PageFactory.initElements(driver, CCPageObjects.class);
		ccwebelements.clearsearch("20-50-407187");
		ccwebelements.createaTemplate3024("3024", "sit.user@zurich.uk.sit", "Situser@123");
		Thread.sleep(10000);

	}
	*/

	/*
	 * @Test(priority=1) public void CreateSCTemplate1009() throws
	 * InterruptedException, IOException { CCPageObjects ccwebelements =
	 * PageFactory.initElements(driver, CCPageObjects.class); List<Map<String,
	 * String>> TestDataInMap=ExcelUtilities.getTestDataInMap();
	 * ccwebelements.clearsearch(TestDataInMap.get(0).get("ClaimNumber"));
	 * ccwebelements.createatemplate1009(TestDataInMap.get(1).get("TemplateID"),
	 * TestDataInMap.get(1).get("Username"),
	 * TestDataInMap.get(1).get("Password")); Thread.sleep(10000);
	 * 
	 * }
	 * 
	 * 
	 * @Test(priority=2) public void downloadodocument() throws IOException,
	 * InterruptedException { CCPageObjects ccwebelements =
	 * PageFactory.initElements(driver, CCPageObjects.class); List<Map<String,
	 * String>> TestDataInMap=ExcelUtilities.getTestDataInMap();
	 * ccwebelements.clearsearch(TestDataInMap.get(0).get("docdownload"));
	 * ccwebelements.downloaddoc(); }
	 */

	/*
	 * @AfterMethod public void quitbrowser() { driver.quit(); }
	 */

	/*
	 * @Test(priority=0) public void pdfcomparision() throws
	 * InterruptedException, IOException { getzipfilename.
	 * zipname("C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\downloadtest"
	 * );
	 * 
	 * Thread.sleep(3000);
	 * 
	 * String unzipfilepath =
	 * "C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\downloadtest"
	 * +"\\"+getzipfilename.zipfile;
	 * 
	 * unzipTemplate uz = new unzipTemplate();
	 * 
	 * uz.unzip(unzipfilepath,
	 * "C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\downloadtest"
	 * ); Thread.sleep(10000); System.out.println("Unzipping is successful");
	 * 
	 * Movingdownloadedfilestodirectory mfd = new
	 * Movingdownloadedfilestodirectory(); mfd.
	 * movefilesTodirectory("C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\downloadtest"
	 * ,
	 * "C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\ActualPDF\\Download and Unzip and moved.pdf"
	 * ); Thread.sleep(10000); System.out.println("PDF Moved to Directory");
	 */

	// DPAContent.readPDFTest();
	/*
	 * String
	 * pdf1="C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\ActualPDF\\Freetext.pdf"
	 * ; String
	 * pdf2="C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\ActualPDF\\Freetext_Edited.pdf"
	 * ; String
	 * screenshotPath="C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium folders\\tests\\UKGWCC\\compareddocsResults"
	 * ;
	 * 
	 * pdfsComparission pdfscomp = new pdfsComparission();
	 * pdfscomp.pdfcomp(pdf1, pdf2, screenshotPath);
	 */

}
/*
 * @Test public void downloadandunzip() throws InterruptedException, IOException
 * { /*driver.findElement(By.
 * xpath("(//a[@class='wpdm-download-link download-on-click btn btn-primary '])[1]"
 * )).click(); Thread.sleep(10000);
 */
// Movingdownloadedfilestodirectory.movefilesTodirectory("C:\\Users\\jgajjave\\Downloads\\Test3.pdf",
// "C:\\Users\\jgajjave\\Documents\\desktop docs\\Selenium
// folders\\tests\\UKGWCC\\PDFpath");

/*
 * CCPageObjects ccwebelements = PageFactory.initElements(driver,
 * CCPageObjects.class); List<Map<String, String>>
 * TestDataInMap=ExcelUtilities.getTestDataInMap();
 * ccwebelements.clearsearch("20-50-406210"); ccwebelements.downloaddoc();
 */
// }
