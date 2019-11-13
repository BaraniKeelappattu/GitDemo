package seleniumCodes;

import java.io.IOException;
import java.util.List;
import seleniumCodes.ScreenCapture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableCode// extends CommonDrive
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ReusableCode obj = new ReusableCode();
		CommonDrive obj1= new CommonDrive();
		obj1.useDriver();  // Both method in both classes are  static..so no need of creating a  object 
		

		

	}
}
