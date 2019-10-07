package adapter;

 abstract public class GenericFinder {
    protected abstract boolean Helper1(int x);

    protected abstract boolean Helper2(int xnew, int xcur);

    public int find(int[] A, int N) {
        int res = -1;
        for (int i = 0; i < N; i++) {
            if (this.Helper1(A[i])) {
                if (res == -1) res = i;
                else if (this.Helper2(A[i], A[res])) res = i;
            }
        }
        return res;
    }

     public static int findA(int[] A, int N) {
        int res = -1;
        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                if (res == -1) res = i;
                else if (A[i] > A[res]) res = i;
            }
        }
        return res;
    }

     public static int findB(int[] A, int N) {
        int res = -1;
        for (int i = 0; i < N; i++) {
            if (A[i] / 2 == 1) {
                if (res == -1) res = i;
                else if (A[i] <= A[res]) res = i;
            }
        }
        return res;
    }
}

