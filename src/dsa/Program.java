package dsa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntArrayTest intArrayTest = new IntArrayTest(5);

		// insert
		intArrayTest.insert(123, 0);
		intArrayTest.insert(124, 1);
		intArrayTest.insert(125, 2);
		intArrayTest.insert(126, 3);
		intArrayTest.insert(127, 4);

		// display
		System.out.println("=== Display Array");
		intArrayTest.display();

		// search
		System.out.println("=== Search 124 in Array");
		boolean found = intArrayTest.search(124);

		// update
		System.out.println("=== Update  124 to 129");
		intArrayTest.update(124, 129);
		intArrayTest.display();

		// delete
		System.out.println("=== Delete 129");
		intArrayTest.delete(129);
		intArrayTest.display();

		System.out.println("=====ArrayList=====");

		IntArrayList intArrayList = new IntArrayList(5);
		intArrayList.insert(110, 0);
		intArrayList.insert(120, 1);
		intArrayList.insert(130, 2);
		intArrayList.insert(140, 3);
		intArrayList.insert(150, 4);

		System.out.println("=====Display Arrylist");
		intArrayList.display();

		System.out.println("=====Search In Arrylist");
		intArrayList.search(130);

		System.out.println("=====update In Arrylist");
		intArrayList.update(150, 160);
		intArrayList.display();

		System.out.println("=====Delete In Arrylist");
		intArrayList.delete(130);
		intArrayList.display();

		System.out.println("=====List=====");

		ListInterface listInterface = new ListInterface(5);
		listInterface.insert(110, 0);
		listInterface.insert(120, 1);
		listInterface.insert(130, 2);
		listInterface.insert(140, 3);
		listInterface.insert(150, 4);

		listInterface.traverse();

		System.out.println("=====Search In List");
		listInterface.search(130);

		System.out.println("=====update In List");
		listInterface.update(140, 160);
		listInterface.traverse();

		System.out.println("=====Delete In List");
		listInterface.delete(160);
		listInterface.traverse();

		System.out.println("=====Linklist=====");

		LinklistTest linklistTest = new LinklistTest();

		linklistTest.insert(110);
		linklistTest.insert(120);
		linklistTest.insert(130);
		linklistTest.insert(140);
		linklistTest.insert(150);

		System.out.println("=====Display Linklist");

		linklistTest.traverse();

		System.out.println("=====Search In Linklist");
		linklistTest.search(130);

		System.out.println("=====update In Linklist");

		linklistTest.update(110, 160);
		linklistTest.traverse();

		System.out.println("=====Delete In Linklist");
		linklistTest.delete(160);
		linklistTest.traverse();

	}

}
