package seleniumSikuli;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Demo2 {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Driver\\chromedriver.exe");
		
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chrome.google.com/webstore/detail/grammarly-for-chrome/kbfnbcaeplbcioakkpcpgfkobkghlhen?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'Add to Chrome')])[1]")).click();
		Thread.sleep(3000);
		String inputFilepath="C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\add.PNG";
		Screen screen = new Screen();
		Pattern pattern = new Pattern(inputFilepath);
		screen.click(pattern);
		Thread.sleep(20000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));

		driver.get("https://www.rapidtables.com/tools/notepad.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='area']")).sendKeys("responsibilitie");
		Thread.sleep(10000);
		
		Actions act=new Actions(driver);							
        act.moveByOffset(90, 164).build().perform();
        Thread.sleep(2000);
        Actions act2=new Actions(driver);
        act2.moveByOffset(90, 20).click().build().perform();
		
        Thread.sleep(2000);
		Screen screen0 = new Screen();
		try {
			screen0.findWord("575l");
			System.out.print("Correct");
		}catch(Exception e) {
			System.out.print("InCorrect");
		}

//		Screen screen3 = new Screen();
//		Pattern pattern3 = new Pattern("C:\\Users\\JOKERPC1\\eclipse-workspace\\Upload & Download Files in Selenium using Sikuli\\src\\Images\\cotext.PNG");
//		screen3.click(pattern3);
		
		driver.quit();
	}
	}


