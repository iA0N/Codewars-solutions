/*
Kata:
Your task is to check wheter a given integer is a perfect power.
If it is a perfect power, return a pair m and k with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.

https://www.codewars.com/kata/54d4c8b08776e4ad92000835
*/

import java.lang.Math;

public class PerfectPower {
  public static int[] isPerfectPower(int n) {
    int m = 2, k = 2;
    while(true)
    {
      if (Math.pow(m, k) > n) { k = 2; m++; }
      if (Math.pow(m, 2) > n) { return null; }
      int[] rv = {m, k};
      if (Math.pow(m, k) == n) { return rv; }
      k++;
    }
  }
}
