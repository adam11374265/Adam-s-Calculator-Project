package verification;
import java.io.*;
import java.util.*;

public class Verify
{
  // .*[].*
  public static boolean invalidChars(String a)
  {
    // Checks if string contains invalid characters.

    return a.matches(".*[abcdefghij\"k\'lmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&$#@!~`\\\\|/?>,<[\\]{\\}]=].*");

  }
  public static boolean imbalancedParenthesis(String a)
  {
    // Create stack for '('.
    Stack<Character> stack = new Stack<Character>();

    for(int i = 0; i < a.length(); i++)
    {
      // If scanned char is '(' then push scanned char to the stack.
      if(a.charAt(i) == '(')
      {
        stack.push(a.charAt(i));
      }
      else if(a.charAt(i) == ')' && !stack.empty())
      {
        stack.pop();
      }
        else if(a.charAt(i) == ')' && stack.empty())
      {
        return true;
      }
    }

      return !stack.empty();

  }
  // (.*--+[\d].*)|(.*[\+\/\*\)\(\^].*)|(.*[\d].*)
  public static boolean invalidSyntax(String a)
  {
    return a.matches("(.*[\\d]+\\(.*)|(.*\\)[\\d].*)|(.*[-+\\*\\/^][+\\*\\/^\\)].*)|(.*\\.[\\d]*\\..*)|(.*^0{2,}\\..*)|(.*\\(\\).*)");
  }

  public static boolean checkValid(String a)
  {
    return invalidSyntax(a) || invalidChars(a) || imbalancedParenthesis(a);
  }
}
