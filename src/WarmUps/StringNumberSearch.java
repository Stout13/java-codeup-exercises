package WarmUps;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StringNumberSearch {
//    Create a method that accepts a string of space separated numbers and returns the highest and lowest number (as a string).
//    example input: "1 2 3 4 5"
//    expected output: "5 1"
//    example input: "1 9 3 4 -5"
//    expected output: "-5 9"
    public static void main(String[] args) {
        String num = "1, -2, 3, -4";
        StringNumberSearch(num);
    }
    public static void StringNumberSearch(String num) throws ClassCastException {
        Object[] numList;
        numList = num.split(" ");

        System.out.println(numList);


        }




    }
