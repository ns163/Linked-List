//Name: Nikhil Sethi
//ID: 1213414
//COMP242 - Assignment Two

//MyGenericSortList extends GenericList so it can use methods from that class
//by defining 'Override' in front the method that is being used 
public class MyGenericSortList<T extends Comparable<T>> extends MyGenericList<T>
{
	//Add method is sorting each type that is in the list 
	//everytime a new type is added it sorts the generic list.
	@Override public void add(T word)
	{
		Node temp = head;
		if(head == null)
		{
			//The type is added as a head of the list
			//and checks if the current node in the list is null then it sets it to the 
			//next node as a head of the list.
			head = new Node(word);
			current = new Node(null);
			current.setNext(head);
			return;
		}
		//CompareTo method checks if the value of the head is greater than 0
		//then sets the current node to be the head of the list.
		if (head.getWord().compareTo(word) > 0)
		{
			Node curr = new Node(word);
			curr.setNext(head);
			head = curr;
		}
		while(temp.getNext()!=null)
		{
			//Getting the next nodes value from the list and checks if it is
			//less than 0 then that node is set to be the next node.
			if(temp.getNext().getWord().compareTo(word) < 0)
			{
				temp = temp.getNext();
			}
			else
			{
				//If the value above is not true then we set the current node
				//value to be the next node value in the list.
				Node curNode = new Node(word);
				curNode.setNext(temp.getNext());
				temp.setNext(curNode);
				return;
			}
		}
		Node newNode = new Node(word);
		temp.setNext(newNode);
	}
}