package pl.sda.joanna.searchexercise;


public class AppSearch {
    public static void main(String[] args) {

        SoftDrink softDrinkOne = new SoftDrink("Fanta", "Pepsi", 5.5);
        SoftDrink softDrinkTwo = new SoftDrink("Sprite", "Pepsi", 6.5);
        SoftDrink softDrinkThree = new SoftDrink("Pepsi light", "Pepsi", 4.5);
        SoftDrink softDrinkFour = new SoftDrink("Cola light", "Coca Cola", 5.0);
        SoftDrink softDrinkFive = new SoftDrink("Lipton ice tea", "Lipton", 3.5);
        SoftDrink softDrinkSix = new SoftDrink("Cola oryginal", "Jeronimo Martins", 3.5);
        SoftDrink softDrinkSeven = new SoftDrink("Zywiec zdroj", "Zywiec", 2.5);

        SoftDrink [] softDrinks = {softDrinkOne, softDrinkTwo, softDrinkThree, softDrinkFour, softDrinkFive, softDrinkSix, softDrinkSeven};
        //System.out.println(Arrays.toString(softDrinks));

        SoftDrink searchedSoftDrink = new SoftDrink("Cola light", "Coca Cola", 5.0);
        int searchIndex = LinearSearchUtil.findFirstSoftDrink(searchedSoftDrink, softDrinks);
        System.out.println("Searched drink is on: " + searchIndex);
    }
}
