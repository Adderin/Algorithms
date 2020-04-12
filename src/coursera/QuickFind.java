package coursera;

import java.util.Scanner;

public class QuickFind {
    private int[] id;

    //public constructor
    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    //method check if p and q are interconnected
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    //method to perform union
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayElements = scanner.nextInt();
        QuickFind qf = new QuickFind(arrayElements);

    }
}
