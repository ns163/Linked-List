//Name: Nikhil Sethi
//ID: 1213414
//COMP242 - Assignment Two

import java.lang.*;
import java.util.*;

//Interface for the Integer class where all these functions
//are accessible in integer class.
public interface MyIntegerListInterface
{
	//Remove all items from the List
	public void clear();

	//Add an item to the end of the List
	public void add(int word);

	//Find an item in the List
	public boolean find(int word);

	//A way of iterating over the items in the List
	public int iterator();

	//Remove an element from the List
	public void remove(int word);

	//Return the number of elements in the List
	public int count();
	
}
