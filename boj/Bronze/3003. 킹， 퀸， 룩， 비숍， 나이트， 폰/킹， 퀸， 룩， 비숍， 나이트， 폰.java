import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();
            switch (i) {
                case 0:
                case 1:
                    System.out.print(1 - n + " ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(2 - n + " ");
                    break;
                case 5:
                    System.out.print(8 - n + " ");
                    break;
            }
        }
    }
}
