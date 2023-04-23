package javaCollectionFramework;

import java.util.*;
import java.io.*;

public class LearnArrayList {
	
	
	public static void main(String args[])throws IOException{
	ArrayList<String> studentsName = new ArrayList<>(); // By default Array is created of size 10
	
	
// after array is filled so size increases according to "initial size array=n" "New size will be equal to = n+ n/2+1
// it will create the new array with the above size and use the new array and dump the old one after copying records from it
	
	
	
	/* 
	 
	 We will talk about the add function of the array list 
	 
	 
	 
	 */
	studentsName.add("Jayant");
	System.out.println(studentsName);
	
	
	// we can specify element and add the object at that position in arraylist
	
	
	
	studentsName.add(1, "Shashwat");
	System.out.println(studentsName);
	
	 ArrayList<String> list= new ArrayList<>(); list.add("Haley");
	list.add("Ramesh"); list.add("Jatin"); list.add("Natin");
	 
	studentsName.addAll(list); // with addAll function we can add new list to an existing list
	
	System.out.println(studentsName);
	
	// Implementing queue
	
	Queue<Integer> queue = new LinkedList<>();
	queue.offer(2);
	int t=queue.peek();
	System.out.println(queue);
	System.out.println(t);
	
	System.out.println(queue.poll());
	System.out.println(queue);
	
	
	
	
	}
	
	
	

}
