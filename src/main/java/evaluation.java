class evaluation
{
  public static String tokenizor(String a)
    {
      a.replace(" ","");
      if(a.matches("((?<=[+\\-*\\^\\/])\\-?[\\.\\d]+)|([\\.\\d]+)|([+\\-*\\/^\\(\\)])"))
      {
        return a.replace("", " "); 
      }
      else
      {
        return a;
      }
    }

  public static int precedence(char a)
  {
    switch(a)
    {
      case '+':
      case '-':
        return 1;
      case '/':
      case '*':
        return 2;
      case '^':
        return 3;
    }
    return 0;
  }

  public static String infixPostfixConverter(String a)
  {
    String answer;
    Stack<Character> Operators = new Stack<>();
    for(int i = 0; i < a.length(); i++)
    {
      
    }
  }
}
