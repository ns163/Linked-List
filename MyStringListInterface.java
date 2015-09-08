//Name: Nikhil Sethi
//ID: 1213414
//COMP242 - Assignment Two

import java.lang.*;
import java.util.*;

//Interface for StringList so all the fucntions can 
//be accessed in the StringList class.
public interface MyStringListInterface
{
	//Remove all items from the List
	public void clear();

	//Add an item to the end of the List
	public void add(String word);

	//Find an item in the List
	public boolean find(String word);

	//A way of iterating over the items in the List
	public String iterator();

	//Remove an element from the List
	public void remove(String word);

	//Return the number of elements in the List
	public int count();
	
}
