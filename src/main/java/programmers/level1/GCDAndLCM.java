package programmers.level1;

public class GCDAndLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = getLCM(n, m);
        return answer;
    }

    public int getGCD(int n, int m) {
        int min = Math.min(n, m);
        for (int i = min; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int getLCM(int n, int m) {
        int min = Math.min(n, m);
        int max = Math.max(n, m);

        int result = 0;
        int i = 1;
        while (true) {
            result = max * i++;
            if (result % min == 0) {
                break;
            }
        }
        return result;
    }


}
