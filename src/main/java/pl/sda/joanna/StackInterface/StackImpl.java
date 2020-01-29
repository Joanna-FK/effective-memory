package pl.sda.joanna.StackInterface;


public class StackImpl implements StackInterface {

    private Object[] stackData = new Object[10];
    private int currentFreeIndex = 0;

    @Override
    public Object pop() {
        Object obj = stackData[currentFreeIndex - 1];
        stackData[currentFreeIndex - 1] = null;
        currentFreeIndex--;
        return obj;
    }
    @Override
    public void push(Object obj) {
        stackData[currentFreeIndex] = obj;
        currentFreeIndex++;
    }
    @Override
    public Object peek() {
        return stackData[currentFreeIndex - 1];
    }
}
