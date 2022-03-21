public class SinglyLinkedlistStructure<E>{

        private Node<E> head=null;
        private Node<E> tail=null;
        int size=0;
        public boolean isEmpty(){
            return size==0;
        } /// check if the list is empty
    public int size(){
            return size;
    } // return size of the list
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
            head=new Node<E>(elmen, head);// focus here the next pointer is the head itself
                                          // if there is a previous head then it is going to be the seconde and so on
                                          // so here no null the next elememnt is the old head
            if (size==0)
                tail=head;
            size++;
    }
    public void addlast (E elemn){
            Node<E> newnode= new Node<>(elemn, null);
            if (isEmpty())
                head=newnode; // if no nodes then head is this
            else tail.setNext(newnode); // when there is an element meaning that the null pointer of
                                        // the old tail will point two the new node which has elemnt and null value
             tail=newnode; // then here assign the new node to the tail foucs you made a mistake
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
