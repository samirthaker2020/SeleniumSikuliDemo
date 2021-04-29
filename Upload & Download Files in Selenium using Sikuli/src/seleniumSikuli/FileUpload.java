package seleniumSikuli;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.*;
public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		driver.get("https://chrome.google.com/webstore/detail/grammarly-for-chrome/kbfnbcaeplbcioakkpcpgfkobkghlhen?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'Add to Chrome')])[1]")).click();
		Thread.sleep(3000);
//		String imagesFilepath="C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images";
		String inputFilepath="C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\add.PNG";
//		
		Screen s=new Screen(); 
		Pattern openButton=new Pattern(inputFilepath);
		s.click(openButton);
//		Pattern fileInputTextbox=new Pattern(imagesFilepath+"Textbox.PNG");
//		Pattern openButton=new Pattern(imagesFilepath+"Button.PNG");
//		Thread.sleep(5000);
//		s.wait(fileInputTextbox,20);
//		s.type(fileInputTextbox,inputFilepath+"apple.PNG");
//		s.click(openButton);
		
		
		
	}

}
