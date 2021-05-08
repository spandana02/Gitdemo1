package AutomatePDFUtility;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

public class pdfsComparission {

	 public void pdfcomp(String actualpdf, String expectedpdf, String screenshotPath) throws IOException, InterruptedException
	    {		
			
		 
				PDFUtil pdfUtil = new PDFUtil();
				
				PDDocument pdactualpdf = PDDocument.load(new File(actualpdf));
				PDDocument pdexpectedpdf = PDDocument.load(new File(expectedpdf));
				
			
				for(int i=1;i<pdactualpdf.getNumberOfPages();i++)
				{
						for(int j=i;j<=i;j++)
						{
							if(i==j)
							
			pdfUtil.setCompareMode(CompareMode.VISUAL_MODE);
			
				
			Thread.sleep(2000);
			pdfUtil.setImageDestinationPath(screenshotPath);
			pdfUtil.highlightPdfDifference(true);
					
			
			Thread.sleep(2000);
			pdfUtil.compare(actualpdf, expectedpdf, i, j);
			
			
			
			String pdf1content = pdfUtil.getText(actualpdf, i);
			String pdf2content = pdfUtil.getText(expectedpdf, i);
			
			System.out.println(pdf1content);
			System.out.println(pdf2content);
			
			if(pdf1content.equals(pdf2content))
			{
				System.out.println("page " + i + " content is matching in both pdfs");
				System.out.println("content is compared");
			}
			else
			{
				System.out.println("page " + i + "content is not matching in both pdfs");
			}
						}
						
						
						
				}
				

			}
			
}
