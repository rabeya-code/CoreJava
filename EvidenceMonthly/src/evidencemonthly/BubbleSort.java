package evidencemonthly;

public class BubbleSort {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };
        for (int i = 0; i < arr.length; i++) {
            int[] ca = arr[i];
            Bubblesort(ca);
            for (int j = 0; j < ca.length; j++) {
                System.out.print(ca[j] + " ");
            }
            System.out.println();
        }
    }

    private static void Bubblesort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int larger = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = larger;
                }
            }
        }
    }

}
