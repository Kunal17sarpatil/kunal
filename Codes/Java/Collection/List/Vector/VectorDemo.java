import java.util.*;

class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		System.out.println(v.capacity());

		v.add(10);
		v.add(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);		
		v.addElement(60);

		System.out.println(v);

		//Iterator:

		Iterator itr = v.iterator();

		while(itr.hasNext()) {

			System.out.println(itr.next());
		}

		//Enumeration:

		Enumeration e = v.elements();

		while(e.hasMoreElements()) {

			System.out.println("Enumeration = "+e.nextElement());
		}
	}
}