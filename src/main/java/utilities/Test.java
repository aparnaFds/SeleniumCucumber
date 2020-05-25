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

public class Test {

	public static void main(String[] args) throws IOException {
		String currentDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(currentDir + "\\src\\main\\java\\propertiesFiles\\Input.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String appURL = prop.getProperty("URL");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appURL);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
				.sendKeys("acharya.aparna@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"))
				.sendKeys("Cindrella1!");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		System.out.println(driver.getTitle());
	}

}
