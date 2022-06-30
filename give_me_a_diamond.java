/*
Kata description: https://www.codewars.com/kata/5503013e34137eeeaa001648
*/


import java.lang.Math;  

class Diamond {
  public static String print(int n) {
    if (n % 2 == 0 || n < 0) { return null; }
    String rv = "";
    for (int i = 0; i < n; i++)
    {
        int star_count = i <= Math.floor(n / 2) ? (1 + i * 2) : (int) (n - (i - Math.floor(n / 2)) * 2);
        rv += getStringTimes(" ", (n - star_count) / 2) + getStringTimes("*", star_count) + "\n";
    }
    return rv;
  }
  public static String getStringTimes(String s, int n)
  {
    String rv = "";
    for (int i = 0; i < n; i++) { rv += s; }
    return rv;
  }
}
