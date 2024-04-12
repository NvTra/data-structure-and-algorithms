import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer> list = messagesPhone(arr, k);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        sc.close();
    }

    public static List<Integer> messagesPhone(int[] a, int k) {
        Queue<Integer> phoneScreen = new LinkedList<>();
        Set<Integer> phoneNumbers = new HashSet<>();

        for (int number : a) {
            if (!phoneNumbers.contains(number)) {
                if (phoneScreen.size() == k) {
                    phoneNumbers.remove(phoneScreen.poll());
                }
                phoneScreen.offer(number);
                phoneNumbers.add(number);
            }
        }

        List<Integer> result = new ArrayList<>(phoneScreen);
        return result;
    }

    public static void superPrimeNumber(Scanner sc) {
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 2; i <= n && i < 10; i++) {
            if (isPrime(i)) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int num = queue.poll();
            System.out.print(num + " ");
            for (int i = 0; i < 10; i++) {
                int k = num * 10 + i;
                if (k <= n && isPrime(k)) {
                    queue.add(k);
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void queueu(Scanner sc) {
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = q.poll();
            q.add(x);
        }
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

    public static void reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void stackBin(int n) {
        Stack<Integer> stack = new Stack<>();
        if (n == 0) {
            System.out.println(0);
        } else {

            while (n > 0) {
                stack.push(n % 2);
                n /= 2;
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }

    public static String encodeString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if (str.length() == 0) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (stack.isEmpty() || stack.peek() != c) {
                if (!stack.isEmpty()) {
                    sb.append(stack.peek());
                    sb.append(stack.size());
                    stack.clear();
                }
                stack.push(c);
            } else {
                stack.push(c);
            }
        }
        if (!stack.isEmpty()) {
            sb.append(stack.peek());
            sb.append(stack.size());
        }
        return sb.toString();
    }

    public static void quereu(int n) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll());
        }
    }
}
