package util;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        double min = Integer.MIN_VALUE;
        double max = Integer.MAX_VALUE;
    }
    public Input() {
        Scanner scanner = new Scanner(System.in);
    }
    public String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        String YN = scanner.nextLine();
        return Objects.equals(YN, "Y") || Objects.equals(YN, "y") || Objects.equals(YN, "yes") || Objects.equals(YN, "Yes");
    }
    public double getInt(double intMin, double intMax) {
        Scanner scanner = new Scanner(System.in);
        double intgr = scanner.nextDouble();
        if (intgr > intMin || intgr < intMax) {
            getInt(intMin, intMax);
        }
        return intgr;
    }
    public double getInt() {
        Scanner scanner = new Scanner(System.in);
        double intgr = scanner.nextDouble();
        if (intgr > Integer.MAX_VALUE || intgr < Integer.MIN_VALUE) {
            System.out.println("That number is not in the range of an integer, it is too big or too small, " +
                    "use getDouble, or enter an integer");
            getInt();
        }
        return intgr;
    }
    public long getDouble(long doubleMin, long doubleMax) {
        Scanner scanner = new Scanner(System.in);
        long intgr = scanner.nextLong();
        if (intgr > doubleMax || intgr < doubleMin) {
            System.out.println("That number is not in the range of an integer, it is too big or too small, " +
                    "use getDouble, or enter an integer");
            getDouble(doubleMin, doubleMax);
        }
        return intgr;
    }
    public double getDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}