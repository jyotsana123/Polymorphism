
public class ChromeDriver implements WebDriver{

	//https://www.youtube.com/watch?v=opAhD-KehcM

	void x()
	{
		System.out.println("chormedriver x");
	}
	void y()
		{
		System.out.println("chormedriver y");
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  Parent p = new child();    this concept is working below  here
		WebDriver driver = new ChromeDriver();
		driver.get();
		driver.window();
		//now i need to call chromedriver class methods x & y
		ChromeDriver crm = (ChromeDriver)driver;
		//perform the typecasting to call chromedriver method here
        //Webdriver reference variabe convert to the chromedriver type and it return chromedriver object
		crm.x();
		crm.y();
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("webdriver get");
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		System.out.println("webdriver window");
		
	}

}
