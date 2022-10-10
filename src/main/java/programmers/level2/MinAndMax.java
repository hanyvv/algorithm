package programmers.level2;

import java.util.Arrays;

public class MinAndMax {

    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        StringBuilder sb = new StringBuilder();

        sb.append(Arrays.stream(numbers).min().getAsInt()).append(" ")
                .append(Arrays.stream(numbers).max().getAsInt());

        return sb.toString();
    }
}
