import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics
//
//        While
//
//        int i = 5;

//        Create an integer variable i with a value of 5.

//        while(i<=15){
//            System.out.print(i);
//            i++;
//        }

//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//


//        5 6 7 8 9 10 11 12 13 14 15
//
//        Do While
//
//        i = 0;
//        do{
//            System.out.print(i*2);
//            i++;
//        }while(i<=50);

//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do{
//            System.out.println((100-(i*5)));
//            i++;
//        }while(i<=22);
//        Alter your loop to count backwards by 5's from 100 to -10.


//        int i = 2;
//        do{
//            System.out.println(i);
//            i=i*i;
//        }while(i<1000000);
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//


//        2
//        4
//        16
//        256
//        65536
//        For
//

//        int i;
//        for(i=2; i<1000000; ) {
//            System.out.println(i);
//            i = i*i;
//        }

//        Refactor the previous two exercises to use a for loop instead.
//        Fizzbuzz
//


        
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//

        int i = 1;
        for (i = 0;i<100; i++){
            if (i%3 != 0 && i%5%3 != 0) {
                System.out.println(i);
            }
            else if (i%3 == 0 && i%5%3 !=0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0 && i%3%5 !=0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println("FizzBuzz");
            }
        }

//                Write a program that prints the numbers from 1 to 100.


//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        Display a table of powers.
//


        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an integer:");
        int userInput = scanner.nextInt();
        int j;
        for (j = 1; j <= userInput; j++) {
            System.out.println(j + " base value " + j * j + " squared " + j * j * j + " cubed ");
        }
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//        Convert given number grades into letter grades.
//
        System.out.print("enter a grade 0-100 rounded to the nearest integer:");
        int grade = scanner.nextInt();

        if (grade <=100 && grade >= 90) {
            if (grade > 96) {
                System.out.println("A+" + grade);
            }
            else if (grade < 94) {
                System.out.println("A-");
            }
            else {
                System.out.println("A");
            }
        }

        else if (grade <=89 && grade >= 80) {
            if (grade > 86) {
                System.out.println("B+");
            }
            else if (grade < 84) {
                System.out.println("B-");
            }
            else {
                System.out.println("B");
            }
//            System.out.println("B : 87 - 80");
        }
        else if (grade <=79 && grade >= 70) {
            if (grade + 3 > 79) {
                System.out.println("C+");
            }
            else if (grade-4<67) {
                System.out.println("C-");
            }
            else {
                System.out.println("C");
            }
//            System.out.println("C : 79 - 67");
        }
        else if (grade <=70 && grade >= 60) {
            if (grade > 66) {
                System.out.println("D+");
            }
            else if (grade < 63) {
                System.out.println("D-");
            }
            else {
                System.out.println("D");
            }
//            System.out.println("D : 66 - 60");
        }
        else {
            System.out.println("F+");
        }
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        for (l = 1; l <= userInput; l++) {
//            System.out.println(j + " base value " + j * j + " squared " + j * j * j + " cubed ");
//        }

//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
    }
}