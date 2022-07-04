/*
Kata:
Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
(Java does not have int32 so long is used)

https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
*/

public class Kata {
  public static String longToIP(long ip) {
    String binary_string = Long.toBinaryString(ip);
    if (ip == 0L) { return "0.0.0.0"; }
    while (binary_string.length() != 32) binary_string = "0" + binary_string;
    String rv = Long.toString(Long.parseLong(binary_string.substring(0,8), 2)) + ".";
    rv += Long.toString(Long.parseLong(binary_string.substring(8,16), 2)) + ".";
    rv += Long.toString(Long.parseLong(binary_string.substring(16,24), 2)) + ".";
    rv += Long.toString(Long.parseLong(binary_string.substring(24,32), 2));
    return rv;
  }
}
