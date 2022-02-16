package org.Java;

import java.util.LinkedList;
import java.util.List;

public class Employee {
	public static void main(String[] args) {
		List li= new LinkedList();
		li.add(10);
		li.add("String");
		li.add('A');
		li.add(9940377048l);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		boolean empty = li.isEmpty();
		System.out.println(empty);	
		System.out.println("for loop");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		System.out.println("enhanced for loop");
		for (Object x : li) {
			System.out.println(x);
			
		}
		
		
		
		
	}

}
