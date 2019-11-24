import java.util.Scanner;
import verification.Verify;
import evaluation.Evaluate;

class Main
{
  public static void main(String[] args)
  {
    // Global variables.
    Scanner _scanner = new Scanner(System.in);
    String _userInput;

    // Print start message.
    System.out.println("At the prompt, type in input.\n");

    // loop until user wants to quit.
    while(true)
    {
      // Ask the user for an input.
      System.out.print("INPUT> ");
      _userInput = _scanner.nextLine();

      // Checks for balanced parenthesis and invalid characters.

      if(Verify.checkValid(_userInput))
      {
        System.out.println("Invalid expression. Re-enter expression.");
      }
      else
      {
        System.out.println("OUTPUT> " + Evaluate.infixPostfixConverter(_userInput));
      }
      
    }


  }
}
