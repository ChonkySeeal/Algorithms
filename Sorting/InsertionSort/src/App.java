public class App {
    public static void main(String[] args) throws Exception {

    }

    public void selectionSort() {
        int i,j,temp;
        for(i=1;i<arr.length;i++) {
            temp=arr[i];
            j=i;
            while(j>0&&temp<=arr[j]) {
                arr[j] = arr[j-1]
                --j;
            }
            arr[j] = temp;


        }
    }
}
