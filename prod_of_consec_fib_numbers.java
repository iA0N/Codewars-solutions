/*
Kata description: https://www.codewars.com/kata/5541f58a944b85ce6d00006a
*/


import java.util.*;


public class ProdFib { // must be public for codewars 
  
  public static long[] productFib(long prod) {
    ArrayList<Long> fibArr = new ArrayList<Long>(Arrays.asList(0L, 1L));
    while(fibArr.get(fibArr.size()-1) * fibArr.get(fibArr.size()-2) < prod)
    {
      fibArr.add(fibArr.get(fibArr.size()-1) + fibArr.get(fibArr.size()-2));
    }
    long prod_possible = fibArr.get(fibArr.size()-1) * fibArr.get(fibArr.size()-2) == prod ? 1L : 0L;
    long[] arr = {fibArr.get(fibArr.size()-2), fibArr.get(fibArr.size()-1), prod_possible};
    return arr;
  }
}
