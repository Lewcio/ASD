package com.company;

public class Sort {
    public static int[] selectionSort(int tab[], int n) {
        int min, tmp;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < tab[min]) {
                    min = j;
                }
            }
            if (min != i) {
                tmp = tab[i];
                tab[i] = tab[min];
                tab[min] = tmp;
            }
        }
        return tab;
    }
}
