import java.util.regex.*;
import java.util.*;
class Vowel
{
  public static void main(String[] args)
  {
  Pattern p=Pattern.compile("DOREMON");
  Matcher m=p.matcher("My Name Is DOREMON");
  while(m.find());
  {
  System.out.println("start" + m.start());
  System.out.println("end" + m.end());
  System.out.println("find" + m.group());
  }
 } 
}