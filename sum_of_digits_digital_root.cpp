/*
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
*/


#include <string>

int digital_root(int n)
{
  std::string n_str = std::to_string(n);
  while(n_str.length() != 1)
  {
    int res = 0;
    for (const char& c : n_str) { res = res + (static_cast<int>(c) - 48); }
    n_str = std::to_string(res);
  }
  return std::stoi(n_str);
}

