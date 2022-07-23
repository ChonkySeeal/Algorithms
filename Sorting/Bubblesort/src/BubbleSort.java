public class BubbleSort {
    private long[] a;
    private int eElems;

    public BubbleSort(int max) {
        a = new long[max];
        eElems = 0;
    }

    public void insert(long value) {
        a[eElems] = value;
        eElems++;
    }

    public void display() {
        for (int i = 0; i < eElems; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println(' ');
    }

    public void bubbleSort() {
        int out, in;

        for (out = eElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void main(String[] args) throws Exception {
        BubbleSort bs = new BubbleSort(10);
        bs.insert(77);
        bs.insert(99);
        bs.insert(44);
        bs.insert(55);
        bs.insert(22);
        bs.insert(33);
        bs.insert(66);
        bs.insert(00);
        bs.insert(11);
        bs.insert(34);
        bs.display();
        bs.bubbleSort();
        bs.display();
    }
}
