import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            int reversed = 0;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;

                reversed = reversed * 10 + digit;
                sum += digit;

                num /= 10;
            }

            System.out.println(reversed + " " + sum);
        }
    }
}