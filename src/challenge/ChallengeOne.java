package challenge;

public class ChallengeOne {
    public static void main(String[] args) {

        System.out.println(getDurationString(61, 0));
    }

    public static String getDurationString(int minutes, int seconds) {
        String result = "";
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int remainMinutes = minutes % 60;
            result = hours + "h " + remainMinutes + "m " + seconds + "s";
        } else {
            result = "Invalid value";
        }
        return result;
    }

    public static String getDurationString(int seconds) {
        String result = "";
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainSeconds = seconds % 60;
            result = getDurationString(minutes, remainSeconds);
        } else {
            result = "Invalid value";
        }
        return result;
    }
}
