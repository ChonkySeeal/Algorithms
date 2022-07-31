public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) throws Exception {
        Stack s = new Stack(10);
        s.push(20);
        s.push(40);

        while (!s.isEmpty()) {
            long item = s.pop();
            System.out.println(item);
        }
    }
}
