package programmers.level1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int x : d) {
            if (x > budget) {
                break;
            }

            budget -= x;
            answer++;
        }
        return answer;
    }
}
