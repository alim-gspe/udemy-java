package exercise;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int checkOne = (int) (numOne * 1000);
        int checkTwo = (int) (numTwo * 1000);
        if (checkOne - checkTwo == 0) {
            return true;
        }
        return false;
    }
}
