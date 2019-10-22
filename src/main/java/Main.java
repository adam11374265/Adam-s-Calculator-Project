import java.util.Scanner;

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

      // Print out result.
      System.out.println("\nRESULT> " + _userInput + "\n");
    }
  }
}
