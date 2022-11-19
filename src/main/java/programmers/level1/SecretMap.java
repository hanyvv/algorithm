package programmers.level1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s = Integer.toBinaryString(arr1[i]);
            StringBuilder sb = new StringBuilder();
            String s2 = Integer.toBinaryString(arr2[i]);
            StringBuilder sb2 = new StringBuilder();
            sb.append(s);
            sb2.append(s2);

            insertZero(n, s, sb);
            insertZero(n, s2, sb2);

            answer[i] = getMap(n, sb, sb2);
        }
        return answer;
    }

    private String getMap(int n, StringBuilder sb, StringBuilder sb2) {
        StringBuilder map = new StringBuilder();
        for (int j = 0; j < n; j++) {
            if ((sb.toString().charAt(j) == '1' || sb2.toString().charAt(j) == '1')) {
                map.append("#");
            } else {
                map.append(" ");
            }
        }
        return map.toString();
    }

    private void insertZero(int n, String s, StringBuilder sb) {
        if (s.length() < n) {
            for (int j = 0; j < n - s.length(); j++) {
                sb.insert(0, "0");
            }
        }
    }

    public static void main(String[] args) {
        SecretMap sc = new SecretMap();

        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] solution = sc.solution(5, arr1, arr2);

        for (String s : solution) {
            System.out.println(s);
        }
    }
}
