package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Given an array A of N integers, classify it as being Good Bad or Average. It is called Good, if it contains exactly X distinct integers, Bad if it contains less than X distinct integers and Average if it contains more than X distinct integers.
 * <p>
 * Input format:
 * First line consists of a single integer T denoting the number of test cases.
 * First line of each test case consists of two space separated integers denoting N and X.
 * Second line of each test case consists of N space separated integers denoting the array elements.
 * <p>
 * Output format:
 * Print the required answer for each test case on a new line.
 * <p>
 * Constraints:
 * 1<=T<=50
 * 1<=X,N<=13000
 * 1<=A[i]<=10^9
 */
public class DistinctCount {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int x = fr.nextInt();

            Set<Integer> memSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                memSet.add(fr.nextInt());
            }
            if (memSet.size() == x) {
                System.out.println("Good");
            } else if (memSet.size() < x) {
                System.out.println("Bad");
            } else {
                System.out.println("Average");
            }
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
