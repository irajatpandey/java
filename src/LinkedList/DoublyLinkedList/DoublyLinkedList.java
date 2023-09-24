package LinkedList.DoublyLinkedList;

class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList<T> {
    Node<T> head;
    DoublyLinkedList(){
        this.head = null;
    }
    private boolean isEmpty() {
        return this.head == null;
    }
    public void addAtBegining(T data){
        if(isEmpty()){
            this.head = new Node(data);
            return;
        }
        else {
            Node<T> newNode = new Node(data);
            Node<T> temp = this.head;
            temp.prev = newNode;
            newNode.next = temp;
            this.head = newNode;
        }
    }
    public void addAtEnd(T data){
        Node<T> temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node<T> newNode = new Node<T>(data);
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void removeAtBegining(){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }
    public void removeAtEnd(){
        Node<T> temp = this.head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printDoublyLinkedList(){
        Node<T> temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void printReverseLinkedList(){
        Node<T> temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }


}
