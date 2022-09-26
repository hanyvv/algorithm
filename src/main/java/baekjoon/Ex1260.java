package baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1260 {
    static int[] ch;
    static int[][] graph;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int v = sc.nextInt();

        ch = new int[n + 1];
        graph = new int[n + 1][n + 1];

        setGraph(sc);

        sb.append(v + " ");
        ch[v] = 1;
        dfs(v);
        System.out.println(sb.toString().trim());
        Arrays.fill(ch, 0);
        ch[v] = 1;
        System.out.println(v + " " + bfs(v));
    }

    private static void setGraph(Scanner sc) {
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
    }

    private static void dfs(int v) {
        for (int i = 1; i <= n; i++) {
            findNode(v, i);
        }
    }

    private static void findNode(int v, int i) {
        if (graph[v][i] == 1 && ch[i] == 0) {
            sb.append(i).append(" ");
            ch[i] = 1;
            dfs(i);
        }
    }

    private static String bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder builder = new StringBuilder();

        queue.offer(v);

        while (!queue.isEmpty()) {
            forEachQueue(queue, builder);

        }
        return builder.toString().trim();
    }

    private static void forEachQueue(Queue<Integer> queue, StringBuilder builder) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            searchGraph(queue, builder);
        }
    }

    private static void searchGraph(Queue<Integer> queue, StringBuilder builder) {
        int val = queue.poll();
        for (int j = 1; j <= n; j++) {
            findNode(queue, builder, val, j);
        }
    }

    private static void findNode(Queue<Integer> queue, StringBuilder builder, int val, int j) {
        if (graph[val][j] == 1 && ch[j] == 0) {
            builder.append(j + " ");
            ch[j] = 1;
            queue.offer(j);
        }
    }
}
