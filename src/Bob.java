import java.util.Scanner;
import java.io.*;
public class Bob {
    public static void main(String[] args) {
        talkToBob();
    }

    static void talkToBob() {
        Scanner scanner = new Scanner(System.in);
//        Object nullString = null;
//        String emptyString = "";
        String spaceString = " ";


//    Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//

        String userInput = scanner.next();
        int userInputIndex = (userInput.length() - 1);
        if (userInput.charAt(userInputIndex) == '?') {
            System.out.println("Sure.");
        } else if (userInput.charAt(userInputIndex) == '!') {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals(spaceString)) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
    //    Create a class named Bob with a main method for the following exercise.
//


//    int j;
//        for (j = 1; j <= userInput; j++) {
//        System.out.println(j + " base value " + j * j + " squared " + j * j * j + " cubed ");
//    }
//    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//    He answers 'Whatever.' to anything else.
//    Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
//
//
//}



