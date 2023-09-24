package LinkedList.SinglyLinkedList;

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList<T> {
    Node<T> head;
    LinkedList(){
        this.head = null;
    }

    private boolean isEmpty(){
        return this.head == null;
    }

    public void addAtBegining(T data){
        Node<T> n1 = new Node<T>(data);
        if(isEmpty()){
            this.head = n1;
        }
        else{
            n1.next = this.head;
            this.head = n1;
        }
    }
    public void addAtEnd(T data){
        Node<T> temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node<T>(data);
    }
    public void deleteAtBegining(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        else{
            Node<T> temp = this.head.next;
            this.head = temp;
        }
    }
    public void deleteAtEnd(){
        if(isEmpty()){
            System.out.println("List is Empty!");
            return;
        }
        else{
            Node<T> temp = this.head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void printLinkedList(){
        Node<T> temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private boolean searchInList(T data, Node<T> temp){
        if(temp == null){
            return false;
        }
        else if(temp.data == data){
            return true;
        }
        boolean smallOutput = searchInList(data, temp.next);
        return smallOutput;
    }
    public void find(T data){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        else{
            if(searchInList(data, this.head)){
                System.out.println("Element is present");
            }
            else{
                System.out.println("Element is not present");
            }
        }
    }

}
