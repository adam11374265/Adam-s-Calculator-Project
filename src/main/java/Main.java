import java.util.Scanner;
import verification.Verify;

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
<<<<<<< HEAD
      if(Verify.checkValid(_userInput))
=======
      if(Verify.invalidChars(_userInput) == true && Verify.balancedParenthesis(_userInput) == true)
>>>>>>> 0faeec1ab2141ddcf910b4b40a3bd55c36977901
      {
        System.out.println("Invalid expression. Re-enter expression.");
      }
    }


  }
}
