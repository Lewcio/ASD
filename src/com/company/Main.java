package com.company;

public class Main {
    public static int binarySearch(int tab[], int n, int f) {
        int l = 0, r = n - 1, m = 0;
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
        int[] tab = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println(binarySearch(tab, tab.length, 9));
    }
}