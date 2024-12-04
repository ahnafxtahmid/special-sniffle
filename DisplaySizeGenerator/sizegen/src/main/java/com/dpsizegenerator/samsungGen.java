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

public class samsungGen {
    
    Actions ac;

    public void getSamDimension(){

        WebDriverManager.chromedriver().setup();
     //   WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);


        driver.manage().window().maximize();
        driver.navigate().to("https://www.samsung.com/latin_en/business/smart-signage/uhd-4k-signage/crystal-uhd-signage-qmc-lh43qmcebgcxgo/");
        driver.findElement(By.xpath("//*[@id=\"anchor_pd-g-product-specs\"]/a")).click();//spec
        String dimension43 = ("Samsung QM43C ="+" "+driver.findElement(By.cssSelector("#tabPanelId0 > div.spec-highlight__detail-wrap > div:nth-child(4) > div.spec-highlight__detail-specs > ul > li:nth-child(1) > span")).getText());
        //System.out.println("Samsung QM43C ="+" "+dimension43);

        driver.navigate().to("https://www.samsung.com/latin_en/business/smart-signage/uhd-4k-signage/crystal-uhd-signage-qmc-lh55qmcebgcxgo/");
        driver.findElement(By.xpath("//*[@id=\"anchor_pd-g-product-specs\"]/a")).click();//spec
        String dimension55 = ("Samsung QM55C ="+" "+driver.findElement(By.cssSelector("#tabPanelId0 > div.spec-highlight__detail-wrap > div:nth-child(4) > div.spec-highlight__detail-specs > ul > li:nth-child(1) > span")).getText());
        //System.out.println("Samsung QM55C ="+" "+dimension55);

        driver.navigate().to("https://www.samsung.com/latin_en/business/smart-signage/uhd-4k-signage/crystal-uhd-signage-qmc-lh50qmcebgcxgo/");
        driver.findElement(By.xpath("//*[@id=\"anchor_pd-g-product-specs\"]/a")).click();//spec
        String dimension50 = ("Samsung QM50C ="+" "+driver.findElement(By.cssSelector("#tabPanelId0 > div.spec-highlight__detail-wrap > div:nth-child(4) > div.spec-highlight__detail-specs > ul > li:nth-child(1) > span")).getText());
        //System.out.println("Samsung QM50C ="+" "+dimension50);

        driver.navigate().to("https://www.samsung.com/latin_en/business/smart-signage/uhd-4k-signage/crystal-uhd-signage-qmc-lh65qmcebgcxgo/");
        driver.findElement(By.xpath("//*[@id=\"anchor_pd-g-product-specs\"]/a")).click();//spec
        String dimension65 = ("Samsung QM65C ="+" "+driver.findElement(By.cssSelector("#tabPanelId0 > div.spec-highlight__detail-wrap > div:nth-child(4) > div.spec-highlight__detail-specs > ul > li:nth-child(1) > span")).getText());
        //System.out.println("Samsung QM65C ="+" "+dimension65);

        driver.navigate().to("https://www.samsung.com/latin_en/business/smart-signage/uhd-4k-signage/crystal-uhd-signage-qmc-lh75qmcebgcxgo/");
        driver.findElement(By.xpath("//*[@id=\"anchor_pd-g-product-specs\"]/a")).click();//spec
        String dimension75 = ("Samsung QM75C ="+" "+driver.findElement(By.cssSelector("#tabPanelId0 > div.spec-highlight__detail-wrap > div:nth-child(4) > div.spec-highlight__detail-specs > ul > li:nth-child(1) > span")).getText());
        //System.out.println("Samsung QM75C ="+" "+dimension75);

        driver.navigate().to("https://www.samsung.com/latin_en/business/smart-signage/uhd-4k-signage/crystal-uhd-signage-qmc-lh85qmcebgcxgo/");
        driver.findElement(By.xpath("//*[@id=\"anchor_pd-g-product-specs\"]/a")).click();//spec
        String dimension85 = ("Samsung QM85C ="+" "+driver.findElement(By.cssSelector("#tabPanelId0 > div.spec-highlight__detail-wrap > div:nth-child(4) > div.spec-highlight__detail-specs > ul > li:nth-child(1) > span")).getText());
        //System.out.println("Samsung QM85C ="+" "+dimension85);

        driver.quit();
        
        String[] masterdimensions = {dimension43, dimension50, dimension55, dimension65, dimension75, dimension85};

        System.out.println(Arrays.toString(masterdimensions));
    
        //Export into file: local
        try{

            PrintStream ps = new PrintStream(new File("/home/ahnaf/Desktop/DimensionsForSamsungQMs.txt"));
            System.setOut(ps);
            ps.print(Arrays.toString(masterdimensions));

        }

        catch(FileNotFoundException ft){
            System.out.println(ft);
        }

    }

    public static void main(String[] args) {
        samsungGen sam = new samsungGen();
        sam.getSamDimension();
    }
}
