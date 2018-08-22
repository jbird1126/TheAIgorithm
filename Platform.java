import java.lang.Math;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;



public class SourceCode
{
  static double fileLength = 0.0;
  static int userTyped = 0;
  static String location;

  public static void main(String[] args) throws InterruptedException
  {
    Scanner sc = new Scanner(System.in);


    System.out.println("ENTER FILE SIZE (bytes) / ENTER 0 TO USE FILE LOCATION");

    userTyped = sc.nextInt();

    if(userTyped != 0)
    {
      fileLength = userTyped;
    }
    else if(userTyped == 0)
    {
      System.out.println("ENTER FILE LOCATION");
      location = sc.next();
      File userFile = new File(location);
      fileLength = userFile.length();
      //fileLength = (location.length()*1000);
    }

    System.out.println("Downloading and implementing The Algorithm...");

    int percentComplete = 0;
    String stable = "Stable";
    String stableString = "String = Stable";
    boolean checkStringStability = true;
    String enabled = "Enabled";
    double randomPercent = 0.0;

    while(percentComplete <= 100)
      {
        randomPercent = ThreadLocalRandom.current().nextInt(18, 27 + 1);
        randomPercent = (randomPercent / 100);

        if(percentComplete > 0)
          stable = "Stable";
        else
          stable = "Unstable";

        Thread.sleep(500);
        System.out.println("Progress: " + percentComplete + "%");
        Thread.sleep(200);
        System.out.println("Environment Stability: " + stable);
        Thread.sleep(200);
        System.out.println("Runtime Completion Expectancy: " + checkStringStability);
        Thread.sleep(200);
        if(randomPercent == 22)
        {
          System.out.println("Recursion Error: Data Required" );
          Thread.sleep(200);
        }
        System.out.println("Git Repository: " + stable);
        Thread.sleep(200);
        System.out.println("Platform Capability: " + enabled);
        Thread.sleep(600);
        percentComplete++;
        percentComplete = percentComplete * 2;

        if(percentComplete >= 100)
        {
          System.out.println("Progress: 100%");
          if(location != null)
          {
          System.out.println("Successfully downloaded files to " + location);
          }
          if(percentComplete % 2 == 0 && percentComplete % 5 == 0)
              System.out.println("Package Status: Retained");
          else
              System.out.println("Package Status: Constructed Using Correct Prediction");
          System.out.println(">>Size Before Compression: " + userTyped + " bytes");
        //  System.out.println("Random Percent: " + randomPercent);
          System.out.println(">>Size After Compression: " + (int)(fileLength * randomPercent) + " bytes");
          if(location == null)
          {
          System.out.println("Successfully downloaded files");
          }
        }
      }
  }
}

//oh boy it compiles. oh boy it executes. oh boy it C O M P R E S S E S
/*  https://www.jdoodle.com/online-java-compiler  */
