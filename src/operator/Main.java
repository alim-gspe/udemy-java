package operator;

public class Main {
    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double total = (num1 + num2)*100.00d;
        double remain = total % 40.00d;
        boolean result = (remain == 0) ? true : false;

        if (!result) {
            System.out.println("Got some remainder");
        }
    }
}
