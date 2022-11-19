package programmers.level1;

public class ThreeMusketeers {
    public int solution(int[] number) {
        int answer = 0;

        int length = number.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    answer = countIfSumEqZero(number, answer, i, j, k);
                }
            }
        }
        return answer;
    }

    private int countIfSumEqZero(int[] number, int answer, int i, int j, int k) {
        if (number[i] + number[j] + number[k] == 0) {
            answer++;
        }
        return answer;
    }
}
