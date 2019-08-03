package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Monk is standing at the door of his classroom. There are currently N students in the class, i'th student got Ai candies.
 * There are still M more students to come. At every instant, a student enters the class and wishes to be seated with a student who has exactly the same number of candies. For each student, Monk shouts YES if such a student is found, NO otherwise.
 * <p>
 * Input:
 * First line contains an integer T. T test cases follow.
 * First line of each case contains two space-separated integers N and M.
 * Second line contains N + M space-separated integers, the candies of the students.
 * <p>
 * Output:
 * For each test case, output M new line, Monk's answer to the M students.
 * Print "YES" (without the quotes) or "NO" (without the quotes) pertaining to the Monk's answer.
 * <p>
 * Constraints:
 * 1 ≤ T ≤ 10
 * 1 ≤ N, M ≤ 105
 * 0 ≤ Ai ≤ 1012
 */
public class MonkAndHisFriends {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long n = fr.nextLong();
            long m = fr.nextLong();

            Node root = new Node(fr.nextLong());
            for (int i = 0; i < n - 1; i++) {
                root = addNode(root, fr.nextLong());
            }

            for (int i = 0; i < m; i++) {
                long newStudent = fr.nextLong();
                if (checkIfNodePresent(root, newStudent)) {
                    System.out.println("YES");
                } else {
                    root = addNode(root, newStudent);
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean checkIfNodePresent(Node root, long nextInt) {
        if (root == null) {
            return false;
        } else if (root.getId() == nextInt) {
            return true;
        } else if (root.getId() > nextInt) {
            return checkIfNodePresent(root.getLeft(), nextInt);
        } else {
            return checkIfNodePresent(root.getRight(), nextInt);
        }
    }

    private static Node addNode(Node node, long nextInt) {
        if (node == null) {
            node = new Node(nextInt);
            return node;
        }
        if (node.getId() > nextInt) {
            node.setLeft(addNode(node.getLeft(), nextInt));
        } else if (node.getId() < nextInt) {
            node.setRight(addNode(node.getRight(), nextInt));
        }
        return node;
    }

    static private class Node {
        private long id;
        private Node right;
        private Node left;

        private Node(long id) {
            this.id = id;
        }

        private long getId() {
            return id;
        }

        private void setId(long id) {
            this.id = id;
        }

        private Node getRight() {
            return right;
        }

        private void setRight(Node right) {
            this.right = right;
        }

        private Node getLeft() {
            return left;
        }

        private void setLeft(Node left) {
            this.left = left;
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
