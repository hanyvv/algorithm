package programmers.level1;

import java.util.Arrays;

public class StringSortDesc {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuffer(new String(chars)).reverse().toString();
    }
}
