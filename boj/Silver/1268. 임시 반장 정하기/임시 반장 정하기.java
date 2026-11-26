import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] student = new int[n][5];
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                student[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (student[i][k] == student[j][k]) {
                        count[i]++;
                        count[j]++;
                        break;
                    }
                }
            }
        }

        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < n; i ++) {
            if (max < count[i]) {
                max = count[i];
                maxIdx = i;
            }
        }
        System.out.println(maxIdx + 1);
    }
}
