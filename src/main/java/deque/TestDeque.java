package deque;

public class TestDeque {
    public static void main(String[] args) {
        testDeque();
    }

    private static void testDeque() {
        Deque<Integer> deque = new DequeImpl<>(5);
        System.out.println("add element from right: " + deque.insertRight(34));
        System.out.println("add element from right: " + deque.insertRight(12));
        System.out.println("add element from right: " + deque.insertRight(20));
        System.out.println("add element from right: " + deque.insertRight(16));
        System.out.println("add element from right: " + deque.insertRight(14));
        System.out.println("add element from right: " + deque.insertRight(17));
        deque.display();

        for (int i = 1; i <= 5; i++) {
            System.out.println("remove from right: " + deque.removeRight());
            deque.display();
        }

        System.out.println("add element from left: " + deque.insertLeft(11));
        System.out.println("add element from left: " + deque.insertLeft(22));
        System.out.println("add element from left: " + deque.insertLeft(33));
        System.out.println("add element from left: " + deque.insertLeft(44));
        System.out.println("add element from left: " + deque.insertLeft(55));
        System.out.println("add element from left: " + deque.insertLeft(66));
        deque.display();

        for (int i = 1; i <= 5; i++) {
            System.out.println("remove from left: " + deque.removeLeft());
            deque.display();
        }
    }
}
