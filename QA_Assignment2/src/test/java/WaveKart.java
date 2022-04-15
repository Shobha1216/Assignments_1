import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class WaveKart {
    private WebDriver webDriver;


    @Test
    public void  search() {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//a[@name='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());
        webDriver.findElement(By.xpath("//input[@name='productSearch']")).sendKeys("Laptop");

        WebElement search= webDriver.findElement(By.xpath("//button[@title='Search']"));
        search.click();

    }
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get(webDriver.getCurrentUrl());
        WebElement loginButton=webDriver.findElement(By.xpath("//a[@name='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();
        webDriver.quit();
    }
    @Test
    public void AllProducts(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get(webDriver.getCurrentUrl());
        WebElement allProducts=webDriver.findElement(By.xpath("//span[text()='All Products']"));
        allProducts.click();
        webDriver.quit();
        //a[@name='ProductPage']
    }
    @Test
    public  void image(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get(webDriver.getCurrentUrl());

        WebElement image = webDriver.findElement(By.xpath("//img[@src='./resources/images/imagelists/laptops_category.png']"));
        image.click();
    }
    @Test
    public  void myCart(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get(webDriver.getCurrentUrl());
        WebElement loginButton = webDriver.findElement(By.xpath("//span[text()='Login']"));
        loginButton.click();


        WebElement username= webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        WebElement mycart = webDriver.findElement(By.xpath("//a[@name='MyCart']"));
        mycart.click();
    }



    @Test
    public void addToCart(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//a[@name='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());
        WebElement image = webDriver.findElement(By.xpath("//img[@src='./resources/images/imagelists/laptops_category.png']"));
        image.click();


        WebElement imageLaptopSingle = webDriver.findElement(By.xpath("//img[@src='http://wmstudio-apps.s3.amazonaws.com/eshop/Products/Thumbnails/Laptops/Laptop1.jpg']"));
        imageLaptopSingle.click();



         WebElement addingproducttocart = webDriver.findElement(By.xpath("//button[@name='AddToCart']"));
         addingproducttocart.click();


    }

    @Test
    public void placingOrder(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//a[@name='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());
        WebElement image = webDriver.findElement(By.xpath("//img[@src='./resources/images/imagelists/laptops_category.png']"));
        image.click();


        WebElement imageLaptopSingle = webDriver.findElement(By.xpath("//img[@src='http://wmstudio-apps.s3.amazonaws.com/eshop/Products/Thumbnails/Laptops/Laptop1.jpg']"));
        imageLaptopSingle.click();


        WebElement addingproducttocart = webDriver.findElement(By.xpath("//button[@name='AddToCart']"));
        addingproducttocart.click();


        WebElement placingorder = webDriver.findElement(By.xpath("//button[@name='button5']"));
        placingorder.click();
    }
  @Test
    public void logOut(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//a[@name='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());
        WebElement logOutButton=webDriver.findElement(By.xpath("//span[text()='Logout']"));
        logOutButton.click();

    }

    @Test
    public void cancelOrder(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//span[text()='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());
        WebElement myorder = webDriver.findElement(By.xpath("//span[text()=' My Orders']"));
        myorder.click();

        WebElement cancelOrder = webDriver.findElement(By.xpath("//button[@name='button3']"));
        cancelOrder.click();


    }
    @Test
    public void continueShopping(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//span[text()='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());


        WebElement myorder = webDriver.findElement(By.xpath("//span[text()=' My Orders']"));
        myorder.click();

        WebElement continueShopping = webDriver.findElement(By.xpath("//button[@name='button2']"));
        continueShopping.click();


    }
    @Test
    public void printOrder(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//span[text()='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());


        WebElement myorder = webDriver.findElement(By.xpath("//span[text()=' My Orders']"));
        myorder.click();

        WebElement printOrder = webDriver.findElement(By.xpath("//button[@name='button4']"));
        printOrder.click();
    }
    @Test
    public void lowTOHigh(){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        webDriver.get(webDriver.getCurrentUrl());

        WebElement loginButton=webDriver.findElement(By.xpath("//span[text()='Login']"));
        loginButton.click();

        WebElement username=webDriver.findElement(By.xpath("//input[@name='j_username']"));
        WebElement password=webDriver.findElement(By.xpath("//input[@name='j_password']"));
        WebElement login=webDriver.findElement(By.xpath("//button[@name='loginbutton']"));
        username.sendKeys("user");
        password.sendKeys("user");
        login.click();

        webDriver.get(webDriver.getCurrentUrl());
        WebElement allProducts=webDriver.findElement(By.xpath("//label[text()='All Products']"));
        allProducts.click();

        WebElement priceLowToHigh=webDriver.findElement(By.xpath("//span[text()='Price - Low to High']"));
        priceLowToHigh.click();

    }
@Test
public void includeOutOfStock(){
    System.setProperty("webdriver.chrome.driver" , "C:\\Users\\shobhab\\Downloads\\chromedriver_win32\\chromedriver.exe");
    webDriver = new ChromeDriver();
    webDriver.get("http://pkhw22ds2xds.cloud.wavemakeronline.com/WaveKart/#/Main");

    webDriver.manage().window().maximize();
    webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    webDriver.get(webDriver.getCurrentUrl());
    WebElement allProducts=webDriver.findElement(By.xpath("//span[text()='All Products']"));
    allProducts.click();

    WebElement includeOutOfStock = webDriver.findElement(By.xpath("//span[text()='Include Out Of Stock']"));
    includeOutOfStock.click();
}
}
