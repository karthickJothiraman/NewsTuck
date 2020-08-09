package Login.NewsTuck;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import Resources.Base;
import newstuck_login.Login;

public class Login_NT001 extends Base
 {
	@Test(dataProvider="getdata")
	public void BasepageNavigation(String username,String password) throws IOException
	{
		driver = initializeDriver();
		driver.manage().window().maximize();
		
		Login LG = new Login(driver);
		LG.getuser().sendKeys(username);
		LG.getPassword().sendKeys(password);
		LG.getClicklogin().click();
		
		File stage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(stage,new File("E:\\StageCurator.png"));
		
		File stageEditor = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(stageEditor,new File("E:\\stageEditor.png"));
     }


@DataProvider
public Object [] getdata() 
{
	Object [][] data = new Object[2][2];
	data[0][0]="StageCurator";
	data[0][1]="$tageN3w5tuckCu6ato6";
	
	data[0][0]="stageEditor";
	data[0][1]="$tageN3w5tuck3d1to6";
	return data;
	
}

 }
	