package challenge;

public class SwitchStatement {
    public static void main(String[] args) {
        char value = 'F';
        switch (value) {
            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C': case 'D': case 'E':
                System.out.println(value);
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
