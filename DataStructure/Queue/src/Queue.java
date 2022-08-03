public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;
    private int nItems;

    public Queue(int n) {
        maxSize = n + 1;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int i) {
        if (rear == maxSize - 1)
            rear = -1;
        queue[++rear] = i;
        nItems++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public static void main(String[] args) throws Exception {

        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        while (!q.isEmpty()) {
            long item = q.remove();
            System.out.println(item);
        }
    }
}
