package programmers.level1;

public class ReverseArray {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int size = str.length();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = str.charAt(size - i - 1) - '0';
        }

        return answer;
    }
}
