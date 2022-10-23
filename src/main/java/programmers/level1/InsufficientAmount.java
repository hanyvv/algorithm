package programmers.level1;

public class InsufficientAmount {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }

        long answer = sum - money;
        return answer > 0 ? answer : 0;
    }
}
