package verification;
import java.io.*;
import java.util.*;
import evaluation.Evaluate;


public class Verify
{
  // .*[].*
  public static boolean invalidChars(String a)
  {
    // Checks if string contains invalid characters.

    return Character.toString(a.charAt(a.length() - 1)).matches(".*[\\-\\+\\*\\/\\^].*") || Character.toString(a.charAt(0)).matches(".*[\\+\\*\\/\\^].*") || a.matches(".*[!@#$%&_=QWERTYUIOPqwertyuop{\\[}\\]|\\\\ASDFGHJKLasdfghjkl:;\"\'ZXCVBNMzxcvbnm<,>?`~].*");

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
