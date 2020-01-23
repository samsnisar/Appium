import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class AppiumMusic {
	
	//static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		// dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "67d2793c0904");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("noReset", "true");
		cap.setCapability("fullReset", "false");

		cap.setCapability("appPackage", "com.miui.player");
		cap.setCapability("appActivity", "com.miui.player.ui.MusicBrowserActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url, cap);
		Thread.sleep(3000);
		
		/*driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget."
				+ "FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).click();*/
		
		driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget."
				+ "FrameLayout/android.view.ViewGroup/android.widget.CheckBox[1]\r\n")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
				+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget."
				+ "FrameLayout/android.view.ViewGroup/android.widget.TextView[8]\r\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\r\n" + 
				"")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView\r\n" + 
				"")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
			
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[11]/android.widget.ImageView\r\n" + 
				"")).click();
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'Close\']")).click();
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[1]\r\n"
				)).click();
	}

}
