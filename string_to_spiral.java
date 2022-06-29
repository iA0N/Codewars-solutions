/*
Kata description: https://www.codewars.com/kata/5bdbc57f4a8a17814c000177
*/

import java.lang.Math;
import java.util.Arrays;

class JomoPipi {
    public static String toSpiral(String s) {
        enum Direction { UP, LEFT, DOWN,RIGHT }
      
        // setup
        String o_string = "";
        int min_length = (int) Math.ceil(Math.sqrt(s.length()));
        char[][] spiral = new char[min_length][min_length];
        while(s.length() < (int) Math.pow(min_length, 2)) { s = s + " "; }
        
        // string processing
        int i, j, i_min, j_min, i_max, j_max;
        i = j = i_min = j_min = 0;
        i_max = j_max = min_length - 1;
        Direction cd = Direction.RIGHT;
        spiral[i][j] = s.charAt(0);
        boolean char_set = false;
      
        for (int k = 1; k < s.length(); k++ )
        {
          char c = s.charAt(k);
          char_set = false;
          while(!char_set)
          {
            if (cd == Direction.RIGHT)
            {
              if (j < j_max)
              {
                j++;
                char_set = true;
              }
              else
              {
                cd = Direction.DOWN;
                i_min++;
              }
            }
            else if (cd == Direction.DOWN)
            {
              if (i < i_max)
              {
                i++;
                char_set = true;
              }
              else
              {
                cd = Direction.LEFT;
                j_max--;
              }
            }
            else if (cd == Direction.LEFT)
            {
              if (j > j_min)
              {
                j--;
                char_set = true;
              }
              else
              {
                cd = Direction.UP;
                i_max--;
              }
            }
            else if (cd == Direction.UP)
            {
              if (i > i_min)
              {
                i--;
                char_set = true;
              }
              else
              {
                cd = Direction.RIGHT;
                j_min++;
              }
            }  
          }
          
          spiral[i][j] = c;
        }
      
        // print out
        for (int row = 0; row < min_length; row++)
        {
          o_string = o_string + o_string.valueOf(spiral[row]);
          if (row != min_length - 1) { o_string = o_string + "\n"; }
        }
      
      return o_string;
    }
}
