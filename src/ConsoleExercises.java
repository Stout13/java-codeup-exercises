import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        Copy this code into your main method:
//

        double pi = 3.14159;
//
//        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//
//
        System.out.print(pi);

//        The value of pi is approximately 3.14.
//                Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
//



//        Explore the Scanner Class.
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int userInput = scanner.nextInt();
        System.out.print(userInput);


//
//        What happens if you input something that is not an integer?
//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//        at java.base/java.util.Scanner.next(Scanner.java:1594)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at ConsoleExercises.main(ConsoleExercises.java:27)

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first name");
        String first = scanner.next();
        System.out.print("enter middle name");
        String middle = scanner.next();

        System.out.print("enter last name");
        String last = scanner.next();

        System.out.println(first + ' ' + middle + ' ' + last);

//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?
//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
        System.out.print("enter a sentence");
        String sentence = scanner.next();
        System.out.println(sentence);


//        do you capture all the words?
//                Rewrite the above example using the nextLine method.
//


        System.out.print("enter a sentence");
        String sentenceRedo = scanner.nextLine();
        System.out.println(sentenceRedo);
//                Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).

        System.out.print("enter room dimensions");
        System.out.print("enter room length");
        int length = scanner.nextInt();
        System.out.print("enter room width");
        int width = scanner.nextInt();


//
//        Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
        System.out.print("area");
        int area = length*width;
        System.out.print("perimeter");
        int perimeter = length*2 + width*2;
        System.out.print("area = " + area);
        System.out.print("area = " + perimeter);



//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//



//                Bonuses
//        In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//
//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
    }
}
