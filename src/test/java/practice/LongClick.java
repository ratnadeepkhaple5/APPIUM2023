package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LongClick 
{

	@Test
	public void longclick() throws MalformedURLException
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", ".ApiDemos");
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\APPIUM_Stuff\\Appium_Docs\\ApiDemos-debug.apk");


		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));

		views.click();

		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		WebElement dot = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		//  Long click w.r.t. element
		//		( driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		//				"elementId", ((RemoteWebElement) dot).getId(),
		//				"duration",2000
		//
		//				));

		//  Long click w.r.t. co-ordinates
		( driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",200,
				"y",600,
				"duration",2000

				));

	}
}
