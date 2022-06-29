/*
Kata description: https://www.codewars.com/kata/545cedaa9943f7fe7b000048
*/


public class PangramChecker {
  public boolean check(String sentence){
    for (int i = 97; i <= 122; i++)
    {
      if (!sentence.toLowerCase().contains(Character.toString(i))) { return false; }
    }
    return true;
  }
}
