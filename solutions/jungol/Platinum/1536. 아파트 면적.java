import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] isComposite = new boolean[65536];
        for (int i = 3; i <= 256; i++) {
            if (isComposite[i]) {
                continue;
            }
            for (int j = i * i; j <= 65535; j += i) {
                isComposite[j] = true;
            }
        }

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int prev = -1;
        boolean prevValid = false;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == prev) {
                if (!prevValid) {
                    count++;
                }
                continue;
            }

            boolean isValid = false;
            long value = 2L * input + 1;


            for (int j = 3; j <= 65535; j++) {
                if ((long)j * j > value) {
                    break;
                }
                if (!isComposite[j] && ((value) % j == 0)) {
                    isValid = true;
                    break;

                }
            }

            prev = input;
            prevValid = isValid;
            if (!isValid) {
                count++;
            }
        }
        System.out.println(count);
    }
}