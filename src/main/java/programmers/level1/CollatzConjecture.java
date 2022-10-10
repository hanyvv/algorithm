package programmers.level1;

public class CollatzConjecture {
    public int solution(long num) {
        for (int i = 0; i <= 500; i++) {
            if (num == 1) {
                return i;
            }
            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
            num = num * 3 + 1;
        }
        return -1;
    }
}
