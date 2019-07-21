package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Given a List of Distinct N number a1,a2,a3........an.
 * Find The Position Of Number K In The Given List.
 * <p>
 * Input Format
 * <p>
 * First Line Take Input Value Of N
 * <p>
 * Second Line Take Input N Space Separated Integer Value
 * <p>
 * Third Line Take Input Value Of K
 * <p>
 * Output Format
 * <p>
 * Position Of K In The Given List
 * <p>
 * Constraints
 * <p>
 * 0 < N < 100001
 * 0 < ai < 1010
 * 0 < K < 1010
 * NOTE:
 * Array Indexing Starts From 0
 */
public class SimpleSearch {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fr.nextInt();
        }
        int k = fr.nextInt();
        System.out.println(getPosInArr(arr, k));
    }

    private static int getPosInArr(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    static class FastReader {
        private final BufferedReader br;
        private StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() throws IOException {
            return br.readLine();
        }
    }
}
