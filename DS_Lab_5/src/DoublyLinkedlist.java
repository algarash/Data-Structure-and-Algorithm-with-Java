public class DoublyLinkedlist <E>{
    private Node<E> header;
    private Node<E> trailer;
    int size=0;

    public DoublyLinkedlist() {
        header=new Node<>(null,null,null);
        trailer=new Node<>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return header.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return trailer.getPrev().getElement();
    }
    private void addBetween(E element,Node<E> p, Node<E> n){
        Node<E> newNode=new Node<>(element,p,n);
        p.setNext(newNode);
        n.setPrev(newNode);
        size++;
    }
    public void addFirst(E element){
        addBetween(element,header,header.getNext());
    }
    public void addLast(E element){
        addBetween(element,trailer.getPrev(),trailer);
    }
    private E removeBetween(Node<E> x){
        Node<E> p=x.getPrev();
        Node<E> n=x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getElement();

    }
    public E removeFirst(){
        if (isEmpty())return null;
       return removeBetween(header.getNext());
    }
    public E removeLast(){
        if (isEmpty())return null;
        return removeBetween(trailer.getPrev());
    }
// >>>>>>>>>> Singly linked list is faster than doubly linked list unless we want to remove from the last <<<<<<<
    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;

       public Node(E element, Node<E> prev, Node<E> next) {
           this.element = element;
           this.prev = prev;
           this.next = next;
       }

       public E getElement() {
           return element;
       }

       public void setElement(E element) {
           this.element = element;
       }

       public Node<E> getPrev() {
           return prev;
       }

       public void setPrev(Node<E> prev) {
           this.prev = prev;
       }

       public Node<E> getNext() {
           return next;
       }

       public void setNext(Node<E> next) {
           this.next = next;
       }
   }
}
