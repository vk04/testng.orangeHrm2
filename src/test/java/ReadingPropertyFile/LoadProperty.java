package ReadingPropertyFile;

import java.io.FileReader;
import java.util.Properties;

public class LoadProperty {
	static Properties prop = new Properties();
	static String propertyPath = "C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm\\src\\test\\java\\ReadingPropertyFile\\TestData.properties";
	static FileReader read;

	public static void main(String[] args) throws Exception {

		read = new FileReader(propertyPath);
        prop.load(read);
		System.out.println(prop.getProperty("Password"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Username"));
	}

}
