package coursera;

import java.util.Scanner;

public class QuickUnion {
    private int[] id;

    //public constructor
    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    //method checks if p and q are interconnected
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayElements = scanner.nextInt();
        QuickUnion qu = new QuickUnion(arrayElements);
    }
}
