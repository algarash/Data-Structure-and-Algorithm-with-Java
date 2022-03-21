public class SinglyLinkedList_Queue<E> implements Queue<E> {
SinglyLinkedlistStructure<E> list=new SinglyLinkedlistStructure<E>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E el) {
    list.addlast(el);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E first() {
        return list.first();
    }
}
