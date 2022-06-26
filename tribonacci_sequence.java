/*
Kata description at: https://www.codewars.com/kata/556deca17c58da83c00002db
*/


import java.util.ArrayList;
import java.util.Arrays;
public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
      if (n == 0) {
        return new double[0]; 
      }
      for (int i = 3; i < n; i++)
        {
          s = Arrays.copyOf(s, s.length+1);
          s[s.length-1] = s[s.length-2] + s[s.length-3] + s[s.length-4];
        }
      return Arrays.copyOf(s, n);
  }
}
