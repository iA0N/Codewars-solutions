/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples:
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class PigLatin {
    public static String pigIt(String str) {
      return Arrays.stream((str.split(" ", 0))).map(w -> !(List.of("!", "?", ".").contains(w)) ? w.substring(1)+w.charAt(0)+"ay" : w)
      .collect(Collectors.joining(" "));
    }
}

