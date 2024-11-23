package pdfBoxExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadPDFContent {
	
	
	@Test
	public void verifyPDFData() throws Exception {
		
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		
		
		
		
		int pdfPageCount = pdfDocument.getPages().getCount();
		System.out.println("No. of pages: " + pdfPageCount);				//page : 3
		
		Assert.assertEquals(pdfPageCount, 3);
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		String PDF_content_Text = pdfText.getText(pdfDocument);
		
		
		System.out.println("==============================================================");
		System.out.println(PDF_content_Text);
		System.out.println("==============================================================");
		
		
		
		//validation 
		Assert.assertTrue(PDF_content_Text.contains("PIL has become a significant step in ensuring"));			//pass
		
		System.out.println("=====================check content=====: " + PDF_content_Text.contains("PIL has become a significant step in ensuring"));
		
		pdfDocument.close();
		fis.close();
		
	}

}
