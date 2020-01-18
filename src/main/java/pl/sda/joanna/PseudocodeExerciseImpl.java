package pl.sda.joanna;

import javax.crypto.spec.PSource;

public class PseudocodeExerciseImpl {


     int theBigestNumber (int [] table){
       int  bigestNumber = table [0];
        for (int value : table) {
            if (value >bigestNumber)
            bigestNumber = value;
        }
        return bigestNumber;
    }
 boolean evenNumber (int [] table){
        int evenNumber = table [0];
        for (int i =0; i <table.length; i++){
            if (evenNumber%2 == 0){
                return true;
            }
        }
        return false;
}

 int sumOfTableNumber (int [] table){
        int sum = 0;
for (int i = 0; i<table.length; i++){
    if (table [i]>0) {
        sum += table [i];
    }
}
        return sum;
}
}
