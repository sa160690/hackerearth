package com.hackerearth.solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Polygon Possibility
 * <p>
 * You are given length of n sides, you need to answer whether it is possible to make n sided convex polygon with it.
 * <p>
 * Input : -
 * <p>
 * First line contains T ,no .of testcases.
 * <p>
 * For each test case , first line consist of single integer N,second line consist of N(l1, l2, l3, ...ln) spaced integers, size of each side.
 * <p>
 * Output : -
 * <p>
 * For each test case print "Yes" if it is possible to make polygon or else "No" if it is not possible.
 * <p>
 * 1 <= T <= 10
 * 1 <= N <= 10^5
 * 1 <= li <= 10^4
 */
public class ProblemOne {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            int numberOfSides = Integer.parseInt(br.readLine());
            int[] sideLengths = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long sideSum = Arrays.stream(sideLengths).sum();
            boolean isNotPolygon = Arrays.stream(sideLengths).filter(sideLength -> {
                return (sideSum - sideLength) <= sideLength;
            }).findFirst().isPresent();

            if (isNotPolygon) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
