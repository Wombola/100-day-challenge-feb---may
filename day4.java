/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */  import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files



/**
 *
 * @author Ace Dragon
 */

public class day4 {
   public static void main(String[] args) {
         System.out.println("What did you want to do today?");
         
     
    try {
      File myObj = new File("C:list.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  System.out.println("did you do it?(true/false)");
    boolean did;
    String diddidnt = "";
    did = u.nextBoolean();
           // (y>n)? y:n;
    diddidnt = did ? "did good." : "need pull your socks up.";
        System.out.println("today you wanted to "+data+" and in the end you "+diddidnt);
}
}
