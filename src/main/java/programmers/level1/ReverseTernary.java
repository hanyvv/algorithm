package programmers.level1;

public class ReverseTernary {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        String[] str = sb.reverse().toString().split("");

        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]) * (int) Math.pow(3, i);
            answer += num;
        }


        return answer;
    }
}
