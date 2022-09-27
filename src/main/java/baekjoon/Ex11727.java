package baekjoon;

import java.util.Scanner;

public class Ex11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dy = new int[1_001];

        dy[1] = 1;
        dy[2] = 3;

        for (int i = 3; i <= n; i++) {
            dy[i] = (dy[i - 1] + 2 * dy[i - 2]) % 10_007;
        }

        System.out.println(dy[n]);
    }
}
