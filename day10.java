/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    Scanner guess = new Scanner(System.in);
    
 
     //meh hav to loop now, the game will just keep looping until the condition is met, i guess that means a while loop filled with ifs
    /* either 
    for (i=0; i<max; i++{}
    
    do()while ();
    
    <condition>while(){}
    
    I need to use all of these at least once, they're awesome
    */
    
       do(
      
    //i bet i can use this
    
       String didu = guess.nextLine();
        
        boolean did;
        String diddidnt = "";
        did = guess.nextBoolean();
                   if (//Boolean_Expression_1)                                  // (y>n)? y:n;
    diddidnt = did ? "the number is higher" : "the number is lower";)
                    if(diddidnt = did ? "the number is higher" : "the number is lower";)
    else
        System.out.println("exactly! you win");                    
    else
	diddidnt = did ? "the number is higher" : "the number is lower";)
          )while (guess != goal);
    /*
    if (Boolean_Expression_1)
	  if (Boolean_Expression_2)
		    Statement_1)
	  else 
		    Statement_2)
else
	 if (Boolean_Expression_3)
		    Statement_3)
	  else 
		    Statement_4);
    
    */
    //i want to use this too
    /*
    String studentNames[] = new String[10];
for(int i=0;i<10;i++){
	 System.out.println("Enter a name: ");
	 studentNames[i] = kbd.next();
} //using normal for loop
When the for-each is used the statement becomes:
String studentNames[] = new String[10];
for(String name:studentNames){
	 System.out.println("Enter a name: ");
	 name = kbd.next();
}//quiet clean right?
    */
       
      
}

