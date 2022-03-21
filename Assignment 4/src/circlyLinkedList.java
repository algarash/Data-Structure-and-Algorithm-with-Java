
/*
      Assignment 3 Singly linlked list questions are implemented as new methods to the Data structure
      created by Yusuf Abdo Algarash
*/

public class circlyLinkedList<E>{
    private Node<E> tail=null;
    private int size=0;

    public circlyLinkedList() {
    }

    public circlyLinkedList(E el, Node<E> next) {
    }

    public boolean isEmpty(){
    return size==0;
   }
  public int size(){
        return size;
  }
 public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElement();
 }
 public E last(){
        if (isEmpty())return null;
        return tail.getElement();
 }
 public void addfirst( E element){
        if (isEmpty()){
            tail=new Node<>(element,null);  // null as initial value
            tail.setNext(tail);
        }
        else {
            Node<E> newest= new Node<>(element,tail.getNext());
            tail.setNext(newest);
        }
        size++;
 }
 public void addlast(E element){
        addfirst(element);
        tail=tail.getNext();

 }
 public E removeFirst(){
        if (isEmpty())return null;
        Node<E> x = tail.getNext();
        if (x==tail)tail=null; // meaning that there is only one node // @@##

         else tail.setNext(x.getNext());
        size--;
        return x.getElement(); // deleted element
 }

public void rotate(){
        if (tail != null)
            tail= tail.getNext();
}
///////////////////////////////////////////////////////////////////////////////
        public void addFirstAlternate(E el){
        if (isEmpty()){
            tail= new Node<E>( el,null);                // Question 1 algorith
            tail.setNext(tail);
        }
        else {
            tail.next= new Node<>( el,tail.getNext());
        }
    }

    /////////////////////////////////////////////////////////////////////////////
    public int SizeAlternative(){
        int s=0; // s for size
        if (tail==null) return s;
        else s++;
        Node<E> node=tail;                           //    Question 2 Algorithm
        while (node.getNext()!=tail){
            s++;
            node=node.getNext();
        }
        return s;
    }
    ///////////////////////////////////////////////////////////////////////////////
    public boolean equal(circlyLinkedList list1, circlyLinkedList list2) {
        boolean bool = false;
        if (list1.size() == list2.size()){
            int num = list1.size ();
            Node<E> n1 = list1.tail.getNext();
            Node<E> n2 = list2.tail.getNext();
            while (num != 0){
                if (list1.tail.getElement().equals ( list2.tail.getElement () ) || n1.getElement().equals ( n2.getElement() ) ){
                    bool = true;
                }
                else bool=false;
                n1 = n1.getNext();
                n2 = n2.getNext();
                num--;
            }
        }return bool;
    }
    /////////////////////////////////////////////////////////////
//// Node method
    private class Node<E>{
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
