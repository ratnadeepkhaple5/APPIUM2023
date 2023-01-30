package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {

	@Test
	public void launch() throws MalformedURLException 
	{

		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		dc.setCapability("deviceName", "Samsung");		
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "12");
		dc.setCapability("UDID", "RZ8N91KGFEH");

		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		//dc.setCapability("app", "D:\\APPIUM_Stuff\\APK\\General-Store.apk");

		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, dc);

//		driver.findElement(AppiumBy.accessibilityId("9")).click();
//
//		driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
//
//		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/calc_keypad_btn_02']")).click();

	}
}
