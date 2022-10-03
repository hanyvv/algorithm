package programmers.level1;

public class SortDesc {
    public long solution(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int[] arr = new int[10];

        for (char c : charArray) {
            arr[c - '0']++;
        }

        long result = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < arr[i]; j++) {
                result = result * 10 + i;
            }
        }
        return result;
    }
}
