import java.util.Scanner;

public class SingleLinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinggleLinkedNode head = new SinggleLinkedNode();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            head.add(new LinkedNode(sc.nextInt()));
        }
        int k = sc.nextInt();
        head.deleteMoreK(k);
        head.print();
    }
}

class LinkedNode {
    int data;
    LinkedNode next;

    public LinkedNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinggleLinkedNode {
    LinkedNode head;

    public SinggleLinkedNode() {

    }

    public int get(int k) {
        if (k == 0) {
            return head.data;
        } else {
            LinkedNode current = head;
            for (int i = 0; i < k - 1; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

    public void add(LinkedNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            LinkedNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert(int k, int data) {
        LinkedNode newNode = new LinkedNode(data);
        if (head == null) {
            head = newNode;
        } else if (k == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            LinkedNode current = head;
            for (int i = 0; i < k - 1 && current.next != null; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void delete(int k) {
        LinkedNode current = head;
        if (k == 0) {
            head = current.next;
        } else {
            for (int i = 0; i < k - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public void deleteMoreK(int k) {
        while (head != null && head.data > k) {
            head = head.next;
        }
        if (head != null) {
            LinkedNode current = head;
            while (current.next != null) {
                if (current.next.data > k) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }
    }

    public void change(int a, int b) {

        LinkedNode current = head;
        while (current != null) {
            if (current.data == a) {
                current.data = b;
            }
            current = current.next;
        }

    }

    public void print() {
        LinkedNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

