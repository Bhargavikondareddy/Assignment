package Day8;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TestUtil {
	
	static WebDriver driver;
	public static void screenshot() throws IOException {
		System.out.println("Screenshot is calling...");
		  File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File destfile = new File("C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Screenshot\\select1.jpg");
		  //File f = new File("C:\\Users\\BhargaviK\\eclipse-workspace2\\Prj_SeleniumMVN\\src\\test\\java\\Screenshot");
		  Files.copy(srcfile, destfile);
	}

}
