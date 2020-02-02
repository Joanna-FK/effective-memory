package pl.sda.joanna.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrOne = {12, 589, 456, 32, 0, 7, 45, 9648, 7};
        int[] arrTwo = {-45, -85, 8, 968, 0, 14, -47, 3256, 47, 1, -8};
        System.out.println("arrOne");
        System.out.println(Arrays.toString(arrOne));
        QuickSort.sort(arrOne);
        System.out.println(Arrays.toString(arrOne));
        System.out.println("arrTwo");
        System.out.println(Arrays.toString(arrTwo));
        QuickSort.sort(arrTwo);
        System.out.println(Arrays.toString(arrTwo));
    }

}
