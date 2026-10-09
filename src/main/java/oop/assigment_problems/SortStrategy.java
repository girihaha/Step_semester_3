package oop.assigment_problems;

import java.util.Arrays;

interface Sorter {
    void sort(int[] arr);
}

class BubbleSortStrategy implements Sorter {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}

class InsertionSortStrategy implements Sorter {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

public class SortStrategy {
    public static void main(String[] args) {
        int[] nums1 = {5, 2, 8, 1};
        Sorter s1 = new BubbleSortStrategy();
        s1.sort(nums1);
        System.out.println("Bubble: " + Arrays.toString(nums1));

        int[] nums2 = {9, 4, 1, 7};
        Sorter s2 = new InsertionSortStrategy();
        s2.sort(nums2);
        System.out.println("Insertion: " + Arrays.toString(nums2));
    }
}
