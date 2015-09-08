//Name: Nikhil Sethi
//ID: 1213414
//COMP242 - Assignment Two

/*GenericList Class implements the Generic interface so all the methods are 
are accessible in this class*/
public class MyGenericList<T> implements MyGenericListInterface<T>
{
	//Head is the start of the list
	public Node head;
	//The position of the current node in the list
	public Node current;

//Setting constructors for each type
//GET method is access the variable and SET method is to modify the variables 
public class Node
{
	//The next Node in the list
	public Node next;
	//Word which is in the list
	public T word;

	public Node (T word)
	{
		//Making the word to be the node
		setWord(word);
	}

	public void setNext(Node newNode)
	{	
		//Setting the next node as the new one
		next = newNode;
	}

	public Node getNext()
	{
		//Returns the next word in the list
		return next;
	}

	public void setWord(T newWord)
	{
		//Setting the word to be the new word in the list
		word = newWord;
	}

	public T getWord()
	{
		//Return the word in the list
		return word;
	}
}

	/* ADD method makes the new node as the start of the head,
	and checks if the next value is null or not and add the word onto the 
	end of the list */
	public void add(T word)
	{
		Node temp = head;
		if(head == null)
		{
			head = new Node(word);
			current = new Node(null);
			current.setNext(head);
			return;
		}
		while(temp.getNext()!=null)
		{
			temp = temp.getNext();
		}
		temp.setNext(new Node (word));
	}

	//Remove  method removes the node from the list 
	public void remove(T word)
	{
		Node tmp = new Node(word);

		if(head == null)
		{
			return;
		}
		if (head.getWord().equals(word))
		{
			head = head.getNext();
			return;
		}

		while(tmp.getNext()!= null)
		{
			if (tmp.getNext().getWord().equals(word))
			{
				tmp.setNext(tmp.getNext().getNext());
				return;
			}
			tmp = tmp.getNext();
		}
		return;
	}

	//Count method counts the number strings in the list and output 
	//total number of string that has been added to the list.
	public int count()
	{
		int counter = 0;
		Node tmp = head;
		while (tmp!=null)
		{
			counter++;
			tmp = tmp.getNext();
		}
		return counter;
	}

	//Iterator method checks each Node in the list 
	public T iterator()
	{
		if(current==null)
		{
			return null;
		}

		if (current.getNext()==null)
		{
			current = head;
			return current.getWord();
		}
		else
		{
			current = current.getNext();
			return current.getWord();
		}
	}

	//This finds the word in the list and returns a 
	//boolean value as true or false if word was found in the list
	//which was added.
	public boolean find(T word)
	{
		Node tmp = head;

		while (tmp != null)
		{
			if(tmp.getWord().equals(word))
			{
				return true;
			}
			tmp = tmp.getNext();
		}
		return false;
	}

	//Clears the list
	public void clear()
	{
		head = null;
	}

}