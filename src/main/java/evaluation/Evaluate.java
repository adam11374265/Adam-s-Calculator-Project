package evaluation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Evaluate
{
  public static String[] tokenizor(String a)
  {
    a.replace(" ","");
    final Pattern pattern = Pattern.compile("((?<=[+-\\/\\^*])\\-?[\\d\\.]+)|([+-\\/\\^*\\)\\(])|([\\d\\.]+)", Pattern.MULTILINE);
    final Matcher matcher = pattern.matcher(a);
    final String[] result = matcher.replaceAll("$0 ").split("\\s");

    return result;
  }

  public static boolean precedence(String a, String b)
  {
    HashMap<String, Integer> map = new HashMap<>();
    {{
      map.put("(", -1);
      map.put("+", 1);
      map.put("-", 1);
      map.put("*", 2);
      map.put("/", 2);
      map.put("^", 3);
    }}
    return map.get(a) < map.get(b);
  }

  public static String infixPostfixConverter(String c)
  {
    String[] a = tokenizor(c);
    String answer = "";
    Stack<String> Operators = new Stack<>();
    for(int i = 0; i < a.length; i++)
    {
      // If scanned index of array is a number, then add it to the answer.
      if(a[i].equals("[\\d]"))
      {
        answer = answer + a[i];
      }
      // If scanned index of array is an operator and Operator stack is empty
      // then add it to the stack.
      else if(a[i].equals("\\*\\+\\-\\/\\^\\(") && Operators.empty())
      {
        Operators.push(a[i]);
      }
      // If scanned index is an operator and if the precedence of the scanned index
      // is greater than the top of the stack then push it to the Operator stack.
      else if(a[i].equals("\\*\\+\\-\\/\\^") && precedence(a[i], Operators.peek()))
      {
        Operators.push(a[i]);
      }
      // If scanned index is an operator and the precedence of the index is less than 
      // the top of the stack.
      else if(a[i].equals("\\*\\+\\-\\/\\^")  && !precedence(a[i], Operators.peek()))
      {
        // While the precedence of the scanned index is less than the top of the stack 
        // and the stack is not empty, then add the top of the stack to the answer. 
        while(!precedence(a[i], Operators.peek()) || !Operators.empty())
        {
          answer = answer + Operators.pop();
        }
        // Push the scanned index to the stack.
        Operators.push(a[i]);
      }
      // If a ')' is scanned then, while a '(' is not scanned add the top of the stack to the answer.
      else if(a[i].equals(")"))
      {
        while(!a[i].equals("("))
        {
          answer = answer + Operators.pop();
        }
        // Take the '(' off of the stack.
        Operators.pop();
      }
    }
    // If the stack is not empty, then add the stack to the answer.
    if(!Operators.empty())
    {
      answer = answer + Operators.pop();
    }
    // Output the answer.
    return answer;
  }
}
