public class Stack {
    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int n) {
        int maxSize = n;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int n) {
        stack[++top] = n;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top != -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
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
