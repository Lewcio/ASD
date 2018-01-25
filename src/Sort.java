public class Sort {
    public static void selectionSort(int tab[], int n) {
        int min, tmp;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < tab[min])
                    min = j;
            }
            if (min != i) {
                tmp = tab[i];
                tab[i] = tab[min];
                tab[min] = tmp;
            }
        }
    }
    public static int[] countingSort(int[] tab, int n) {
        int k = max(tab, n) + 1;
        int tmp[] = new int[k], result[] = new int[n];
        for (int i = 0; i < n; i++)
            tmp[tab[i]]++;
        for (int i = 1; i < k; i++)
            tmp[i] = tmp[i] + tmp[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            result[tmp[tab[i]] - 1] = tab[i];
            tmp[tab[i]]--;
        }
        return result;
    }
    public static int max(int tab[], int n) {
        int max = tab[0];
        for (int i = 1; i < n; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }
    public static int split(int tab[], int n) {
        int l = 1, r = n - 1, m = 0, tmp;
        while (l < r) {
            if (r >= 0 && tab[r] > tab[m]) r--;
            else if (l < r && tab[l] < tab[m]) l++;
            else if (l < r) {
                tmp = tab[l];
                tab[l] = tab[r];
                tab[r] = tmp;
                r--;
                l++;
            }
        }
//        tmp = tab[m];
//        tab[m] = tab[r];
//        tab[r] = tmp;
        return m;
    }
    public static int partition(int tab[], int n) {
        int l = -1, r = 0, m = n - 1, tmp;
        while (r < m) {
            if (tab[r] < tab[m]) {
                tmp = tab[l + 1];
                tab[l + 1] = tab[r];
                tab[r] = tmp;
                l++;
            }
        }
        tmp = tab[m];
        tab[m] = tab[l + 1];
        tab[l + 1] = tmp;
        return m;
    }
}
