import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    // Global variables.
    Scanner _scanner = new Scanner(System.in);
    String result;
    // Tells user how to end program
    System.out.println("Type 'end' to end program.");
    System.out.println(" ");
    // loop until user wants to quit.
    while(true)
    {
      // Ask the user for an input.
      System.out.print("Enter equation: ");
      result = _scanner.nextLine();
      // Stops program.
      if(result.equals("End") || result.equals("end"))
      {
        break;
      }

    }
  }
}
