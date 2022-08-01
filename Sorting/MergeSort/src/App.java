public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayA = { 23, 47, 81, 95 };
        int[] arrayB = { 7, 14, 39, 55, 62, 74 };
        int[] arrayC = new int[10];
        merge(arrayA, 4, arrayB, 6, arrayC);
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }

    public static void merge(int[] A, int sizeA, int[] B, int sizeB, int[] C) {
        int aDex = 0, bDex = 0, cDex = 0;

        while (aDex < sizeA && bDex < sizeB) {
            if (A[aDex] < B[bDex])
                C[cDex++] = A[aDex++];
            else
                C[cDex++] = B[bDex++];
        }

        while (aDex < sizeA)
            C[cDex++] = A[aDex++];
        while (bDex < sizeB)
            C[cDex++] = B[aDex++];
    }
}
