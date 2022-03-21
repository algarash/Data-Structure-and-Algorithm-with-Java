public class ArrayQueue<E> implements Queue<E> {
    private static final int CAPACITY=100;
    private E data[];
    private int sz=0;
    private int f=0;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E el) {
        if (size()==data.length)
            throw new IllegalStateException("Queue is Full");
        int i=(f+sz)%data.length;
        data[i]=el;
        sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E del=data[f];
        data[f]=null;
        f=(f+1)% data.length;
        sz--;
        return del;
    }

    @Override
    public E first() {
        if (isEmpty())return null;
        return data[f];
    }
}
