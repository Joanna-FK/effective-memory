package pl.sda.joanna;

public class CommonDivisor {

    int greatestCommonDivisor(int a, int b) {
        int gcd = 0;
            if (a <= b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }
        }else
            if (a>b ){
                for(int i =1; i<=a; i++){
                    if (a%i ==0 && b%i ==0){
                        gcd =i;
                    }
                }
            }
        return gcd;
    }
    //metoda rekurencyjna

    public int euclidesAlgo(int a, int b) {
        if (b==0){
             return a;
        }else {
         return    euclidesAlgo(b, a%b);

        }
    }

}