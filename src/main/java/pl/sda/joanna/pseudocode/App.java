package pl.sda.joanna.pseudocode;

public class App {
    public static void main(String[] args) {

        PseudocodeExerciseImpl pseudocodeExercise = new PseudocodeExerciseImpl();
        int [] table = {1,5,9,72,86, -7, -65};
        int result = (pseudocodeExercise.theBigestNumber(table));
        boolean result2 = (pseudocodeExercise.evenNumber(table));
        int result3 = (pseudocodeExercise.sumOfTableNumber(table));
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
