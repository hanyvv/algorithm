package baekjoon;


import java.util.Scanner;

public class Ex1463 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {3,2};
        int[] dy = new int[(int)Math.pow(10, 6) + 1];

        dy[1] = 0;
        dy[2] = 1;
        dy[3] = 1;

        for (int i = 4; i <= n; i++) {
            dy[i]= dy[i - 1] + 1;
            for (int j = 0; j < arr.length; j++) {
                if (i % arr[j] == 0) {
                    dy[i] = Math.min(dy[i], dy[i / arr[j]] + 1);
                }
            }
        }
        System.out.println(dy[n]);
    }
}
