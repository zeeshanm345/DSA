package dsa;

import java.util.LinkedList;

public class LinklistTest {

	private LinkedList<Integer> linkedList;

	public LinklistTest() {
		linkedList = new LinkedList<Integer>();

	}

	public void insert(int value) {
		linkedList.add(value);
	}

	public void traverse() {
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println("Linklist (" + i + ")=" + linkedList.get(i));
		}
	}

	public boolean search(int element) {
		if (linkedList.contains(element)) {
			System.out.println("Element found at " + linkedList.indexOf(element));
		}
		return false;

	}

	public void update(int existingValue, int newValue) {

		for (int i = 0; i < linkedList.size(); i++) {
			if (linkedList.get(i) == existingValue) {
				linkedList.set(i, newValue);
			}
		}
	}

	public void delete(int value) {
		for (int i = 0; i < linkedList.size(); i++) {
			if (linkedList.get(i) == value) {
				linkedList.remove(i);
			}
		}
	}

}
