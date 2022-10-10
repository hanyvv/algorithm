package programmers.level1;

public class SumBetweenTwoInt {
    public long solution(int a, int b) {
        long answer = 0;
        answer = (long) (Math.abs(b - a) + 1) * (a + b) / 2 ;
        return answer;
    }
}
