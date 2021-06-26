package assignments;

import java.util.LinkedList;

public class LinkedListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Assignment: Add all the months of the year
		 * Add first four months and print the size and print the elements
		 * add september and october months and print the size and print the elements
		 * add may june july august and print the size and print the elements
		 * using addlast november and decmber add to the list and print it*/
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("January");
		ll.add("February");
		ll.add("March");
		ll.add("April");
		
		System.out.println("The size of linkedlist is now: " + ll.size());
		
		ll.add("September");
		ll.add("October");
		
		System.out.println("The size of linkedlist is now: " + ll.size());
		
		ll.add(4,"May");
		ll.add(5,"June");
		ll.add(6,"July");
		ll.add(7,"August");
		
		System.out.println("The size of linkedlist is now: " + ll.size());
		System.out.println(ll);
		
		ll.addLast("November");
		ll.addLast("December");
		
		System.out.println("The size of linkedlist is now: " + ll.size());
		System.out.println(ll);
	}

}
