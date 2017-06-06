import org.apache.bcel.classfile.Field;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Se2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
     driver.manage().window().maximize();

	}

}
