//late but im doing it now
import java.io.*;
import java.util.*;
/**
 *
 * @author Ace Dragon
 */
public class day6 {
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
                                //System.out.println("what did you want to do?");
                                   // Scanner u = new Scanner(System.in);
    boolean did;
    String diddidnt = "";
        System.out.println("did you do most of what you wanted to today?(true/false)");
        String didu = s.nextLine();
        did = s.nextBoolean();
                                                      // (y>n)? y:n;
    diddidnt = did ? "did good." : "need pull your socks up.";
        System.out.println("today you wanted to "+didu+" and in the end you "+diddidnt);
        
    FileWriter fileWriter;
  {
            try
            {
                                        //what you doing tomorrow, export that to a txt file
    fileWriter = new FileWriter("C:list.txt");
                                          //Scanner w = new Scanner(System.in);
        String tomorrow = s.nextLine();
    fileWriter.write(tomorrow);
    fileWriter.close();  
            }catch(IOException e)
            {
            System.out.println("there's an issue:" + e.getMessage());
            }
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
  System.out.println("today, you did some: "+today+"you forgot to: "+forgot);
}
}
