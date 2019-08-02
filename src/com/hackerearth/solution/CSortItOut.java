package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * You are given an array A of non-negative integers of size m. Your task is to sort the array in non-decreasing order and print out the original indices of the new sorted array.
 * <p>
 * Example:
 * <p>
 * A={4,5,3,7,1}
 * <p>
 * After sorting the new array becomes A={1,3,4,5,7}.
 * <p>
 * The required output should be "4 2 0 1 3"
 * <p>
 * INPUT :
 * <p>
 * The first line of input consists of the size of the array
 * <p>
 * The next line consists of the array of size m
 * <p>
 * OUTPUT :
 * <p>
 * Output consists of a single line of integers
 * <p>
 * CONSTRAINTS:
 * <p>
 * 1<=m<=106
 * <p>
 * 0<=A[i]<=106
 * <p>
 * NOTE: The indexing of the array starts with 0.
 */
public class CSortItOut {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int m = fr.nextInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = fr.nextInt();
            arr[i][1] = i;
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i][1] + " ");
        }
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
