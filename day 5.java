//super late, just got back home, time to code
import java.io.*;
import java.util.*;
/**
 *
 * @author Ace Dragon
 */
public class day5 {
                                //consolidate the code
    public static void main(String[] args) {
                                   // TODO code application logic here
        System.out.println("what did you do today?");
        Scanner s = new Scanner(System.in);
        String t=s.nextLine();
        System.out.println("what did you forget to do");
        String f=s.nextLine();
        System.out.println("today, you did some: "+s+"you forgot to: "+f);
                                          // public static void main(String[] args) {
                                           //ask what you wanted to do today, did you do it(boolean)?
                                //System.out.println("what did you want to do?");
                                   // Scanner u = new Scanner(System.in);
    String i = s.nextLine();
    System.out.println("did you do it?(true/false)");
    boolean did;
    String diddidnt = "";
    did = s.nextBoolean();
                                                      // (y>n)? y:n;
    diddidnt = did ? "did good." : "need pull your socks up.";
        System.out.println("today you wanted to "+i+" and in the end you "+diddidnt);
            FileWriter fileWriter;
  {
            try
            {
                                        //what you doing tomorrow, export that to a txt file
                    fileWriter = new FileWriter("C:list.txt");
                                          //Scanner w = new Scanner(System.in);
                    String r = s.nextLine();
                fileWriter.write(r);
                fileWriter.close();  
            }catch(IOException e){}
        } try {
      File myObj = new File("C:list.txt");
      Scanner ss = new Scanner(myObj);
      while (ss.hasNextLine()) {
        String sss = ss.nextLine();
        
      }
      System.out.println(sss);
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  
}
}
