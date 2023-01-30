package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import androidGestures.AndroidGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe 
{
	@Test
	public void swipegesture() throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("automationName", "appium");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		//desiredCapabilities.setCapability(MobileCapabilityType.ORIENTATION, "");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", ".ApiDemos");
		//desiredCapabilities.setCapability("sessionOverride",10);
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\APPIUM_Stuff\\Appium_Docs\\ApiDemos-debug.apk");


		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AndroidGestures androidGestures = new AndroidGestures();

		WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
		views.click();
		Thread.sleep(3000);

		WebElement element=driver.findElement(AppiumBy.id("android:id/list"));
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(

				"elementId", ((RemoteWebElement) element).getId(),
				"direction", "up",
				"percent", 0.75
				));
		Thread.sleep(3000);
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				"left", 200, "top", 1900, "width", 600, "height", 1300,

				"direction", "down",
				"percent", 0.75
				));




		//androidGestures.clickonElement(driver, views);

		//		WebElement gallery=driver.findElement(AppiumBy.accessibilityId("Gallery"));
		//		gallery.click();
		//
		//		WebElement photos=driver.findElement(AppiumBy.accessibilityId("1. Photos"));
		//		photos.click();
		//
		//		WebElement img1 = driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id='io.appium.android.apis:id/gallery']/android.widget.ImageView[1]"));
		//		WebElement elment=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
		//		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
		//				//"left", 100, "top", 100, "width", 600, "height", 600,
		//				"left",370,
		//				"top",250,
		//				"width",630,
		//				"height",200,
		//				//"elementId", ((RemoteWebElement) elment).getId(),
		//				"direction", "left",
		//				"percent", 0.75
		//				));
		//		Thread.sleep(5000);
		//		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
		//				//"left", 100, "top", 100, "width", 600, "height", 600,
		//				"left",900,
		//				"top",250,
		//				"width",800,
		//				"height",250,
		//				//"elementId", ((RemoteWebElement) elment).getId(),
		//				"direction", "right",
		//				"percent", 0.75
		//				));



	}}
