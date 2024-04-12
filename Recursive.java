import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(recursion4(n, k));
    }

    public static int fibonancci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonancci(n - 1) + fibonancci(n - 2);
    }

    public static int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a % b == 0) {
            return b;
        }
        return ucln(b, a % b);
    }

    public static long recursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursion(n - 1);
    }

    public static long recursion2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * recursion2(a, b - 1);
    }

    public static long recursion3(long n) {
        if (n == 1) {
            return 1;
        }
        return 1 + recursion3(n - (n + 1) / 2);
    }

    public static int recursion4(int n, int k) {
        int count = 0;
        if (n == 0) {
            count++;
        } else {
            recursion4(2 * n, k - 1);
            if ((n - 1) % 3 == 0 && ((n - 1) / 3) % 2 == 0) {
                recursion4((n - 1) / 3, k - 1);
            }
        }
        return count;
    }
}
