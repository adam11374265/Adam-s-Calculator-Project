package verification;
import java.io.*;
import java.util.*;

public class Verify
{
  // .*[].*
  public static boolean invalidChars(String a)
  {
    // Checks if string contains invalid characters.
    return a.contains(".*[abcdefghij\"k\'lmnopqrstuvwxyzABCCEDGHIJKLMNOPQRSTUVWXYZ&$#@!~`\\\\|/?.>,<[\\]{\\}]=)].*");

  }
  public static boolean balancedParenthesis(String a)
  {
    // create stack for '('.
    // Stack<Integer> stack = new Stack<Integer>();
    Stack<Character> p = new Stack<Character>();
    // Loop through the string.
    for(int i = 0; i < a.length(); i++)
    {
      // If scanned char is '(' then push scanned char to the stack.
      if(a.charAt(i) == '(')
      {
        p.push(a.charAt(i));
      }
      // If scanned char is equal to ')', and the stack is not empty then take a char off the stack.
      else if(a.charAt(i) == ')' && !p.empty())
      {
        p.pop();
      }
      else if(a.charAt(i) == ')' && p.empty())
      {
        return false;
      }

    }
    // If the stack is empty then return false that the string is valid.
    return p.empty();

  }
}
