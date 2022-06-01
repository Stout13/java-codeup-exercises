package WarmUps;

public class YearsToDays {
    public static void main(String[] args) {

    }
    public static double YearsToDays(double years) {
        double nonLeapYearOuterYears = years%4 + 1;
        double leapYears = Math.floor((years - nonLeapYearOuterYears)/4);
        return leapYears*364 + (years-leapYears) * 365;
    }

//    Create a function that takes the age in years and returns the age in days.
//    example input: 65
//    expected output: 23725

}
