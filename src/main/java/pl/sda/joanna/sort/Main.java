package pl.sda.joanna.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] numbers = {67, 6, 789,3,0, 546, -6, 3};
        BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
