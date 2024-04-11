import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(binarySearch(a, 0, a.length - 1, k));
    }

    public static void countEven(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.print("NULL");
        }
    }

    public static int countX(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {

                count++;
            }
        }
        return count;
    }

    public static int fMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= min) {
                return i;
            }
        }
        return -1;
    }

    public static int lMax(int[] a) {
        int max = a[0];
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int linearSearch(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }
        }
        return -1;
    }


    public static void printArray(int[] a) {
        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }

    public static int binarySearch(int[] a, int l, int r, int k) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == k && (mid == 0 || a[mid - 1] != k)) {
                return mid;
            } else if (k <= a[mid]) {
                return binarySearch(a, l, mid - 1, k);
            } else {
                return binarySearch(a, mid + 1, r, k);
            }
        }
        return -1;
    }

}