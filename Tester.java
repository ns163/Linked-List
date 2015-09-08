//Name: Nikhil Sethi
//ID: 1213414
//COMP242 - Assignment Two

/*The tester file is test all the methods have been excuted 
 *properly. The tester files contains MyStringList, MyGenericList,
 *MyGenericSortList, and MyIntegerLst and this test all the fucntions
 *in the file by adding String, int and types to list and then outputing 
 *the result using system.out.println
 */

public class Tester 
{
		public static void main(String[] args) 
	{
		TestMyStringList();
		TestMyIntegerList(); 
		TestMyGenericList();
		TestMyGenericSortList();
	}
//............................................SORTED LIST................................
private static void TestMyGenericSortList()
{
	System.out.println("This is the MyGenericSortList.................................");

	MyGenericSortList<String> sortList = new MyGenericSortList<String>();

		sortList.add("1");
		sortList.add("2");
		sortList.add("3");
		sortList.add("Hello");
		sortList.add("Everyone");

		for (int i = 0; i < sortList.count(); i++) 
		{
			System.out.println(sortList.iterator());
		}

		System.out.println("The total number of words in the list: " + sortList.count());	
		System.out.println("This shows first word in the list: " + sortList.iterator()+"\n");	
		System.out.println(("Word 'Hello' was found"));
		System.out.println(sortList.find("Hello")+"\n");	
		sortList.remove("Hello");
		System.out.println("Next word in the list: "+sortList.iterator());
		sortList.clear();
		System.out.println("List is empty now: " + sortList.count());	
}
//............................................STRING LIST................................
	private static void TestMyStringList() 
	{
		System.out.println("This is the MyStringList.................................");
		MyStringList myList = new MyStringList();

		myList.add("Hello");
		myList.add("Everyone");
		myList.add("This");
		myList.add("Programs");
		myList.add("Works");

		for (int i = 0; i < myList.count(); i++) 
		{
			System.out.println(myList.iterator());
		}

		System.out.println("The total number of words in the list: " + myList.count());	
		System.out.println("This shows first word in the list: " + myList.iterator()+"\n");	
		System.out.println(("Word 'Hello' was found"));
		System.out.println(myList.find("Hello")+"\n");	
		myList.remove("Hello");
		System.out.println("Next word in the list: "+myList.iterator());
		myList.clear();
		System.out.println("List is empty now: " + myList.count()+"\n");	

		
	}
//............................................INTEGER LIST................................
	private static void TestMyIntegerList() 
	{
		System.out.println("This is the MyIntegerList.................................");
		MyIntegerList intList = new MyIntegerList();

		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		for (int i = 0; i < intList.count(); i++) 
		{
			System.out.println(intList.iterator());
		}

		System.out.println("The total number of words in the list: " + intList.count());	
		System.out.println("This shows first word in the list: " + intList.iterator()+"\n");	
		System.out.println(("Word 'Hello' was found"));
		System.out.println(intList.find(1)+"\n");	
		intList.remove(2);
		System.out.println("Next word in the list: "+intList.iterator());
		intList.clear();
		System.out.println("List is empty now: " + intList.count()+"\n");	
	}

//............................................GENERIC LIST................................	
	private static void TestMyGenericList() 
	{
		System.out.println("This is the MyGenericList.................................");
			
		MyGenericList<String> genList = new MyGenericList<String>();

		genList.add("1");
		genList.add("2");
		genList.add("3");
		genList.add("Hello");
		genList.add("Everyone");

		for (int i = 0; i < genList.count(); i++) 
		{
			System.out.println(genList.iterator());
		}

		System.out.println("The total number of words in the list: " + genList.count());	
		System.out.println("This shows first word in the list: " + genList.iterator()+"\n");	
		System.out.println("Word 'Generic List' was found " + "= " + genList.find("Generic List ")+"\n");	
		genList.remove("Hello");
		System.out.println("Next word in the list: "+genList.iterator());
		genList.clear();
		System.out.println("List is empty now: " + genList.count()+"\n");	
	}
}