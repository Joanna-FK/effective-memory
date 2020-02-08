package pl.sda.joanna.lastdayexercices.example;

public class App {
    public static void main(String[] args) {
        ternaryOperatorExample();


    }
    private static void ternaryOperatorExample() {
        TernaryOperatorExample checker = new TernaryOperatorExample();
        System.out.println(checker.checkGender("Anna"));
        System.out.println(checker.checkGender("Jakub"));
        System.out.println(checker.checkGender("Unicorn"));
    }
}
