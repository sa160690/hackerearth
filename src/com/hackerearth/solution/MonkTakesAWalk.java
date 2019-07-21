package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Today, Monk went for a walk in a garden. There are many trees in the garden and each tree has an English alphabet on it. While Monk was walking, he noticed that all trees with vowels on it are not in good state. He decided to take care of them. So, he asked you to tell him the count of such trees in the garden.
 * Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.
 * <p>
 * Input:
 * The first line consists of an integer T denoting the number of test cases.
 * Each test case consists of only one string, each character of string denoting the alphabet (may be lowercase or uppercase) on a tree in the garden.
 * <p>
 * Output:
 * For each test case, print the count in a new line.
 * <p>
 * Constraints:
 * 1 <= T <=10
 * 1<= length of String <=10^5
 */
public class MonkTakesAWalk {

    private static Set<Character> badTrees = new HashSet<>();

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        badTrees.addAll(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        int t = fr.nextInt();
        while (t-- > 0) {
            int count = 0;
            String treeString = fr.next();
            for (int i = 0; i < treeString.length(); i++) {
                if (isBadState(treeString.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isBadState(char treeChar) {
        return badTrees.contains(treeChar);
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
