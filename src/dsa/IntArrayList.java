package dsa;

import java.util.ArrayList;

public class IntArrayList {

	private ArrayList<Integer> arrayList;

	public IntArrayList(int size) {
		arrayList = new ArrayList<Integer>(size);

	}

	public void traverse() {
		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println("arrayList (" + i + ")=" + arrayList.get(i));
		}
	}

	public void insert(int value, int index) {

		arrayList.add(index, value);

	}

	public void display() {
		for (int i = 0; i < arrayList.size(); i++) {
			Integer valueInteger = arrayList.get(i);
			System.out.println("arrayList (" + i + ")=" + valueInteger);
		}
	}

	public boolean search(int value) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == value) {
				System.out.println("Elemement found in index " + i + " value " + value);
				return true;
			}
		}
		return false;
	}

	public boolean update(int existingValue, int newValue) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == existingValue) {
				arrayList.set(i, newValue);
				return true;
			}

		}
		return false;
	}

	public boolean delete(int value) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == value) {
				arrayList.remove(i);
				return true;
			}
		}
		return false;
	}

}
