import java.util.*;

class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();

		//1) Add Method 

		list.add("Apple");
		list.add("Microsoft");
		list.add("Amazon");
		list.add("Nvidia");

		System.out.println("LinkedList = "+list);

		//2) Add to particular Index (list.add(index i, Object o))

		list.add(2,"Intel");

		System.out.println(list);

		//3) clone()

		LinkedList<String> clist = (LinkedList<String>)list.clone();

		System.out.println("Copy Elements = "+clist);

		//4)addFirst() 

		list.addFirst("Flipkart");
		System.out.println(list);

		//5)addLast()

		list.addLast("GSLab");
		System.out.println(list);

		//6 remove First

		list.removeFirst();
		System.out.println(list);

		//7 remove last

		list.removeLast();
		System.out.println(list);
	}
}