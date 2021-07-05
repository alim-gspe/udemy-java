package exercise;

public class EqualSumChecker {
    public static boolean hasEqualSum(int paramsOne, int paramsTwo, int paramsThree) {
        if ((paramsOne + paramsTwo) == paramsThree) {
            return true;
        }
        return false;
    }
}
