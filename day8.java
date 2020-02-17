/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ace Dragon
 */
public class day8 {
// errors, loops and if statements.  
    /*
    guess the number x. it is between 1 - 100
    if you get a number larger than x the error will tell you that it's a larger number and vius versa
    */
    
    //start with the goal: get x
    Random goal = new Random();
    int x = goal.nextInt(100);
    //x is random lul
    //add input guess
    Scanner guess = new Scanner(System.in);
    //meh hav to loop now, the game will just keep looping until the condition is met, i guess that means a while loop filled with ifs
    /* either 
    for (i=0; i<max; i++{}
    
    do()while ();
    
    <condition>while(){}
    
    I need to use all of these at least once, they're awesome
    */
    
    
    //i bet i can use this
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
