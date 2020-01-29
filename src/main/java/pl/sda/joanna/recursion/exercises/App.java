package pl.sda.joanna.recursion.exercises;


public class App {
    public static void main(String[] args) {
        CommonDivisor commonDivisor = new CommonDivisor();
        int a = 66;
        int b = 30;
        System.out.println(commonDivisor.greatestCommonDivisor(a,b));

        int result4 = commonDivisor.euclidesAlgo(a,b);
        System.out.println(result4);

        Factorial factorial = new Factorial();
        int c = 49;
        System.out.println(factorial.factorial(c));


    }
    }

