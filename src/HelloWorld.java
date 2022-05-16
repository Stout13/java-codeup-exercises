public class HelloWorld {

    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");


//        int myFavoriteNumber = 13;
//        System.out.print(myFavoriteNumber);
//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//
//        String myString = "Taco Tuesday";
//        System.out.print(myString);

//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//
//        String objects are immutable!
//                Change your code to assign a character value to myString. What do you notice?
//
//        myString = 3.141_59;   String objects are immutable!
//        Change your code to assign the value 3.14159 to myString. What happens?

//

        long myNumber;
//        System.out.print(myNumber);  throws error, not initialized
//      Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//



//        myNumber = 3.14;
//      Change your code to assign the value 3.14 to myNumber. What do you notice?
//

//        myNumber = 123L;
//      Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//        myNumber = 123;
//      Change your code to assign the value 123 to myNumber.
//

//      Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//

//        float myNumber = 3.14;
//          Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//


//          Copy and paste the following code blocks one at a time and execute them
//
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


//        the incrementing takes place after the print on line 55 and before the print on line 59

//        What is the difference between the above code blocks? Explain why the code outputs what it does.
//

//        String class = "something";

//        lots of errors, not a statemnt, class is automatically read as class
//                Try to create a variable named class. What happens?
//


//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//
//
//        I think it will have an error when the string is assigned to int like 'data type string cannot be assigned to in object'

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at HelloWorld.main(HelloWorld.java:82)
//
//        Process finished with exit code 1

//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//                How is the above example different from the code block below?
//
//
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//
//                Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//        int x = 4;
//        x += 1;
//        System.out.print(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//
//        System.out.print(y);


//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//
//        System.out.print(y);
//
//          it won't work
//
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        also won't work
//
//        What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum
//        value for the int type.
//


                }
}

// javac HelloWorld.java
// java HelloWorld
//
// to run HelloWorld.java fromm the console