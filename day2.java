package day1;
import java.util.*;


/**
 *
 * @author Ace Dragon
 */  
public class day2 {
    public static void main(String[] args) {
    //ask what you wanted to do today, did you do it(boolean)?
    System.out.println("what did you want to do?");
    Scanner u = new Scanner(System.in);
    String i = u.nextLine();
    System.out.println("did you do it?(true/false)");
    boolean did;
    String diddidnt = "";
    did = u.nextBoolean();
           // (y>n)? y:n;
    diddidnt = did ? "did good." : "need pull your socks up.";
        System.out.println("today you wanted to "+i+" and in the end you "+diddidnt);
            
}
}