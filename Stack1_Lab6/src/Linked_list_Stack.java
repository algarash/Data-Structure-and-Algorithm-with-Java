public class Linked_list_Stack<E> implements Stack<E> {

    SinglyLinkedlistStructure<E> list =new SinglyLinkedlistStructure<E>();

    public Linked_list_Stack(E i) {
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public void push(E element) {
        list.addfirst(element);
    }

}
