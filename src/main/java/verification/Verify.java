package verification;
class Verify
{
  // .*[].*
  public static boolean invalidChars(String a)
  {
    // Checks if string contains invalid characters.
    if(a.contains(".*[abcdefghij\"k\'lmnopqrstuvwxyzABCCEDGHIJKLMNOPQRSTUVWXYZ&$#@!~`\\\\|/?.>,<[\\]{\\}]=)].*"))
    {
      // Tells user to re enter expression.
      System.out.print("Invalid expression. Re enter.");
    }

  }
  public static boolean balancedParenthesis(String a)
  {
    // create stack for '('.
    Stack<Character> p = new Stack<Character>();
    // Loop through the string.
    for(int i = 0; i < a.length(); i++)
    {
      if(a.charAt(i) == '(')
      {
        p.push(a.charAt(i));
      }
      else if(a.charAt(i) == ')')
      {
        p.pop();
      }
    }

  }
}
