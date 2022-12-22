package lb2;

public class CustomLinkedList<E> {

    Node<E> node;

    public void add(E item) {
        if (node == null) {
            node = new Node<>(item);
        } else if (node.next == null) {
            node.next = new Node<>(item);
        } else {
            Node<E> nextNode = node.next;
            while (true) {
                if (nextNode.next == null) {
                    nextNode.next = new Node<>(item);
                    break;
                } else {
                    nextNode = nextNode.next;
                }
            }
        }
    }

    public E get(int index) {
        Node<E> temp = node;
        while (index != 0) {
            temp = temp.next;
            index--;
        }
        return temp.item;
    }

    public int size() {
        int size = 0;
        Node<E> temp = node;
        if (temp == null) {
            return size;
        }
        while (true) {
            if (temp.next == null) {
                return ++size;
            } else {
                size++;
                temp = temp.next;
            }
        }
    }

    public void remove(E item) {
        Node<E> temp = node;
        while (true) {
            if (temp.next != null && temp.next.item == item) {
                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                } else {
                    temp.next = null;
                }
                break;
            } else if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    public void remove(int index) {
        Node<E> temp = node;
        if (index == 0) {
            if (temp.next != null) {
                node = temp.next;
            } else {
                node = null;
            }
        } else {
            while (index > 0) {
                temp = temp.next;
                index--;
            }
            if (temp.next != null && temp.next.next != null) {
                temp.next = temp.next.next;
            } else {
                temp.next = null;
            }
        }
    }

    public boolean contains(E item) {
        Node<E> temp = node;
        while (true) {
            if (temp.item == item) {
                return true;
            } else {
                if (temp.next != null) {
                    temp = temp.next;
                } else {
                    break;
                }
            }
        }
        return false;
    }

}

