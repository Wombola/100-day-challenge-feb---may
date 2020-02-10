//today's program will ask you what you did today, tomorrow's will ask you what are you going to do then check if you did it, the day after that, it will ask you what you want to do the following day then export it to a text file, the day after that it will import what you said you were going to do then import it.
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ace Dragon
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("what did you do today?");
        Scanner s = new Scanner(System.in);
        String t=s.nextLine();
        System.out.println("what did you forget to do");
        String f=s.nextLine();
        System.out.println("today, you did some: "+s+"you forgot to: "+f);
    }
    
}
