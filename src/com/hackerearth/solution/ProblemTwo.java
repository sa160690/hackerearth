package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Can you solve it ?
 * Raman loves Mathematics a lot. One day his maths teacher gave him an interesting problem.
 * <p>
 * He was given an array 'A' consisting of 'n' integers, he was needed to find the maximum value of the following expression:
 * <p>
 * |Ai - Aj| + |i - j|
 * where, 0<= i,j <n and Ai, Aj are the Array elements.
 * <p>
 * Input:
 * <p>
 * First line of input contains an integer T denoting number of test cases.
 * Each test case contains two lines, first line contains integer n where n is the number of elements in array
 * Second line contains n space separated integers Ai.
 * Output:
 * <p>
 * Print the maximum value of the above give expression, for each test case separated in a new line.
 * <p>
 * Constraints:
 * <p>
 * 1<=T<=100
 * 1<=n<=105
 * 0<=Ai<=105
 * Note: Use Fast I/O (scanf/printf or any other ways) to handle large test files.
 */
public class ProblemTwo {
    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fr.nextInt();
            }
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int expressiionVal = Math.abs(arr[i] - arr[j]) + Math.abs(i - j);
                    if (expressiionVal > maxValue) {
                        maxValue = expressiionVal;
                    }
                }
            }
            System.out.println(maxValue);
        }
    }

    static class FastReader {
        private BufferedReader br;
        private StringTokenizer st;

        public FastReader() {
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }
    }
}
