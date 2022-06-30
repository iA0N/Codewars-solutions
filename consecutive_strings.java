/*
You are given an array(list) strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.

Kata: https://www.codewars.com/kata/56a5d994ac971f1ac500003e
*/


import java.util.*;

class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
      String longest_word = "";
      for (int i = 0; i <= strarr.length - (k); i++)
      {
        String temp = "";
        for (int j = 0; j < k; j++) { temp += strarr[i + j]; }
        if (temp.length() > longest_word.length())
        { longest_word = temp; }
      }
      return longest_word;
    }
}
