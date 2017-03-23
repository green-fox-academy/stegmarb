import java.util.Scanner;

/**
 * Created by stegmarb on 2017. 03. 23..
 */
public class Calculator {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String userOperator = scanner.nextLine();
    int userOperand1 = scanner.nextInt();
    int userOperand2 = scanner.nextInt();
    int resut = canlculator(userOperator, userOperand1, userOperand2);
    System.out.println("The result will be " + resut);

  }
  public static int canlculator (String operator, int operand1, int operand2) {
    int result = 0;
    if (operator.equals("*")) {
      result = operand1*operand2;
    } else if (operator.equals( "/")) {
      result = operand1/operand2;
    } else if (operator.equals("+")) {
      result = operand1+operand2;
    } else if (operator.equals("-")) {
      result = operand1-operand2;
    } else if (operator.equals("%")) {
      result = operand1%operand2;
    }
    return result;
  }
}



// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit