package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n - 1];
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(arr, mid) >= c) {
                lt = mid + 1;
                answer = Math.max(answer, mid);
            }
            else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }

    public static int count(int[] arr, int dis) {
        int count = 1;
        int first = arr[0];
        for (int x : arr) {
            if (x - first >= dis) {
                count++;
                first = x;
            }
        }

        return count;
    }
}
