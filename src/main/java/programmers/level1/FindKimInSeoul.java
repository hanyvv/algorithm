package programmers.level1;


public class FindKimInSeoul {
    public String solution(String[] seoul) {
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }

       return String.format("김서방은 %d에 있다", index);
    }
}
