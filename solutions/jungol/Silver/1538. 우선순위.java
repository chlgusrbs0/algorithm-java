import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int front = 0;
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        while(front < n) {
            boolean check = false;
            for (int i = front + 1; i < n; i++) {
                if (list[front] < list[i]) {
                    check = true;
                    break;
                }
            }

            if (check) {
                if (m == front) {
                    m = n - 1;
                }
                else {
                    m--;
                }
                int temp = list[front];
                for (int j = front; j < n - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[n - 1] = temp;
            }
            else {
                if (front == m) {
                    System.out.println(front + 1);
                    break;
                }
                front++;
            }
        }
    }
}