package customizedListeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.test.testng.orangeHrm.Base;

public class Utility extends Base {
	
	
	public void takeScreenShot() throws IOException {
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //call Screenshot method and store in a file
		FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName)); //copy file from source to destination file
	}

}
