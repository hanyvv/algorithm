package programmers.level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {
    public List<String> solution(String[] strings, int n) {

       return Arrays.stream(strings).sorted((o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return o1.charAt(n) - o2.charAt(n);
        }).collect(Collectors.toList());
    }
}
