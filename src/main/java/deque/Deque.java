package deque;

public interface Deque<E> {

    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();

    E peekFront();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();
}

