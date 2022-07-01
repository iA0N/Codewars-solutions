/*
Kata:
Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
Any whitespace at the end of the line should also be stripped out. 

https://www.codewars.com/kata/51c8e37cee245da6b40000bd
*/

import java.util.*;

public class StripComments {

  public static String stripComments(String text, String[] commentSymbols) {
    String rv = "";
    for (String s : text.split("\n")) { rv += s.split("["+(String.join("", commentSymbols))+"]", 2)[0].replaceAll("\\s+$", "")+"\n"; }
    return rv.substring(0,rv.length()-1);
  }
}
