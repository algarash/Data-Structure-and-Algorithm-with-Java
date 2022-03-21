public class DoublyLinkedlist<E>{
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
///////////////////////////////////////
    public void splitList() {
    Node<E> slow_ptr = header;
    Node<E> fast_ptr = header;
    Node<E> header1;
    Node<E> header2;

    if (header == null) {
        return;
    }
    while (fast_ptr.next != header
            && fast_ptr.next.next != header) {
        fast_ptr = fast_ptr.next.next;
        slow_ptr = slow_ptr.next;                  // Question 1 Algorithm
    }
    if (fast_ptr.next.next == header) {
        fast_ptr = fast_ptr.next;
    }
    header1 = header;
    if (header.next != header) {
        header2 = slow_ptr.next;
    }
    fast_ptr.next = slow_ptr.next;
    slow_ptr.next = header;
}

////////////////////////////////////////////
    public int sizeAlrebative(){
        int si=0;
        if (trailer==null) return si;

        DoublyLinkedlist.Node<E> x=header;                // Question 2 Algorithm
        while (x.getNext()!=trailer){
            si++;
            x=x.getNext();
        }
        return si;
    }
    ////////////////////////////////////////////////////////
    public boolean equals(DoublyLinkedlist list1, DoublyLinkedlist list2) {
        boolean b = false;
        if (list1.isEmpty() && list2.isEmpty()){
            System.out.println("Lists are empty");
            return true;
        }
        if (list1.size() == list2.size()){
            int n = list1.size ();
            DoublyLinkedlist.Node<E> n1 = list1.header.getNext();
            DoublyLinkedlist.Node<E> n2 = list2.header.getNext();              //  Question 3 Algorith
            while (n != 0){
                if ( n1.getElement() .equals( n2.getElement())){
                    b = true;
                }
                else b=false;
                n1 = n1.getNext();
                n2 = n2.getNext();
                n--;
            }
        }return b;
    }
    /////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////
    public DoublyLinkedlist<E> clone() throws CloneNotSupportedException {
        DoublyLinkedlist<E> other = (DoublyLinkedlist<E>) super.clone();
        if (size > 0) {
            other.header = new Node<>(null, null, null);
            other.trailer = new Node<>(null, other.header, null);
            other.header.setNext(other.trailer);
            Node<E> walk = header.getNext();                                         // Question 7 Algorithm
            Node<E> otherWalk = other.header;
            for(int i = 0; i < size; i++) {
                Node<E> newest = new Node<>(walk.getElement(), otherWalk, otherWalk.getNext());
                otherWalk.getNext().setPrev(newest);
                otherWalk.setNext(newest);
                otherWalk = otherWalk.getNext();
                walk = walk.getNext();
            }
        }
        return other;
    }
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
