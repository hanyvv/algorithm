package programmers.level1;


public class NumberStringAndWords {
    public int solution(String s) {
        String[] str = {"zero", "one", "two", "three",
                "four", "five", "six",
                "seven", "eight", "nine"};
        int answer = 0;

        for (int i = 0; i < str.length; i++) {
            if (s.contains(str[i])) {
               s = s.replaceAll(str[i], String.valueOf(i));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
