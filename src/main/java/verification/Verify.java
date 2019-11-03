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
    // Create stack for '('.
    Stack<Character> stack = new Stack<Character>();
    
    for(int i = 0; i < a.length(); i++)
    {
      if(a.charAt(i) == '(')
      {
        stack.push(a.charAt(i));
      }
      else if(a.charAt(i) == ')' && stack.empty())
      {
        return true;
      }
      else if(a.charAt(i) == ')' && !stack.empty())
      {
        stack.pop();
      }
      else
      {
        continue;
      } 
    }

    if(stack.empty())
    {
      return false;
    }
    else
    {
      return true;
    }

  }
}
