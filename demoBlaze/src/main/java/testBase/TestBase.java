package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.www.demoBlaze.demoBlaze.CartPage;
import com.www.demoBlaze.demoBlaze.HomePage;
import com.www.demoBlaze.demoBlaze.LoginPage;
import com.www.demoBlaze.demoBlaze.PlaceOrderPage;
import com.www.demoBlaze.demoBlaze.ProductPage;
import com.www.utilities.Util;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	public HomePage homePage_obj;
	public LoginPage loginPage_obj;
	public  Util util_obj;
	public PlaceOrderPage placeOrder_obj;
	public ProductPage product_page_obj;
	public CartPage cart_page_obj;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) {
//		String br="chrome";
		if(br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("please provide correct browser, thank you!");
		}
		
	driver.get("https://demoblaze.com/index.html#");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
//	------object creation------
	homePage_obj=new HomePage();
	loginPage_obj=new LoginPage();
	util_obj=new Util();
	placeOrder_obj=new PlaceOrderPage();
	product_page_obj=new ProductPage();
	cart_page_obj=new CartPage();
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
