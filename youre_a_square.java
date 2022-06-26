/*
Kata description: https://www.codewars.com/kata/54c27a33fb7da0db0100040e
*/


public class Square {    
    public static boolean isSquare(int n) {
        if (n < 0) { return false; }
        for (int i = 0; i <= (int)(n / 2); i++)
          {
            if (n == i*i)
              {
                return true;
              }
          }
        return false;
    }
}
