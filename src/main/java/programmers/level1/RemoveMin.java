package programmers.level1;

import java.util.Arrays;

public class RemoveMin {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = new int[arr.length - 1];

        int i = 0;
        for (int x : arr) {
            if (x != min) {
                answer[i++] = x;
            }
        }
        return answer;
    }
}
