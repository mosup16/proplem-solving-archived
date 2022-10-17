package proplems.LeatCode;



import java.util.Arrays;
import java.util.function.Consumer;

class CustomList<T> {
    private Node<T> head;
    private Node<T> tail;

    CustomList() {
    }

    public void add(T data) {
        if (tail != null && head != null)
            tail.next = new Node<>(data);
        else tail = head = new Node<>(data);
    }

    public Node<T> getHead() {
        return head;
    }

    public void forEach(Consumer<T> consumer) {
        var next = head;
        while (next != null) {
            consumer.accept(next.data);
            next = next.next;
        }
    }

    public void setHead(Node head) {
        this.head = head;
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        //test
        int[] integers = {2, 3, 4};
        var head = new Node<Integer>(1);
        var trav = head;
        int i = 0;
        while(i < integers.length) {
            trav.next = new Node<>(integers[i++]);
            trav = trav.next;
        }
        Node next = reverseLinkedList(head);
        while (next != null) {
            System.out.println(next.data);
            next = next.next;
        }
    }

    // 1 -> 2 -> 3 -> 4 -> null
    // ^  < ^    ^
    public static Node reverseLinkedList(Node head) {
            Node prev, curr, next;
            prev = null;
            curr = head;
            next = null;
            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
    }
}
