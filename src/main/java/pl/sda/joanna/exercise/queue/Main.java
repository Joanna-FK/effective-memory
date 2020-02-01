package pl.sda.joanna.exercise.queue;

public class Main {

    public static void main(String[] args) {

        MyQueue<String> myStringQueue = new MyQueue<>();
        myStringQueue.offer("Hello");
        myStringQueue.offer("is it me");
        myStringQueue.offer("you are looking for");
        myStringQueue.offer("NO!");
        myStringQueue.printAll();

        myStringQueue.pool();
        System.out.println("second pool: "+ myStringQueue.pool());
        System.out.println("After removal: ");
        myStringQueue.printAll();
       // MyQueue<Integer> myIntegerQueue = new MyQueue<>();
    }
}
