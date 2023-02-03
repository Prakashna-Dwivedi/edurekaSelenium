package com.edureka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PdfReader {
@Test
	public void ReadPDFFile() throws IOException
	{

		File file=new File("C:\\Users\\Prakashna\\Documents\\Abhishek dwivedi71212.pdf");
	 	FileInputStream fis=new FileInputStream(file);
	 	//logger.info("verify the data in title filter");
	 	
	 	PDDocument pdfDocument=PDDocument.load(fis);
	 	System.out.println(pdfDocument.getPages().getCount());
	 	PDFTextStripper pdfTextStripper=new PDFTextStripper();
	 	
	 	String docText=pdfTextStripper.getText(pdfDocument);
	 	
	 	System.out.print(docText);
	 	
	 	//Assert.assertTrue(docText.contains("Filter"));
	 	//logger.info("display the data");
	 	pdfDocument.close();
	 	fis.close();
	}
	}

