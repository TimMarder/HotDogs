/*
Team Coke-a-Cola -- Tim Marder & Ricky Lin
Tim Marder
APCS2 pd02
HW#46 -- Arrr, There Be Priorities Here Matey
2018-05-10
*/

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
	
	//instance variable
	private ArrayList<String> _queue;
	
	//constructor
	public ArrayPriorityQueue() {
		
		_queue = new ArrayList<String>();
		
	}
	
	//adds element to the priority queue
	public void add( String val ) {
		
		_queue.add( val );
		
	}
	
	//checks to see if the priority queue is empty
	public boolean isEmpty() {
		
		return _queue.size() == 0;
		
	}
	
	//returns the element with the minimum value in the priority queue
	public String peekMin() {
		
		String result = _queue.get( 0 );
		
		for ( String e : _queue ) {
			if ( result.compareTo( e ) > 0 ) {
				result = e;
			}
		}
		return result;
		
	}
	 //removes the element with the minimum value in the priority queue
	 public String removeMin() {

	     return _queue.remove( _queue.indexOf( peekMin() ) );
	     
	 }
	 
	 //toString method to print the priority queue
	 public String toString() {
		 
		 return _queue.toString();
		 
	 }
	 
	 //main method for testing
	 public static void main( String[] args ) {
		 
		 ArrayPriorityQueue test1 = new ArrayPriorityQueue();
		 
		 test1.add("aoo");
		 test1.add("boo");
		 test1.add("coo");
		 
		 System.out.println("ArrayPriorityQueue test1...");
		 System.out.println( test1 );
		 
		 System.out.println("The minimum value is: " + test1.peekMin());
		 
		 System.out.println("Removing minimum value...");
		 test1.removeMin();
		 System.out.println("Is test1 empty? " + test1.isEmpty());
		 
		 System.out.println("The minimum value is: " + test1.peekMin());
		 
		 System.out.println("Removing minimum value...");
		 test1.removeMin();
		 System.out.println("Is test1 empty? " + test1.isEmpty());
		 
		 System.out.println("The minimum value is: " + test1.peekMin());
		 
		 System.out.println("Removing minimum value...");
		 test1.removeMin();
		 System.out.println("Is test1 empty? " + test1.isEmpty());
		 
	 }
	
	
}
