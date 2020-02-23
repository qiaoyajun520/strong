package com.review.test;

import java.util.Scanner;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created in 10:05 on 2019/3/20.
 */
public class Main {
    public static void main(String[] args) {
        int n, h;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        String[] nh = sc.nextLine().split(" ");
        n = Integer.parseInt(nh[0]);
        h = Integer.parseInt(nh[1]);
        int wallPoints[] = new int[n];
        String[] inputWallPoints = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            wallPoints[i] = Integer.parseInt(inputWallPoints[i]);
        }
        int wallLengths[] = new int[n];
        String[] inputwallLengths = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            wallLengths[i] = Integer.parseInt(inputwallLengths[i]);
        }
        int naxPoint = wallPoints[0];
        for (int i = 1; i < n; i++) {
            if (wallPoints[i] >= naxPoint) {
                naxPoint = wallPoints[i];
            }
        }
        if (naxPoint > h) {
            m = naxPoint - h;
        }
        sc.close();
        System.out.print(m);
    }
}


