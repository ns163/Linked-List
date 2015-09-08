//Name: Nikhil Sethi
//ID: 1213414
//COMP242 - Assignment Two

//Generic Interface, it parameterized over types
//All the functions would be accessible in the GenericList class
public interface MyGenericListInterface<T>
{
	//Clears the list
	public void clear();

	//Add an item to the end of the List
	public void add(T word);

	//Find an item in the List and returns true or false value if the word is found
	public boolean find(T word);

	//A way of iterating over the items in the List
	public T iterator();

	//Remove an element from the List
	public void remove(T word);

	//Return the total number of elements in the List
	public int count();
}