public class circlyLinkedList <E>{
    private Node<E> tail=null;
    private int size=0;

    public circlyLinkedList() {
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
