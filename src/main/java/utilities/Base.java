package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static String currentDir;
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriver driver;
	public static String appURL;

	public static void launchBrowser() throws IOException {
		String currentDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(currentDir + "\\src\\main\\java\\propertiesFiles\\Input.properties");
		Properties prop = new Properties();
		prop.load(fis);
		appURL = prop.getProperty("URL");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void closeBrowser() {
		driver.quit();
	}
}
