package pl.sda.joanna.sort;


public class BubbleSort {

    public static void sort (int [] numbers){
        boolean swapped;
        do {
            swapped = false;
            for(int i =1; i<numbers.length; i++){
                if(numbers [i - 1]>numbers [i]){
                    int temp = numbers [i - 1];
                    numbers [i-1]= numbers [i];
                    numbers[i]= temp;
                    swapped= true;
                }
            }
        }while (swapped);
    }

}
