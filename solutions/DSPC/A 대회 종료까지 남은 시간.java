import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();
        int end = sc.nextInt() * 3600 + sc.nextInt() * 60 + sc.nextInt();

        if (start > end) {
            end += 24 * 3600;
        }

        System.out.printf("%d %d %d",
                (end - start) / 3600,
                ((end - start) % 3600) / 60,
                ((end - start) % 60));
    }
}
