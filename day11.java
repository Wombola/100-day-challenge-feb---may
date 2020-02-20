package day1;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Ace Dragon
 */

public class day9 {
   public static void main(String[] args) {
    Random goal = new Random();
    int x = goal.nextInt(100);
    int z = 0;
    int h = 100;
    //might be able to have the hint become flexible and actually helpful to the player by giving a dynamic range
    int highest = 100;
    int lowest= 0;
    System.out.println("guess the number between "+z+" and "+h+".");
    
    Scanner g = new Scanner(System.in);
  int guess = g.nextInt();
    
 
     //meh hav to loop now, the game will just keep looping until the condition is met, i guess that means a while loop filled with ifs
    /* either 
    for (i=0; i<max; i++{}
    
    do()while ();
    
    <condition>while(){}
    
    I need to use all of these at least once, they're awesome
    */
    
       //do(
      //boolean did;
      
       // String diddidnt = "";
    //i bet i can use this
      while (guess != x)
{
  // Statement_1
   //Statement_2

   //Statement_Last
		//increment or decrement(update)


        
        
        int hint = (x - guess);
                   if (guess != x)         
                       System.out.println("the answer is "+hint+" away from your guess");
                       else
        System.out.println("exactly! you win");  
}
