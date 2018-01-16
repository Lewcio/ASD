package com.company;

import java.util.Arrays;

public class Main {
    public static int binarySearch(int tab[], int n, int f) {
        int l = 0, r = n - 1, m;
        while (r - l > 0) {
            m = (l + r) / 2;
            if (tab[m] >= f)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
    public static void main(String[] args) {
        int tab1[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int tab2[] = {3, 9, 11, 4, 1, 20, 15};
        int tab3[] = {15, 13, 11, 9, 7, 5, 3, 1};
        System.out.println(binarySearch(tab1, tab1.length, 9));
        System.out.println(Arrays.toString(Sort.selectionSort(tab2, tab2.length)));
    }
}