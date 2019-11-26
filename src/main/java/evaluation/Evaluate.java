package evaluation;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import evaluation.Evaluate;
 
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
 
 public static boolean greaterPrecedence(String a, String b)
 {
   HashMap<String, Integer> map = new HashMap<String, Integer>();
   {{
     map.put("(", 0);
     map.put("+", 1);
     map.put("-", 1);
     map.put("*", 2);
     map.put("/", 2);
     map.put("^", 3);
   }}
   return map.get(a) >= map.get(b);
 }
 
 public static String infixPostfixConverter(String c)
 {
   String[] a = tokenizor(c);
   String result = "";
   Stack<String> Operators = new Stack<String>();
   for(int i = 0; i < a.length; i++)
   {
     if(a[i].matches(".*[\\d].*"))
     {
       result = result + a[i] + " ";
     }
     else if(a[i] == "(")
     {
       Operators.push(a[i]);
     }

     else if(a[i].matches(".*[-\\+*\\/^].*"))
     {
       if(!Operators.empty())
       {
          while(!Operators.empty() && !a[i].equals("(") && greaterPrecedence(Operators.peek(), a[i]))
          {
            result = result + Operators.pop() + " ";
          }

         Operators.push(a[i]);
       }

       else if(Operators.empty())
       {
         Operators.push(a[i]);
       }
     }

     else if(a[i] == ")")
     {
       while(!Operators.peek().equals("("))
      {
        result = result + " " + Operators.pop();
      }
      Operators.pop();
     }
   }
 
   while(!Operators.empty())
   {
     result = result + " " + Operators.pop();
   }

   return result;

  }
}
 

