import java.util.Scanner;

public class rotatearray {

    public static void Reverse(int arr[], int s, int e) {
        int start = s;
        int end = e;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] a, int k) {
        if (k < 0) {
            k = k + a.length;
        }

        k = k % a.length;

        // Reverse whole array
        Reverse(a, 0, a.length - 1);

        // Reverse first k elements
        Reverse(a, 0, k - 1);

        // Reverse remaining elements
        Reverse(a, k, a.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        int k = sc.nextInt();

        // Rotate array
        rotate(arr, k);

        // Output result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
