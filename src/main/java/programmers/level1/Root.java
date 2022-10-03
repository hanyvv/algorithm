package programmers.level1;

public class Root {
    public long solution(long n) {
        double result = Math.sqrt(n);
        double temp = Math.pow(Math.floor(result), 2);

        if (n == temp) {
        return (long) Math.pow(result + 1, 2);
        }

        return -1L;
    }
}
