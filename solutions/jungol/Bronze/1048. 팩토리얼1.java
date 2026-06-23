import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fac = String.valueOf(fac(sc.nextInt()));
        int count = 0;
        for (int i = fac.length(); i > 0; i--) {
            if (fac.charAt(i - 1) == '0') {
                count++;
            }
            else {
                break;
            }
        }

        System.out.println(count);

    }
    static long fac(long num) {
        if (num == 1) {
            return 1;
        }
        return num * fac(num - 1);
    }
}