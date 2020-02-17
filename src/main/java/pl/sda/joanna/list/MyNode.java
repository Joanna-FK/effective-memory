package pl.sda.joanna.list;

public class MyNode {
    Integer value;
    MyNode nextNode;

    public MyNode(Integer value, MyNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
        System.out.println("New node value = "+ value);
    }
}
