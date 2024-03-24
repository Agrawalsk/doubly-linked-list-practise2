package Implementation;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    boolean isEmpty() {
        return size == 0;
    }
public void add(int data){
        Node temp=new Node(data);
        if(isEmpty()){
           head=temp;
           tail=temp;
           size++;
           return;
        }
        tail.next=temp;
        temp.previous=tail;
        tail=temp;
        size++;
}

   static class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
            this.next=null;
            this.previous=null;
        }
    }
}

class Main{
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.add(12);
        doublyLinkedList.add(13);
        doublyLinkedList.add(14);
        doublyLinkedList.add(15);
        doublyLinkedList.add(16);
        doublyLinkedList.add(17);
        System.out.println(doublyLinkedList.size);
    }
}