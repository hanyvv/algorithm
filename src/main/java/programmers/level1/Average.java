package programmers.level1;

import java.util.Arrays;

public class Average {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
