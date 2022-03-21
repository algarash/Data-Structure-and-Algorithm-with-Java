/*
      Assignment 3 Singly linlked list questions are implemented as new methods to the Data structure
      created by Yusuf Abdo Algarash
*/
public class SinglyLinkedlistStructure<E>{

        private Node<E> head=null;
        private Node<E> tail=null;
        int size=0;
        public boolean isEmpty(){
            return size==0;
        }
    public int size(){
            return size;
    }
    public E first(){
    if (isEmpty())return null;
    return head.getElement();
        // returm element in the head
    } // returm element in the tail
    public E last(){
            if (isEmpty())return null;
            return tail.getElement();
    }

    public void addfirst(E elmen){
            head=new Node<E>(elmen, head);

            if (size==0)
                tail=head;
            size++;
    }
    public void addlast (E elemn){
            Node<E> newnode= new Node<>(elemn, null);
            if (isEmpty())
                head=newnode;
            else tail.setNext(newnode);
             tail=newnode;
            size++;
    }

    public E removeFirst(){
            if (isEmpty())return null;
            E delete= head.getElement();
            head=head.getNext();
            size--;
            if (size==0)
                tail=null;
            return delete;
    }

    ////////////////////////////////////////////////
    public E Second_to_last(Node<E> n){
        Node<E> newes=n;
        if (newes==null||newes.getNext()==null)return null;        //  Question 1 Algorithm
        while (newes.getNext().getNext()!=null)
        {
            newes=newes.getNext();
        }
        return newes.getElement();
    }
    /////////////////////////////////////////
    public int size_alternative(){
        Node<E>curr=head;
        int size=0;
        if (head==null)return size;                           //    Question 2 Algorithm
        while (curr!=null){
            curr=curr.getNext();
            size++;
        }
        return size;
    }
    ///////////////////////////////
    public void rotate() {
        if (head != null) {
            Node tail = null;
            E current = head.getElement();

            while (head.getNext() != null) {                  // Question 3 Algorithm
                tail.setElement(current);
                head = head.getNext();
            }
            if (tail != null) {
                tail.setNext(null);
                head.setNext(head);
                head.setElement(current);
            }
        }
    }
///////////////////////////////////////////////////////
     public SinglyLinkedlistStructure<Integer>
     Mearge(SinglyLinkedlistStructure<Integer>list1,               //Question 4 Algorithm
            SinglyLinkedlistStructure<E>list2){
      list1.tail.setNext((SinglyLinkedlistStructure<Integer>.Node<Integer>) list2.head);
      list1.size=list1.size+list2.size;
       return list1;
       }
       /////////////////////////////////////////////////////////////
       Node reverse(Node node) {
           Node prev = null;
           Node current = node;
           Node next = null;
           while (current != null) {                     //   Question 5 Algorithm
               next = current.next;
               current.next = prev;
               prev = current;
               current = next;
           }
           node = prev;
           return node;
       }



    public class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }



}
