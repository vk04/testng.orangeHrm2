package ReadingPropertyFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadPropertyFile extends LoadProperty {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader read= new FileReader("C:\\Users\\Vasant\\eclipse-workspace\\testng.orangeHrm\\src\\test\\java\\ReadingPropertyFile\\TestData.properties");
		try {
			prop.load(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("Username"));
	}

}
