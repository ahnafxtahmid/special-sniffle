package com.dpsizegenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class lgGen {
    
    Actions ac;


    public void getLgDimension(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);

        

        ac = new Actions(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-98uh5j-h");

        String dimensions98 = ("LG-98UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07557167 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(1) > dd")).getText());

        //System.out.println("LG-98UH5J-H"+" "+dimensions98);

        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-86uh5j-h");
       
        //driver.findElement(By.xpath("//*[text()='Specs']"));
        String dimensions86 = ("LG-86UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07557166 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(1) > dd")).getText());

        //System.out.println("LG-86UH5J-H"+" "+dimensions86);

        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-75uh5j-h");
        String dimensions75 = ("LG-75UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07557164 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(1) > dd")).getText());

        //System.out.println("LG-75UH5J-H"+" "+dimensions75);

        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-65uh5j-h");        
        String dimensions65 = ("LG-65UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07549644 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(2) > dd")).getText());

        //System.out.println("LG-65UH5J-H"+" "+dimensions65);

        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-55uh5j-h");        
        String dimensions55 = ("LG-55UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07549642 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(2) > dd")).getText());

        //System.out.println("LG-55UH5J-H"+" "+dimensions55);

        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-49uh5j-h");        
        String dimensions49 = ("LG-49UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07549640 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(2) > dd")).getText());

        //System.out.println("LG-49UH5J-H"+" "+dimensions49);

        driver.navigate().to("https://www.lg.com/global/business/digital-signage/lg-43uh5j-h");        
        String dimensions43 = ("LG-43UH5J-H"+" "+driver.findElement(By.cssSelector("#MD07549626 > div.tech-spacs-wrap > div.tech-spacs-area.collapse.show > div:nth-child(3) > div.tech-spacs-contents > ul > li:nth-child(3) > dl:nth-child(2) > dd")).getText());

        //System.out.println("LG-43UH5J-H"+" "+dimensions43);


        String [] masterDimensions = {dimensions43, dimensions49, dimensions55, dimensions65, dimensions75, dimensions86, dimensions98};

        System.out.println(Arrays.toString(masterDimensions));

        //Export into file: local

        try{
            PrintStream ps = new PrintStream(new File("/home/ahnaf/Desktop/DimensionsForLGUH5J-H.txt"));
            System.setOut(ps);
            ps.print(Arrays.toString(masterDimensions));

        }catch(FileNotFoundException ft){
            System.out.println(ft);
        }
    }

    public static void main(String[] args) {
        
        lgGen obj = new lgGen();
        obj.getLgDimension();
    }
    

}
