/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;
import java.io.*;
import java.util.*;


/**
 *
 * @author Ace Dragon
 */
public class day3 {
    FileWriter fileWriter;
  {
            try
            {
                    //what you doing tomorrow, export that to a txt file
                    fileWriter = new FileWriter("C:list.txt");
                    Scanner w = new Scanner(System.in);
                System.out.println("what are you doing tomorrow?");
                    String r = w.nextLine();
                fileWriter.write(r);
                fileWriter.close();  
            }catch(IOException e){}
        }
}
