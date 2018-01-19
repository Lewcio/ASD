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
        int tab4[] = {3, 2, 4, 5, 1, 1, 3, 2, 5, 6, 2, 3, 1};
        System.out.println(binarySearch(tab1, tab1.length, 9));
        Sort.selectionSort(tab1, tab1.length);
        Sort.split(tab2, tab2.length);
//        Sort.partition(tab3, tab3.length); nie działą
//        Sort.countingSort(tab4, tab4.length);

        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(tab3));
        System.out.println(Arrays.toString(Sort.countingSort(tab4, tab4.length)));

        // Lista
        DoubleLinkedList list = new DoubleLinkedList();
//        list.push("blaze", "e1");
//        list.push("it", "e2");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.retrive(i).getElement());
//        }

        // BST
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        bst.insert(6);
        bst.inOrder();
    }
}