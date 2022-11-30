import java.util.Scanner;

public class Reverse {
    static int getRevNumber(int x) {
        int rev = 0;
        while (x > 0) {
            int remainder = x % 10;
            rev = rev * 10 + remainder;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("Enter the Number : ");
        num1 = scanner.nextInt();

        System.out.println("Reverse Number is : " + getRevNumber(num1));
    }
}