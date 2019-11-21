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
      if(charAt(i).matches("[\\d]"))
      {
        answer = answer + charAt(i);
      }
      else if(charAt(i).matches("\*\+\-\/\^\(") && Operators.empty())
      {
        Operators.push(charAt(i));
      }
      else if(charAt(i).matches("\*\+\-\/\^") && precedence(charAt(i)) >= precedence(charAt(Operators.peek)))
      {
        Operators.push(charAt(i));
      }
      else if(charAt(i).matches("\*\+\-\/\^")  && precedence(charAt(i)) <= precedence(charAt(Operators.peek)))
      {
        Operators.push(charAt(i));
        while(precedence(charAt(i)) <= precedence(charAt(Operators.peek)) || !Operators.empty())
        {
          answer = answer + Operators.pop();
        }
      }
     else if(charAt(i) == ')')
     {
      while(!charAt(i).equals('('))
      {
        answer = answer + Operators.pop();
      }
       Operators.pop()
     }
    }
    if(!Operators.empty())
    {
      answer = answer + Operators.pop();
    }
    return answer;
  }
}
