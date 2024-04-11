import java.util.Scanner;

public class DoubleLinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoubleLinkedList list = new DoubleLinkedList();
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        int k = sc.nextInt();
        list.printReverseK(k);
    }
}

class DoubleLinkedNode {
    int data;
    DoubleLinkedNode next;
    DoubleLinkedNode prev;

    public DoubleLinkedNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class DoubleLinkedList {
    DoubleLinkedNode head;

    public DoubleLinkedList() {

    }

    public void insertN(int n) {
        for (int i = n; i > 0; i--) {
            insert(i);
        }
        for (int i = 1; i <= n; i++) {
            insert(i);
        }
    }
    public void insert(int k,int x){
        DoubleLinkedNode node = new DoubleLinkedNode(x);
        if (head == null) {
            head = node;
        }else if (k==0){
            node.next = head;
            head.prev = node;
            head = node;
        } else  {
            DoubleLinkedNode temp = head;
            for (int i = 0; i < k-1; i++) {
                temp = temp.next;
            }
            node.next=temp.next;
            if (temp.next!=null){
                temp.next.prev = node;
            }
            temp.next = node;
            node.prev = temp;
        }
    }
    public void insert(int data) {
        DoubleLinkedNode node = new DoubleLinkedNode(data);
        if (head == null) {
            head = node;
        } else {
            DoubleLinkedNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            temp.next.prev = temp;
        }
    }

    public void print() {
        DoubleLinkedNode node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public void printReverseK(int k) {
        DoubleLinkedNode node = head;
        for (int i = 0; i < k; i++) {
            node = node.next;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        DoubleLinkedNode temp = head;
        for (int i = 0; i < k; i++) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}