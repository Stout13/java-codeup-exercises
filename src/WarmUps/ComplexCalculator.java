package WarmUps;

import java.util.Scanner;

public class ComplexCalculator {
    public static void main(String[] args) {

    }
    public static double ComplexCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a two values and an operator to see a math problem");
        System.out.println("Begin by entering the first number");
        double firstNum = scanner.nextDouble();
        System.out.println("Please enter the second number");
        double secondNum =  scanner.nextDouble();
        System.out.println("Finally, enter an operator to use with the second number " +
                "in order to see the results of a math problem");
        String operator = scanner.nextLine();
        double result = 0;
        switch(operator) {

            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
        }
        System.out.println();
        return result;
    }
    //            2. Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
//    example inputs: 4, '/', 2
//    expected output: 2 (edited)
}
