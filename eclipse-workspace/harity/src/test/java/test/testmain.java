package test;

import org.testng.annotations.Test;

import generic.testbase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testmain extends testbase {
	@Test
	public void launch() {
		
		driver.get("https://www.google.com");
	}

}
