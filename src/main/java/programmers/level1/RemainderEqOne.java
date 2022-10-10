package programmers.level1;

public class RemainderEqOne {
    public int solution(int n) {
        int answer = 0;
        int temp = n - 1;
        for (int i = 2; i <= n-1; i++) {
            if (temp % i == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
