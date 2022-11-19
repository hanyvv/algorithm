package programmers.level1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PickAndAdd {
    public List<Integer> solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();

        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            int temp = 0;
            for (int j = i + 1; j < length; j++) {
                temp = numbers[i] + numbers[j];
                answer.add(temp);
            }
        }

        return answer.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
