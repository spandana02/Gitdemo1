package TestMethods;

import java.io.IOException;

import org.testng.annotations.Test;

import AutomatePDFUtility.pdfsComparission;

public class AutomateTestPDFs {

	
@Test(priority=0)
	
	
	public void Comparetemplate1113() throws IOException, InterruptedException
	{
		 pdfsComparission pdfcomps = new  pdfsComparission();
		 pdfcomps.pdfcomp("C:\\Users\\spdasari\\Desktop\\SC Outputs\\1113\\1113 - Broker Ack_Pre.pdf", "C:\\Users\\spdasari\\Desktop\\SC Outputs\\1113\\1113 - Broker Ack_post.pdf", "C:\\Users\\spdasari\\Desktop\\SC Outputs\\1113");
	}
}
