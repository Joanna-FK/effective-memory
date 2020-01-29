package pl.sda.joanna.recursion.exercises;

public class Factorial {
    //metoda rekurencyjna
    public long factorial  (int c){
        if (c==1 ){
            return 1;
        }
        return c * factorial(c-1);
    }

}
