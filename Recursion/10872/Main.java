import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int N = i.nextInt();
        i.close();
        int result = fact(N);
        System.out.println(result);
    }

    public static int fact(int N) {
        if(N <=1) return 1;
        return N * fact(N-1);
    }
}