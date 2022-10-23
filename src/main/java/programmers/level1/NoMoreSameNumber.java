package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoMoreSameNumber {
    public List<Integer> solution(int []arr) {
        List<Integer> list = new ArrayList<>();

        for (int x : arr) {
            if (!list.contains(x)) {
                list.add(x);
            } else {
                if (list.size() - 1 != list.lastIndexOf(x)) {
                    list.add(x);
                }
            }
        }
        return list;
    }
}
