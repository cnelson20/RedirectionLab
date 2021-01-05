import java.util.*;
public class  MakeStars{
  public static void main( String[]args ){
      Scanner n = new Scanner(System.in);
      while (n.hasNextLine()) {
        String line = n.nextLine();
        Scanner l = new Scanner(line);
        while (l.hasNext()) {
          String word = l.next();
          for (int i = 0; i < word.length();i++) {
            System.out.print("*");
          }
          System.out.print(" ");
        }
        System.out.println();
      }
  }
}
