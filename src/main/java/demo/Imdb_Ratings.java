package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imdb_Ratings {
  ChromeDriver driver;

  public Imdb_Ratings() {
    System.out.println("Constructor: Imdb_Ratings");
    WebDriverManager.chromedriver().timeout(30).setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  public void endTest() {
    System.out.println("End Test: Imdb_Ratings");
    driver.close();
    driver.quit();
  }

  public void Imdb_Ratings() throws InterruptedException{

        System.out.println("Start Test case: Imdb_Ratings");
        //Navigate to "https://www.imdb.com/chart/top/?sort=user_rating%2Cdesc"
        driver.get("https://www.imdb.com/chart/top/?sort=user_rating%2Cdesc");
       // find the dropdown using xpath "//select[@id='sort-by-selector']" and select dropdown of sort by index
       Select se = new Select (driver.findElement(By.xpath("//select[@id='sort-by-selector']")));
       se.selectByIndex(2);
       //Locate the list of movies using xpath "//li[@class='ipc-metadata-list-summary-item sc-1364e729-0 caNpAE cli-parent']"
       
        List<WebElement> Total_Movie = driver.findElements(By.xpath("//li[@class='ipc-metadata-list-summary-item sc-1364e729-0 caNpAE cli-parent']"));
                     //print the size of the list
                     System.out.println("Total movies are included in the table--> = "+Total_Movie.size());
        // Locate the list of movie one by one  using xpath "(//li[@class='ipc-metadata-list-summary-item sc-1364e729-0 caNpAE cli-parent'])["+a+"]"
           WebElement Highest_rating = driver.findElement(By.xpath("//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']"));
                //print 1st movie name from movie list
                  System.out.println("The highest rated movie on IMDb--> = "+Highest_rating.getText());
                  //select the dropdown of sort by index 3(Release date)
                  se.selectByIndex(3);
                  //sleep for 3 seconds
                  Thread.sleep(3000);
                  //find name of movie by xpath "//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']"
                  WebElement Most_Recent = driver.findElement(By.xpath("//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']"));
                  //print 1st movie name
                  System.out.println("The most recent movie on the list --> = "+Most_Recent.getText());
                    //Thread.sleep(3000);
                  Thread.sleep(3000);
                  //click on sort button using xpath "//button[@id='swap-sort-order-button']"
                   driver.findElement(By.xpath("//button[@id='swap-sort-order-button']")).click();
                   //find oldest movie from list using xpath "//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']
                  WebElement Oldest_Movie = driver.findElement(By.xpath("//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']"));
                  //print oldest movie
                  System.out.println("The oldest movie on the list --> = "+Oldest_Movie.getText());
                  //select the dropdown of sort by index 4
                  se.selectByIndex(4);
                  //sleep for 3 seconds
                  Thread.sleep(3000);
                   //find most user ratings movie from list using xpath "//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']"
                  WebElement MostUser_Rating = driver.findElement(By.xpath("//div[@class='ipc-title ipc-title--base ipc-title--title ipc-title-link-no-icon ipc-title--on-textPrimary sc-be6f1408-9 srahg cli-title']"));
                  //print most user ratings
                  System.out.println("Movie has the most user ratings --> = "+MostUser_Rating.getText());
       }
             
       }
      
       

