package pl.sda.joanna.searchexercise;


public class BinarySearch {

    public static int myBinarySearch(int[] array, int searchElement, int lowIndex, int highIndex) {
        int middleIndex = (lowIndex + highIndex) / 2;
        int middleElement = array[middleIndex];
        if (highIndex < lowIndex) {
            return -1;
        }
        if (searchElement == middleElement) {
            return middleIndex;
        } else if (searchElement < middleElement) {
            return myBinarySearch(array, searchElement, lowIndex, middleIndex - 1);
        } else {
            return myBinarySearch(array, searchElement, middleIndex + 1, highIndex);

        }
    }
}
