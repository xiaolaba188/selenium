package cn.itcast.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class selenium {
	WebDriver driver=null;
	
@Parameters({"Propertypath"})
@Test(groups="name1")
	public void test1(String propertyPath) throws InterruptedException, IOException{
	Pro p=new Pro(System.getProperty("user.dir")+"/Properties.properties");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+propertyPath);
	driver=new ChromeDriver();
	driver.get(p.getValue("url"));
	driver.findElement(By.id(p.getValue("baiduET"))).sendKeys("nihao");
	Thread.sleep(1000);
}
@Test(groups="name2")
public void test2(String propertyPath) throws InterruptedException, IOException{
System.out.print("test2");
}
@Test(groups="name3")
public void test3(String propertyPath) throws InterruptedException, IOException{
System.out.print("test3");
}
}
