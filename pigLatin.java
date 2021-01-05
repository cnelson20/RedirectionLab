import java.util.*;
import java.lang.Character;
public class pigLatin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      Scanner l = new Scanner(input.nextLine());
      while (l.hasNext()) {
        System.out.print(pigLatinBest(l.next()) + " ");
      }
      System.out.println();
    }
  }
  private static boolean inCharArray(String needle, String[] haystack) {
    if (needle.length() < haystack[0].length()) {return false;}
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i].equals(needle.toLowerCase().substring(0,haystack[i].length()))) {return true;}
    }
    return false;
  }
  public static String pigLatinSimple(String s) {
    String[] vowels = {"a","e","i","o","u"};
    //System.out.println(s.charAt(0));
    if (inCharArray(s,vowels)) {
      return(s + "hay");
    } else {
      return (s.substring(1) + s.charAt(0) + "ay").toLowerCase();
    }
  }
  public static String pigLatin(String s) {
    String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (inCharArray(s,digraphs)) {
      return (s.substring(2) + s.substring(0,2) + "ay").toLowerCase();
    }
    return pigLatinSimple(s);
  }
  public static String pigLatinBest(String s) {
    if (false == Character.isLetter(s.charAt(0))) {return s.toLowerCase();}
    boolean t = Character.isLetter(s.charAt(s.length()-1));
      return (t ? pigLatin(s) : pigLatin(s.substring(0,s.length() - 1))) + (t ? "" :  "" + s.charAt(s.length()-1));
  }
}
