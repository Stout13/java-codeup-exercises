import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    public static void main(String[] args) {
        Person[] people = makePeople();
//        for ( : people) {
//            System.out.println(Arrays.toString(people[Person[] bruh]));
//        }
        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person[] folks = addPerson(people);
        for (Person person : folks) {
            System.out.println(person.getName());
        }
        ex();
    }

    public static void ex() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Array Basics
//
//        Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
//
//        What happens when you run the following code? Why is Arrays.toString necessary?
//
    }

    public static Person[] makePeople() {
        Person Bob = new Person("Bob");
        Person Sarah = new Person("Sarah");
        Person Jamie = new Person("Jamie");
        return new Person[]{Bob, Sarah, Jamie};
    }
    public static Person[] addPerson(Person[] persons) {
        System.out.println("Enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        makePeople();
        int len = persons.length;
        Person[] newPeople = new Person[len + 1];
        Person Liam = new Person(name);
        int i = 0;
        while (i<persons.length) {
            newPeople[i] = persons[i];
            i++;
        }
        newPeople[i] = Liam;
        return newPeople;
    }
}

/*
        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

                Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator,
        and follow the specs below.

        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
                Create a method that will return a random element from an array of strings.
                Add a main method, and

                inside of your main method select and random noun and adjective and hyphenate

                the combination and display the generated name to the user.
                Example Output


        Here is your server name:
        dedicated-photon
        Movie List


====================   Download the MoviesArray file and save it as MoviesArray.java inside of movies.   ====================

        We are going to build an application that keeps track of movies and displays them by category.

        Inside of src, create a directory named movies. Create all of the classes described below in this
            directory.
            Create a class named Movie.

        It should have private fields for name and category, and a constructor
            that sets both of these.

        Create methods to access these properties and change
            them (getters and setters).

        Download the MoviesArray file and save it as MoviesArray.java inside of movies.
        This class has a
            static method named findAll that will return an array of Movie objects.
        Create a class named MoviesApplication that has a main method.

        Give the user a list of options for viewing
                all the movies or viewing movies by category.

        Use your Input class to get input from the user, and display information based on
                their choice. (Remember to import your Input class)

        If a category is selected, only movies from that category should be displayed.
                Your application should continue to run until the user chooses to exit.
                Sample Output


        What would you like to do?

        0 - exit
        1 - view all movies
        2 - view movies in the animated category
        3 - view movies in the drama category
        4 - view movies in the horror category
        5 - view movies in the scifi category

        Enter your choice: 1

        Frankenstein -- horror
        Goodfellas -- drama
        Pulp Fiction -- drama
...

*/