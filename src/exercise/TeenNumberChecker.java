package exercise;

public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if ((ageOne <= 19 && ageOne >= 13) || (ageTwo <= 19 && ageTwo >= 13) || (ageThree <= 19 && ageThree >= 13)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int teen) {
        if (teen >= 13 && teen <= 19) {
            return true;
        }
        return false;
    }
}
