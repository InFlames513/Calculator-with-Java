import java.util.Scanner;

public class Calculator {
  private static final String RESULT_FORMAT = "Result: %s"; // A constant instead of duplicating "Result: %s"

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner for take parameters from user
    
    System.out.print("What is your first parameter: ");
    int firstParamter = scanner.nextInt();
    System.out.print("\nWhat is your second parameter: ");
    int secondParamter = scanner.nextInt();
    scanner.nextLine(); // if we use nextLine after nextInt, nextInt doesnt take input of enter key and nextLine finishes immediately. Because of this, we use an extra nextLine.
    System.out.print("\nWhich calculation do you want to do: ");
    String operation = scanner.nextLine();

    switch (operation) { // A simple switch/case example
      case "*" -> System.out.printf(String.format(RESULT_FORMAT, firstParamter*secondParamter));
      case "x" -> System.out.printf(String.format(RESULT_FORMAT, firstParamter*secondParamter));
      case "+" -> System.out.printf(String.format(RESULT_FORMAT, firstParamter+secondParamter));
      case "-" -> System.out.printf(String.format(RESULT_FORMAT, firstParamter-secondParamter));
      case "/" -> System.out.printf(String.format(RESULT_FORMAT, firstParamter/secondParamter));
      default -> System.err.println("Wrong operation"); // For wrong operation situation;
    }
  }
}
