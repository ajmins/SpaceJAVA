package udemyPractices.File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ExtractTextFromZip {

	  public void printFileList(String filePath) {
		    // initializing the objects or we can directly use
		    FileInputStream fis = null;
		    ZipInputStream Zis = null;
		    ZipEntry zEntry = null;

		    try {
		      fis = new FileInputStream(filePath);
		      Zis = new ZipInputStream(new BufferedInputStream(fis));

		      // this will search the files while end of the zip.
		      while ((zEntry = Zis.getNextEntry()) != null) {
		        System.out.println(zEntry.getName());
		      }
		      Zis.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		  }
	
	public static void main(String[] args) {
		 // creating object of the file.
		ExtractTextFromZip zip = new ExtractTextFromZip();
	    System.out.println("Files in the Zip are : ");

	    // enter the path of the zip file with name.
	    zip.printFileList("C:\\Users\\Ajmi\\Downloads\\Java-Collections-Immutable-Class-Challenge-Source-code.zip");

	}

}
