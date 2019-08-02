package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * A new deadly virus has infected large population of a planet. A brilliant scientist has discovered a new strain of virus which can cure this disease. Vaccine produced from this virus has various strength depending on midichlorians count. A person is cured only if midichlorians count in vaccine batch is more than midichlorians count of person. A doctor receives a new set of report which contains midichlorians count of each infected patient, Practo stores all vaccine doctor has and their midichlorians count. You need to determine if doctor can save all patients with the vaccines he has. The number of vaccines and patients are equal.
 * <p>
 * Input Format
 * <p>
 * First line contains the number of vaccines - N. Second line contains N integers, which are strength of vaccines. Third line contains N integers, which are midichlorians count of patients.
 * <p>
 * Output Format
 * <p>
 * Print a single line containing  or .
 * <p>
 * Input Constraint
 * <p>
 * <p>
 * Strength of vaccines and midichlorians count of patients fit in integer.
 * <p>
 * Problem Setter: Practo Tech Team
 */
public class SavePatients {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] vaccine = new int[n];
        int[] patient = new int[n];
        for (int i = 0; i < n; i++) {
            vaccine[i] = fr.nextInt();
        }
        for (int i = 0; i < n; i++) {
            patient[i] = fr.nextInt();
        }
        Arrays.sort(patient);
        Arrays.sort(vaccine);
        System.out.println(checkSavePatients(patient, vaccine));
    }

    private static String checkSavePatients(int[] patient, int[] vaccine) {
        for (int i = 0; i < patient.length; i++) {
            if (patient[i] > vaccine[i]) {
                return "No";
            }
        }
        return "Yes";
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
