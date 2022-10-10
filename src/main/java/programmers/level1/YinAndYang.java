package programmers.level1;

public class YinAndYang {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
                continue;
            }
            sum -= absolutes[i];
        }
        return sum;
    }
}
