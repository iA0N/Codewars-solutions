/*
Kata: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
*/


class Persist {
  public static int persistence(long n) {
    int i = 0;
    while(n>=10)
    {
      int temp = 1;
      for (String d : String.valueOf(n).split("")) { temp *= Integer.parseInt(d); }
      n = temp;
      i++;
    }
    return i;
  }
}
