public class Stack<T> {

    private int maxSize;
    private T[] array;
    private int index = 0;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
    }

    public void push(T itemToAdd) {
        if (index + 1 > maxSize) {
            throw new StackOverflow("The Stack is full!");
        }
        array[index] = itemToAdd;
        index++;
    }

    public T pop() {
        if (index - 1 < 0) {
            throw new StackUnderflow("No more elements left in the Stack!");
        }
        T itemToReturn = (T) array[index - 1];
        //array[index - 1] = null;
        index--;

        return itemToReturn;
    }

    public T peek() {
        return array[index - 1];
    }

    public int max_capacity() {
        return maxSize;
    }

    public int free_spaces() {
        return maxSize - index;
    }
}
