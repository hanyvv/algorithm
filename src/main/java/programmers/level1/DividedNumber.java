package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DividedNumber {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            if (x % divisor == 0) {
                list.add(x);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
            return list;
        }
        Collections.sort(list);
        return list;
    }
}
