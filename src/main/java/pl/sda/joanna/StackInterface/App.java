package pl.sda.joanna.StackInterface;

public class App {
    public static void main(String[] args) {
        String first = "Hi i am first";
        String second = "Hi i am second";
        String third = "Hi i am third";
        StackImpl stack = new StackImpl();

        stack.push(first);
        stack.push(second);
        stack.push(third);

        Object peekResult = stack.peek();
        System.out.println((String) peekResult);

        Object popResult = stack.pop();
        Object popResultTwo = stack.pop();
        Object popResultThree = stack.pop();
       // Object popResultFour = stack.pop();
       // Object popResultFive = stack.pop();
       // Object popResultSix = stack.pop();

        System.out.println((String) popResult);
        System.out.println((String) popResultTwo);
        System.out.println((String) popResultThree);
       // System.out.println((String) popResultFour);
       // System.out.println((String) popResultFive);
       // System.out.println((String) popResultSix);
    }
}
