/*
Kata description: https://www.codewars.com/kata/526571aae218b8ee490006f4
*/

public class BitCounting {

  public static int countBits(int n){
    return (int) Integer.toBinaryString(n).codePoints().filter(c -> c == 49).count();
  }
  
}
