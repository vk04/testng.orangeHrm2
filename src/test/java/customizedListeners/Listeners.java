package customizedListeners;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.test.testng.orangeHrm.Tests;

public class Listeners extends Tests implements ITestListener {

	public void onTestSuccess(ITestResult result) {

		System.out.println("Passed Test Case Name : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			destFile = "C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm2\\screenshot\\" + fileName;
			FileUtils.copyFile(screenshot, new File(destFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");

		Reporter.log("<a href= " + destFile + " target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=" + destFile + " target=\"_blank\"><img height=200 width=200 src=" + destFile + "></a>");

		System.out.println("Capturing Screenshot for the Failed test -- " + result.getName());

	}

}
