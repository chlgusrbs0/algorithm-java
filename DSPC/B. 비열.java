import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] Q = new int[t];

        for (int i = 0; i < t; i++) {
            int c = 0;
            String metal = sc.next();
            int m = sc.nextInt();
            int T1 = sc.nextInt();
            int T2 = sc.nextInt();

            switch (metal) {
                case "AL":
                    c = 900;
                    break;
                case "FE":
                    c = 450;
                    break;
                case "CU":
                    c = 385;
                    break;
            }
            Q[i] = m * c * (T2 - T1);
        }

        int max = 0;
        for (int i = 0; i < t; i++) {
            if (Q[max] < Q[i]) {
                max = i;
            }
        }
        System.out.printf("%d %d", max + 1, Q[max]);
    }
}