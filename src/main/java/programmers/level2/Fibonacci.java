package programmers.level2;

public class Fibonacci {

    private static final int NUMBER = 1234567;

    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = ((arr[i - 1] % NUMBER)+ (arr[i - 2] % NUMBER)) % NUMBER;
        }

        answer = arr[n];

        return answer;
    }
}
