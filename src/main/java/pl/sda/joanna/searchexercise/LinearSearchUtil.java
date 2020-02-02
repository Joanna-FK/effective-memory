package pl.sda.joanna.searchexercise;

public class LinearSearchUtil {

    public static int findFirstSoftDrink(SoftDrink searchedSoftDrink, SoftDrink[] drinks ){

        for(int i =0; i<drinks.length; i++){
            if(drinks[i].equals(searchedSoftDrink)){
                return i;
            }
        }
        return -1;
    }
}
