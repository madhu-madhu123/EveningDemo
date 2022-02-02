package test_scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.Base_class;
import generic.Generic_readexcel;
import pom.Actitime_Login;

public class LoginTestScript extends Base_class
{
	@Test
	public void test() throws IOException
	{
		String username = Generic_readexcel.getdata("sheet1", 0, 0);
		String password = Generic_readexcel.getdata("sheet1", 1, 0);
		
		Actitime_Login act=new Actitime_Login(driver);
		act.username(username);
		act.password(password);
		act.login();
		
	}

}
