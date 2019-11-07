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
        return false;
      }
      else if(a.charAt(i) == ')' && !stack.empty())
      {
        stack.pop();
      }
      
    }
    
    return stack.empty();
   

  }
}
