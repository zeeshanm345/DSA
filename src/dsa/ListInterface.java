package dsa;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	private List<Integer> list;

	public ListInterface(int size) {
		list = new ArrayList<Integer>(size);
	}

	public void insert(int value, int index) {
		list.add(index, value);
	}

	public void traverse() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("List(" + i + ") =" + list.get(i));
		}
	}

	public void search(int value) {
		for (int i = 0; i < list.size(); i++) {
			if (value == list.get(i)) {
				System.out.println("Fount value at index " + i + " Value " + list.get(i));
			}
		}
	}

	public boolean update(int existingValue, int newValue) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == existingValue) {
				list.set(i, newValue);
				return true;
			}
		}
		return false;
	}

	public boolean delete(int value) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == value) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

}
