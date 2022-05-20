import java.util.Scanner;



public class HighLow {
    public static void main(String[] args) {
        //    The specs for the game are:
        pick();
    }

    public static void pick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 1-100!");
        String play = "";
        do {
            int pickANumber = scanner.nextInt();
            double randomNumber = (Math.floor(Math.random() * 101));
            String random = randomNumber + "";
            int number = Integer.parseInt(random);
            if (number != pickANumber) {
                if (number > pickANumber) {
                    System.out.println("higher");
                } else {
                    System.out.println("lower");
                }
                System.out.println("Nailed it!");
                System.out.println("Would you like to play again? Y:N");
                play = scanner.next();
            }
        } while (play == "Y");
    }
}
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
