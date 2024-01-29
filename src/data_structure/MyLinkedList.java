package data_structure;


public class MyLinkedList<T> {

    /**
     * 头节点
     */
    private Node head;

    public MyLinkedList() {

    }






    class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }
}
