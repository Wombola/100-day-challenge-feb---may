import java.io.*;
import java.util.*;
/**
 *
 * @author Ace Dragon
 */
public class day7 {
                                //consolidate the code
    public static void main(String[] args) {
                                   // TODO code application logic here
        System.out.println("what did you do today?");
    Scanner s = new Scanner(System.in);
        String today=s.nextLine();
        System.out.println("what did you forget to do");
        String forgot=s.nextLine();
        
                                          // public static void main(String[] args) {
                                           //ask what you wanted to do today, did you do it(boolean)?
        System.out.println("what did you want to do?");
                                   // Scanner u = new Scanner(System.in);
    
        String didu = s.nextLine();
        System.out.println("did you do most of what you wanted to today?(true/false)");
        boolean did;
        String diddidnt = "";
        did = s.nextBoolean();
                                                      // (y>n)? y:n;
    diddidnt = did ? "did good." : "need pull your socks up.";
       // System.out.println("today you wanted to "+didu+" and in the end you "+diddidnt);
        
    FileWriter fileWriter;
  {
            try
            {
                                        //what you doing tomorrow, export that to a txt file
    fileWriter = new FileWriter("C:list.txt");
                                          //Scanner w = new Scanner(System.in);
        System.out.println("What're you doing tomorrow?"); 
    Scanner w = new Scanner(System.in);
        String r = w.nextLine();
        fileWriter.write(r);
        fileWriter.close();  
            }catch(IOException e)
            {}
            }try {
    File myObj = new File("C:list.txt");
        Scanner ss = new Scanner(myObj);
        while (ss.hasNextLine()) {
        String sss = ss.nextLine();
        System.out.println("tomorrow you're going to :"+sss);}
        ss.close();
    }   catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("today, you did some: "+today+"you forgot to: "+forgot+"you wanted to "+didu+" and in the end you "+diddidnt);
}
}
