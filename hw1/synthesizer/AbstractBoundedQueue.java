package synthesizer;
/**
 * Created by sandeeptiwari on 2/17/17.
 */
public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T> {
    protected int fillCount;
    protected int capacity;

    public int capacity() {
        return capacity;
    }

    public int fillCount() {
        return fillCount;
    }

//    public boolean isEmpty() {
//        return (fillCount == 0);
//    }
//
//    public boolean isFull() {
//        return (fillCount == capacity);
//    }
//
//    public abstract void enqueue(T x);
//    public abstract T dequeue();
//    public abstract T peek();
}
