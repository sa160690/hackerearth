package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * You are given an array of n integer numbers , , .. ,. Calculate the number of pair of indices  such that  <  and  xor
 * <p>
 * Input format
 * - First line: n denoting the number of array elements
 * - Second line: n space separated integers , , .. ,.
 * <p>
 * Output format
 * Output the required number of pairs.
 * <p>
 * Constraints
 */
public class ShubhamAndXOR {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = fr.nextInt();
        }
        Arrays.sort(elements);
        long temp = 1;
        long result = 0;
        for (int i = 1; i < n; i++) {
            if ((elements[i] ^ elements[i - 1]) == 0) {
                result = result + temp;
                temp++;
            } else {
                temp = 1;
            }
        }
        System.out.println(result);
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
