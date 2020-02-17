package pl.sda.joanna.pseudocode;


public class PseudocodeExerciseImpl {


    int theBigestNumber(int[] table) {
        int bigestNumber = table[0];
        for (int value : table) {
            if (value > bigestNumber)
                bigestNumber = value;
        }
        return bigestNumber;
    }

    boolean evenNumber(int[] table) {
        int evenNumber = table[0];
        for (int i = 0; i < table.length; i++) {
            if (evenNumber % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    int sumOfTableNumber(int[] table) {
        int sum = 0;
        for (int value : table) {
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }


}


