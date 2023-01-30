package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import androidGestures.AndroidGestures;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe_ScreenTest {
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
		desiredCapabilities.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		desiredCapabilities.setCapability("appActivity", ".TouchScreenTestActivity");
		//desiredCapabilities.setCapability("sessionOverride",10);
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\APPIUM_Stuff\\Appium_Docs\\ApiDemos-debug.apk");


		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AndroidGestures androidGestures = new AndroidGestures();

		driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
								//"left", 100, "top", 100, "width", 600, "height", 600,
								"left",370,
								"top",250,
								"width",630,
								"height",200,
								//"elementId", ((RemoteWebElement) elment).getId(),
								"direction", "left",
								"percent", 0.75
								));



	}

}
