package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Coders here is a simple task for you, you have given an array of size N and an integer M.
 * Your task is to calculate the difference between maximum sum and minimum sum of N-M elements of the given array.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * 1<=t<=10
 * 1<=n<=1000
 * 1<=a[i]<=1000
 * <p>
 * <p>
 * Input:
 * First line contains an integer T denoting the number of testcases.
 * First line of every testcase contains two integer N and M.
 * Next line contains N space separated integers denoting the elements of array
 * Output:
 * For every test case print your answer in new line
 */
public class EasyGoing {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int m = fr.nextInt();

            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                numbers.add(fr.nextInt());
            }
            Collections.sort(numbers);
            int sumMinimum = 0;
            int sumMaximum = 0;
            for (int i = 0, k = numbers.size(); i < m; i++) {
                sumMinimum = sumMinimum + numbers.get(i);
                sumMaximum = sumMaximum + numbers.get(k - 1);
                k--;
            }
            System.out.println(sumMaximum - sumMinimum);
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
