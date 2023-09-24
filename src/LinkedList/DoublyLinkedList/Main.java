package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
        l.addAtBegining(30);
        l.addAtBegining(20);
        l.addAtBegining(10);
        l.addAtEnd(40);
        l.printDoublyLinkedList();
        l.printReverseLinkedList();
        System.out.println("---------------------------------------------");
        l.removeAtBegining();
        l.printDoublyLinkedList();
        l.printReverseLinkedList();
        System.out.println("---------------------------------------------");
        l.removeAtEnd();
        l.printDoublyLinkedList();
        l.printReverseLinkedList();

    }
}
