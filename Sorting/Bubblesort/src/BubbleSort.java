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
        for (int i = 0; i < eElems - 1; i++)
            for (int j = 0; j < eElems - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
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
