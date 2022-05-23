import java.util.Scanner;
import java.lang.Integer;


public class MethodsExercises {
    public static void main(String[] args) {
//        Calculator();
    }





    public static int functionSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to 1:Add, 2: Subtract, 3: Multiply, 4:Divide?");
        if (!(scanner.nextInt() == 1 || scanner.nextInt() == 2 || scanner.nextInt() == 3 || scanner.nextInt() == 4)) {
            functionSelection();
        }
        return scanner.nextInt();
    }

    //const getSeconds = setInterval(function (){
//        const date = new Date();
//        console.log(date);
//        const seconds = date.getSeconds();
//        console.log(seconds);
//        return seconds;
//    }, 1000);
//        console.log(getSeconds);
//    let colorPercentage = 6 * getSeconds;
//        console.log(colorPercentage);
//        if (getSeconds > 59) {
//        console.log(getSeconds);
//        clearInterval(getSeconds);
//        let colorPercentage = 6 * getSeconds;
//        console.log(colorPercentage);
//    }
//    Create a class named MethodsExercises. Inside of your class, write code to create the specified methods.
//    Test your code by creating a main method and calling each of the methods you've created.
//
//    Basic Arithmetic
    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Addition(int num1, int num2) {
        return num1 * num2;
    }
    public static float Division(float float1, float float2) {
        return float1 / float2;
        }
    public static void Calculator() {
        Scanner scanner = new Scanner(System.in);
        int functionSelection = functionSelection();
//        String response;
        System.out.println("What is the first number to ");
        switch (functionSelection) {
            case 1:
                System.out.print("add");
            case 2:
                System.out.println("subtract");
            case 3:
                System.out.println("multiply");
            case 4:
                System.out.println("divide");
        }
        int num1 = scanner.nextInt();

        System.out.println("What is the second number to ");
        switch (functionSelection) {
            case 1:
                System.out.print("add");
            case 2:
                System.out.println("subtract");
            case 3:
                System.out.println("multiply");
            case 4:
                System.out.println("divide");
        }

        int num2 = scanner.nextInt();
//
        System.out.println("The answer is");
        int response;
//        float divide;
        switch (functionSelection) {
            case 1:
                response = Integer.parseInt(Integer.toString(Addition(num1, num2)));
                System.out.println(response);
            case 2:
                response = Integer.parseInt(Integer.toString(Subtraction(num1, num2)));
                System.out.println(response);
            case 3:
                response = Integer.parseInt(Integer.toString(Multiplication(num1, num2)));
                System.out.println(response);
            case 4:
                float float1 = (float) num1;
                float float2 = (float) num2;

                response = Integer.parseInt(Float.toString(Division(float1, float2)));
                System.out.println(response);
            case 5:
                Calculator();
        }
//        public static int Addition (num1, num2){
//            System.out.println(" subtract?");
//            int num1 = scanner.nextInt();
//
//            System.out.println("What is the second number to subtract?");
//            int num2 = scanner.nextInt();
//            return num1 + num2;
//        }
        ;

//        public static int Subtraction () {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println(" subtract?");
//            int num1 = scanner.nextInt();
//
//            System.out.println("What is the second number to subtract?");
//            int num2 = scanner.nextInt();
//
//            return num1 - num2;
//        }
//    }
//
//    private int Multiplication(num1, num2) {
//        return num1*num2;
//    }
//
//    private int Subtraction(int num1, int num2) {
//        return num1-num2;
//    }
//
//    private int Addition(int num1, int num2) {
//        return num1 * num2;
//    }
//
//
//        }
////        System.out.println("What is the first number to add?");
////        int num1 = scanner.nextInt();
////        System.out.println("What is the second number to add?");
////        int num2 = scanner.nextInt()
//        } else if (functionSelection == 2) {
//            System.out.println(Subtraction(num1, num2));
//
//            System.out.println(" subtract?");
//            int num1 = scanner.nextInt();
//
//            System.out.println("What is the second number to subtract?");
//            int num2 = scanner.nextInt();
//        } else if (functionSelection == 3) {
//            System.out.println(Multiplication());
//
//            System.out.println("What is the first number to  multiply?");
//            int num1 = scanner.nextInt();
//
//            System.out.println("What is the second number to multiply?");
//            int num2 = scanner.nextInt();
//        } else if (functionSelection == 4) {
//            System.out.println(Division());
//
//            System.out.println("What is the first number to  multiply?");
//            int num1 = scanner.nextInt();
//
//            System.out.println("What is the second number to multiply?");
//            int num2 = scanner.nextInt();
//        }
//        else {
//            System.out.println("please select a valid option");
//        }
//
//
//
//    public static int Multiplication() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(" multiply?");
//        int num1 = scanner.nextInt();
//
//        System.out.println("What is the second number to multiply?");
//        int num2 = scanner.nextInt();
//        return num1 * num2;
//    }
//
//    public static float Division() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(" divide?");
//        float num1 = scanner.nextInt();
//
//        System.out.println("What is the second number to divide?");
//        float num2 = scanner.nextInt();
//        return num1 * num2;
//    }

//
//    Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//            Subtraction
//    Multiplication
//            Division

//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Test your methods and verify the output.
//
//    Add a modulus method that finds the modulus of two numbers.
//
//            Food for thought: What happens if we try to divide by zero? What should happen?
//
//    Bonus
//
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.
    }
    public static boolean verifyInteger () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your positive or negative integer of int type -2,147,483,648 to 2,147,483,647");
        long newInt = scanner.nextLong();
        int count = 0;
        do {
            if (newInt <= 0 && newInt >= Integer.MIN_VALUE) {
                count = 1;
            } else if (newInt >= 0 && newInt <= Integer.MAX_VALUE) {
                count = -1;
            } else {
                System.out.println("Please enter your positive or negative whole number that is within the range of int data type -2,147,483,648 to 2,147,483,647");
                newInt = scanner.nextLong();
            }
        } while (count == 0);
        return true;

    }


//    Create a method that validates that user input is in a certain range and returns that input as an integer if
//    it is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//    The method signature should look like this:
//
//


//    ?????????????????????????????????????????????

//    public static int getInteger(int min, int max)
//    and is used like this:
//
//
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//
//    Hint: recursion might be helpful here!
//
//    Calculate the factorial of a number.

    public static float factorial () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your positive or negative integer of int type -2,147,483,648 to 2,147,483,647");
        float num = scanner.nextInt();
        int i;
        int factorial = 0;
        for (i = 2; i <= num; i++) {
            factorial = i * (i + 1);
        }
        return factorial;
    }


//


//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24
//    Bonus
//
//    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//    Use recursion to implement the factorial.


    public static void dice () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of faces of die one");
        int faceOne = scanner.nextInt();

        System.out.println("Please enter the number of faces of die one");
        int faceTwo = scanner.nextInt();

        System.out.println("die 1: " + faceOne + " die 2: " + faceTwo);
        System.out.println("Would you like to roll again? Y:N?");
        String reroll = scanner.next();
        do {
            if (reroll == "Y") {
                dice();
            } else if (reroll != "Y" && reroll != "N") {
                System.out.println("Please enter Y:N");
            } else {
                System.out.println("thanks!");
            }
        } while (reroll != "N");
    }
}


//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.
//    Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.
//    Bonus
//
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.
//    codeycodey Pair programming exercise
//
//    Remember to follow our pair programming best practices and switch computers every once in a while.
//
//    Console Adventure Game!
//
//    Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game. These types of online role-playing games date back to the 70's and solely rely on a text-based interface. In this case, we'll be using Java to run this game in our console.
//
//    The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class). How the game changes depending on their answer is completely up to you! Below are a list of suggested features to get you started:
//
//    Ask if the user is ready to start. If they type in "yes", start the game.
//    Ask the user for their name. Store this as a variable to personalize the adventure.
//    A classic RPG will have the hero going through different scenarios and battling their enemies.
//    Display enemy stats and hero stats. Properties and values can be assigned by you.
//    For example: Health, Attack Points, etc.
//    Decide on what actions your hero can take.
//    Attack (decreases enemyHealth)
//    Drink potion (adds to heroHealth)
//    Run? (ends the game)
//    Keep asking for user input until the enemyHealth reaches 0, then end the game.
//    Bonuses
//
//    Allow the user to specify hero stats and enemy stats.
//    Automate an enemyAttack after each time the hero takes a turn.
//    End the game if either heroHealth or enemyHealth drops to 0.
//    Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.
//
//    Remember that these are only suggestions. Feel free to get creative and have

