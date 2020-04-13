package coursera;

import java.util.Scanner;

public class QuickUnionWeighted {

    private int[] id;
    private int[] sz;

    //public constructor
    public QuickUnionWeighted(int N) {
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
        if (i == j) {
            return;
        }
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayElements = scanner.nextInt();
        coursera.QuickUnion qu = new coursera.QuickUnion(arrayElements);
    }
}

}
