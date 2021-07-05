package method;

public class ChellengeMethod {
    public static void main(String[] args) {
        displayHighScorePosition("budi", calculateHighScorePosition(1500));
        displayHighScorePosition("agus", calculateHighScorePosition(900));
        displayHighScorePosition("ayu", calculateHighScorePosition(400));
        displayHighScorePosition("adi", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
