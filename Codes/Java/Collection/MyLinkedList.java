import java.util.*;

class MyLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println(ll);

		ll.addFirst(5);
		ll.addLast(55);

		System.out.println(ll);

		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}