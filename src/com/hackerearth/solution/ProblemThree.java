package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Pair Sums
 * You have been given an integer array A and a number K. Now, you need to find out whether any two different elements of the array A sum to the number K. Two elements are considered to be different if they lie at different positions in the array. If there exists such a pair of numbers, print "YES" (without quotes), else print "NO" without quotes.
 * <p>
 * Input Format:
 * <p>
 * The first line consists of two integers N, denoting the size of array A and K. The next line consists of N space separated integers denoting the elements of the array A.
 * <p>
 * Output Format:
 * <p>
 * Print the required answer on a single line.
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 1≤N≤10^6
 * <p>
 * <p>
 * 1≤K≤2∗10^6
 * <p>
 * <p>
 * 1≤A[i]≤10^6
 */
public class ProblemThree {
    public static void main(String[] args) {
        if (isPairSumPresent()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPairSumPresent() {
        FastReader fr = new FastReader();
        int noOfElements = fr.nextInt();
        int sumOfElements = fr.nextInt();
        int[] elements = new int[noOfElements];
        boolean isFound = false;
        Map<Integer, Integer> elementMap = new HashMap<>();
        for (int i = 0; i < noOfElements; i++) {
            elements[i] = fr.nextInt();
            elementMap.put(elements[i], i);
        }

        for (int i = 0; i < noOfElements; i++) {
            Integer tempNumber = elementMap.get(sumOfElements - elements[i]);
            if (tempNumber != null && tempNumber != i) {
                return true;
            }
        }
        return false;
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
