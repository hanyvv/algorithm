package programmers.level1;

import java.util.Arrays;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];

            int[] arr = new int[j - i + 1];
            int index = 0;
            for (int l = i - 1; l < j; l++) {
                arr[index++] = array[l];
            }
            Arrays.sort(arr);
            answer[a] = arr[k - 1];
        }
        return answer;
    }
}
