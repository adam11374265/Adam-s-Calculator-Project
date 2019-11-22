import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class evaluation
{
  public static String[] tokenizor(String a)
    {
      a.replace(" ","");

      // (?<=[+\\-*\\^\\/])\\-?[\\.\\d]+) | ([\\.\\d]+) | ([+\\-*\\/^\\(\\)])")

    }

  public static boolean precedence(char a, char b)
  {
    HashMap<String, Integer> map = new HashMap<>();
    {{
      map.put("+", 1);
      map.put("-", 1);
      map.put("*", 1);
      map.put("/", 1);
      map.put("^", 1);
    }}
    return map.get(a) < map.get(b);


  }

  public static String infixPostfixConverter(String a)
  {
    String answer;
    Stack<Character> Operators = new Stack<>();
    for(int i = 0; i < a.length(); i++)
    {

      if(a.charAt(i).toString().equals("[\\d]"))
      {
        answer = answer + a.charAt(i);
      }
      else if(a.charAt(i).toString().equals("\\*\\+\\-\\/\\^\\(") && Operators.empty())
      {
        Operators.push(a.charAt(i));
      }
      else if(a.charAt(i).toString()a.equals("\\*\\+\\-\\/\\^") && precedence(a.charAt(i), Operators.peek()))
      {
        Operators.push(a.charAt(i));
      }
      else if(a.charAt(i).toString().equals("\\*\\+\\-\\/\\^")  && precedence(a.charAt(i), Operators.peek()))
      {
        Operators.push(a.charAt(i));
        while(precedence(a.charAt(i)), Operators.peek())) || !Operators.empty())
        {
          answer = answer + Operators.pop();
        }
      }
     else if(charAt(i) == ')')
     {
      while(!a.charAt(i).toString().equals('('))
      {
        answer = answer + Operators.pop();
      }
       Operators.pop();
     }
    }
    if(!Operators.empty())
    {
      answer = answer + Operators.pop();
    }
    return answer;
  }
}
