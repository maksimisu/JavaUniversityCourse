package lb2;

public class Node<E> {
    E item;
    Node<E> next;

    public Node(E item) {
        this.item = item;
        next = null;
    }
}