/*
Kata: https://www.codewars.com/kata/5208f99aee097e6552000148
*/


class Solution {
  public static String camelCase(String input) {
    String rv = "";
    for (int i = 0; i < input.length(); i++)
    {
      rv += Character.isUpperCase(input.charAt(i)) ? " " + input.charAt(i) : input.charAt(i); 
    }
    /*
       	 Another idea: can also be done via substrings.
	 int li = 0;
	 for (int i = 0; i < input.length(); i++)
	 {
	   if ((input.charAt(i) >= 65 && input.charAt(i) <= 90) || i == input.length() - 1)
           {
             rv += input.substring(li, (i == input.length() - 1 ? i + 1 : i));
             if (i != input.length() - 1) { rv += " "; }
             li = i;
           }
         }
    */
    return rv;
  }
}
