/*
Kata:
Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw according to these rules.

You will always be given an array with five six-sided dice values.
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
 
 A single die can only be counted once in each roll.
 For example, a given "5" can only count as part of a triplet (contributing to the 500 points) or as a single 50 points, but not both in the same roll.

https://www.codewars.com/kata/5270d0d18625160ada0000e4
*/

// import java.util.*;

public class Greed{
  public static int greedy(int[] dice){
    int rv = 0;
    for (int i = 1; i <= 6; i++)
    {
      int mp = i == 1 ? 1000 : 100, amount = 0;
      for (int j = 0; j < dice.length; j++) { if (dice[j] == i) { amount++; } }
      rv += amount >= 3 ? (amount == 6 ? i * mp * 2: i * mp) : 0;
      rv += i == 1 || i == 5 ? (i == 1 ? 100 * (amount % 3) : 50 * (amount % 3)) : 0;
    }
    return rv;
  }
}
