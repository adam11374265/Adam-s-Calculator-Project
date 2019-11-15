package verification;
import java.io.*;
import java.util.*;

public class Verify
{
  // .*[].*
  public static boolean invalidChars(String a)
  {
    // Checks if string contains invalid characters.
<<<<<<< HEAD
    return a.matches(".*[abcdefghij\"k\'lmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&$#@!~`\\\\|/?.>,<[\\]{\\}]=)].*");
=======
    return a.contains(".*[abcdefghij\"k\'lmnopqrstuvwxyzABCCEDGHIJKLMNOPQRSTUVWXYZ&$#@!~`\\\\|/?.>,<[\\]{\\}]=)].*");
    
>>>>>>> 0faeec1ab2141ddcf910b4b40a3bd55c36977901
  }
  public static boolean balancedParenthesis(String a)
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
<<<<<<< HEAD
      // If scanned char is equal to ')', and the stack is not empty then take a char off the stack.
      else if(a.charAt(i) == ')' && !p.empty())
=======
      else if(a.charAt(i) == ')' && stack.empty())
>>>>>>> 0faeec1ab2141ddcf910b4b40a3bd55c36977901
      {
        return false;
      }
<<<<<<< HEAD
      else if(a.charAt(i) == ')' && p.empty())
      {
        return true;
      }

    }
    // If the stack is empty then return false that the string is valid.
    return !p.empty();


  }
=======
      else if(a.charAt(i) == ')' && !stack.empty())
      {
        stack.pop();
      }
      
    }
    
    return stack.empty();
   
>>>>>>> 0faeec1ab2141ddcf910b4b40a3bd55c36977901

  public static boolean syntaxErrors(String a)
  {
    return !a.matches("(.*[\\d]\\(.*)|(.*\\)[\\d].*)|(.*[-+\\*\\/^][+\\*\\/^\\)].*)|(.*\\.[\\d]+\\..*)|(.*^0{2,}\\..*)|(.*\\(\\).*)");
  }

  public static boolean checkValid(String a)
  {
    return invalidChars(a) && balancedParenthesis(a) && syntaxErrors(a);
  }
}
