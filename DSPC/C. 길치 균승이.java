import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        do {
            String direction = sc.next();
            int distance = sc.nextInt();

            switch (direction) {
                case ("R"):
                    x += distance;
                    break;
                case ("L"):
                    x -= distance;
                    break;
                case ("U"):
                    y += distance;
                    break;
                case ("D"):
                    y -= distance;
                    break;
            }
        } while(sc.hasNext());

        System.out.printf("%.1f", Math.abs(x * (double)y / 2));
    }
}