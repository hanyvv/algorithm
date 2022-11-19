package programmers.level1;

public class MinRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;
        int h = 0;
        int w = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            h = Math.max(h, sizes[i][0]);
            w = Math.max(w, sizes[i][1]);
        }

        answer = h * w;
        return answer;
    }
}
