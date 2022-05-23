package May23Examples;

import java.util.*;

public class classExample23May {
    public static void main(String[] args) {
        weatherArray();
        dailySteps();
        makeArray();
    }

    public static void weatherArray() {
        String[] weather = new String[3];
        weather[0] = "sunny";
        weather[1] = "rainy";
        weather[2] = "cloudy";
        System.out.println(weather);
    }
    public static void dailySteps() {
        long[] dailySteps = {10000, 20000, 15000, 8000, 25000, 2000, 8000};
        System.out.println(Arrays.toString(dailySteps));
    }
    public static void makeArray() {
        int[] arr = {1, 2, 3, 4};
        System.out.println("sum of array ints is " + sumArray(arr));
    }
    public static int sumArray(int[] arr1) {
//        int i = 0;
        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            sum += arr1[i];
//        }
        for (int i: arr1) {
            sum += arr1[i];
        }
        return sum;
    }
}


//    Let's create a method that returns the sum of all integers in an int array (nums)
