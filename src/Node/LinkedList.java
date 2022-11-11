package Node;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node<T> {
        Node<T> next;
        Node<T> previous;
        final T element;

        public Node(T element) {
            this.element = element;
        }
    }

    public void addElement(T element) {
        this.head = new Node<>(element);
        this.tail = head;
        this.head.next = null;
        this.head.previous = null;
    }

    public void removeElement(T element) {
        Node temp = head;
        Node tempPrevious = null;
        while (temp != null) {
            if (element == temp.element) {
                if (tempPrevious == null) {
                    head = temp.next;
                } else {
                    tempPrevious.next = temp.next;
                }
            } else {
                tempPrevious = temp;

            }
            temp = temp.next;
        }
    }

    public void addHead(T headElement) {
        if (this.size == 0) {
            addElement(headElement);
        } else {
            Node <T> temp = head;
            head = new Node<>(headElement);
            head.next = temp;
            temp.previous = head;
        }
        size++;
    }

    public void addHeadArray(T[] headArray) {
        for (T element : headArray) {
            addHead(element);
        }
    }


    public void addHeadCollection(Iterable<T> collection) {
        for (T element : collection) {
            addHead(element);
        }
    }

    public void replaceList(Iterable<T> collection, Iterable<T> collection1) {
        addHeadCollection(collection1);
        for (T element : collection) {
            removeElement(element);
        }
    }

    public void addTail(T tailElement) {
        if (this.size == 0) {
            addElement(tailElement);
        } else {
            Node <T> temp = tail;
            tail = new Node<>(tailElement);
            tail.previous = temp;
            temp.next = tail;
        }
        size++;
    }

    public void addTailArray(T[] tailArray) {
        for (T element : tailArray) {
            addTail(element);
        }
    }

    public void addTailCollection(Iterable<T> tailCollection) {
        for (T element : tailCollection) {
            addTail(element);
        }
    }


    void listPrint() {
        Node <T> temp = head;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    void listPrintRevers() {
        Node <T> temp = tail;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.previous;
        }
    }
}