package sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*int[] numarr = {6,8,2,4,7,5,9};
        int[] numarr2 = {9,2,5,4,7,1,8,3,6};
        int[] numarr3 = {2,1,4,3,6,5};

        Sort.bubbleSort(numarr);
        Sort.selectionSort(numarr2);
        Sort.insertionSort(numarr3);

        System.out.println(Arrays.toString(numarr));
        System.out.println(Arrays.toString(numarr2));
        System.out.println(Arrays.toString(numarr3));*/

        /*int[] numarr4 = {3,1,4,2};
        int[] sorted = MergeSort.mergeSort(numarr4);

        System.out.println(Arrays.toString(sorted));*/

        int[] numarr5 = {4,1,3,2,6,7,5};
        QuickSort.quickSort(numarr5);
        System.out.println(Arrays.toString(numarr5));
    }
}
