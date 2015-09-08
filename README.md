Assignment due 23:55, 29th July, 2015
===============================

**Please clone this repository, and remember to set your clone so that it is private**. You will 
need to upload a copy of your completed code to moodle prior to the submission time. We will 
be marking the code you upload to moodle, but will be referencing your repository and commit 
messages, so please ensure that you do not delete the repository following submission.

This assignment consists of 4 major parts. Each part represents a portion of your total grade, 
and consists of a combination of coding and writing tasks. As you work on this assignment, 
remember to commit regularly so that progress can be seen. Ensure you comment and document 
your code.  There are also questions asked in the text below.  Your finished assigment will
include a markdown document "Implementation Explanation" in file [Explanation.md](Explanation.md).

Part 1
------

For the first part of this assignment, you need to create a list class that stores strings.

### Step 1
Create an interface called `MyStringListInterface` inside a file called `MyStringListInterface.java`. 
Within this interface, you should provide the following functionality.
   
```
clear    - Remove all items from the List
add      - Add an item to the end of the List
find     - Find an item in the List
iterator - A way of iterating over the items in the List
remove   - Remove an element from the List
count    - Return the number of elements in the List
```

These functions have been left deliberately vague as to their arguments and return types. 
Make a decision yourself as to how you believe these functions should work, and explain your
decisions in a well labeled section in the [Implementation Explanation](Explanation.md) file.
You are free to choose names, if needed, that you consider appropriate for each function.


### Step 2
Create a class called `MyStringList` inside a file called `MyStringList.java`. 
In this class, you should make your own implementation of the interface you created in the previous step. Internally, 
your implementation should store items as a Linked List. Do not use any built-in classes for your implementation, you are
required
to implement this yourself.

You should now be able to add and remove Strings from a list. In order to prove that 
everything works, write some code that demonstrates your code functioning in the 
[Tester](Tester.java) file.





Part 2
------

Create a new interface called `MyIntegerListInterface` and an implementation of that 
interface called MyIntegerList in appropriately named Java files. In these files, 
reimplement the List you made in part 1 to store Integers rather than Strings. In order to prove that 
everything works, add some code that demonstrates your new code functioning to the [Tester](Tester.java) file.




Part 3
------

It should be apparent at this point that creating a new version of your List class for each type that 
you may want to store is not the best approach. Rather writing

```java
MyStringList stringList = new MyStringList();
MyIntegerList intList = new MyIntegerList();
```

You may want to write

```java
MyList<String> stringList = new MyList<String>();
MyList<Integer> intList = new MyList<Integer>();
```

This can be accomplished through the use of Generics. 

### Step 1

Create a new interface called `MyGenericListInterface` in a file called `MyGenericListInterface.java`. In this
make a new version of your original interface that uses generic types so as to be applicable to lists of Strings, Integers,
or anything else.  Make a class MyGenericList that implements the new interface.  In order to prove that everything works, 
write some new code that demonstrates the use of the generic list with both Strings and integers.
The new test code should be added to your [Tester](Tester.java) file.

### Step 2

In a in a well labeled section in the [Implementation Explanation](Explanation.md) file, 
briefly explain what advantages or disadvantages using Generics here has, when compared 
with writing an implementation for each type. 


Part 4
------

Usually we think of a list as a sequence of items that can be accessed in the order
in which they were inserted.  Sometimes, however, the data may have a natural order
of its own.  For example, we can put strings in alphabetical order or integers in 
numeric order.  A useful form of list is one which maintains items in their own
natural order.  The interface and implementations you have created so far keep data
in the order in which it was entered.  In this part you are required to create a
subclass of MyGenericList called MyGenericSortedList which keeps data in its 
natural sorted order.  You may like to proceed by first making a subclass of
MyStringList called MyStringSortedList; then consider the issues involved in building
this into the generic version.

You should consider the question:  Do all types have a 'natural order'?  What if
we had a list of Rectangles for example?  How does the generic mechanism in Java
allow you to require or specify that the items in your list can be sorted?  Add a
section to [Implementation Explanation](Explanation.md) explaining how you used Java 
generics in your implementation.
