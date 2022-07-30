public class SelectionSort {

    private long[] a;
    private int eElems;

    public SelectionSort(int max) {
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

    public void selectionSort() {
        int i, j, min;
        for (i = 0; i < eElems - 1; i++) {
            min = i;
            for (j = i; i < eElems; j++) {
                if (a[min] > a[j])
                    min = j;
                swap(min, j);
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void main(String[] args) throws Exception {
        SelectionSort ss = new SelectionSort(5);
        ss.insert(44);
        ss.insert(33);
        ss.insert(22);
        ss.insert(12);
        ss.insert(76);
        ss.display();
        ss.selectionSort();
        ss.display();
    }

}
