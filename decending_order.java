/*
Kata: https://www.codewars.com/kata/5467e4d82edf8bbf40000155
*/

import java.util.*;   
import java.lang.Math;  

public class DescendingOrder {
  public static int sortDesc(final int num) {
    ArrayList<Character> nc = new ArrayList<Character>();
    for (char c : Integer.toString(num).toCharArray()) { nc.add(Character.valueOf(c)); }
    Collections.sort(nc, Collections.reverseOrder());   
    int rv = 0;
    for (int i = 0; i < nc.size(); i++)
    {
      rv += (nc.get(i) - 48) * ((nc.size() - i - 1) > 0 ? (Math.pow(10, nc.size() - i - 1)) : 1);
    }
    return rv;
  }
}
