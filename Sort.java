import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        System.out.println(isSquareNumber(33));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        display(arr);
        sc.close();

    }

    public static int firstValue(int[] a) {
        int i = 0;
        while (i < a.length - 1) {
            if (a[i + 1] - a[i] > 1) {
                return a[i] + 1;
            }
            i++;
        }
        return a[a.length - 1] + 1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                if (arr[j] < temp) {
                    swap(arr, i, j);
                }
            }

        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merger(arr, l, mid, r);
        }
    }

    public static void merger(int[] arr, int l, int m, int r) {
        int nLeft = m - l + 1;
        int nRight = r - m;
        int[] left = new int[nLeft];
        int[] right = new int[nRight];
        for (int i = 0; i < nLeft; i++) {
            left[i] = arr[i + l];
        }
        for (int i = 0; i < nRight; i++) {
            right[i] = arr[i + m + 1];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < nLeft && j < nRight) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nLeft) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nRight) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int p = partition(a, l, r);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, r);
        }
    }

    public static int partition(int[] a, int l, int r) {
        int p = a[r];
        int m = l - 1;

        for (int j = l; j < r; j++) {
            if (a[j] < p) {
                m++;
                swap(a, m, j);
            }
        }
        swap(a, m + 1, r);
        return m + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    public static boolean isSquareNumber(long n) {
        if ((double) n / Math.sqrt(n) == (int) Math.sqrt(n)) {
            return true;
        }
        return false;
    }

    public static void display(long[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (isSquareNumber(a[i]) && (i == 0 || a[i] > a[i - 1])) {
                System.out.print(a[i] + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NULL");
        }
    }
}
