package verification;
import java.io.*;
import java.util.*;

public class Verify
{
  // .*[].*
  public static boolean invalidChars(String a)
  {
    // Checks if string contains invalid characters.
    if(a.contains(".*[abcdefghij\"k\'lmnopqrstuvwxyzABCCEDGHIJKLMNOPQRSTUVWXYZ&$#@!~`\\\\|/?.>,<[\\]{\\}]=)].*"))
    {
      // Notifies if there are invalid characters.
      return true;
    }
    else
    {
      return false;
    }

  }
  public static boolean balancedParenthesis(String a)
  {
    // create stack for '('.
    // Stack<Integer> stack = new Stack<Integer>();
    Stack<Character> p = new Stack<Character>();
    // Loop through the string.
    for(int i = 0; i < a.length(); i++)
    {
      if(a.charAt(i) == '(')
      {
        p.push(a.charAt(i));
      }
      else if(a.charAt(i) == ')' && !p.empty())
      {
        p.pop();
      }
      else
      {
        return false;
      }
    }
    if(p.empty())
    {
      return false;
    }
    else
    {
      return true;
    }

  }
}
