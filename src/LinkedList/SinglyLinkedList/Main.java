package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.addAtBegining(30);
        l.addAtBegining(20);
        l.addAtBegining(10);

        l.printLinkedList();

        LinkedList<String> l2 = new LinkedList<String>();
        l2.addAtBegining("USA");
        l2.addAtBegining("London");
        l2.addAtBegining("Europe");
        l2.addAtBegining("India");
        l2.addAtEnd("China");
        l2.printLinkedList();

//        l2.deleteAtBegining();
//        l2.printLinkedList();
//        l2.deleteAtEnd();
//        l2.printLinkedList();

        l2.find("USA");

    }
}
