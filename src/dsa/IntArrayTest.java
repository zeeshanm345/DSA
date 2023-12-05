package dsa;

public class IntArrayTest {

	private int[] intArray;

	public IntArrayTest(int size) {

		intArray = new int[size];
	}

	public void traverse() {

		for (int i = 0; i < this.intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + this.intArray[i]);
		}
	}

	public void insert(int value) {

		this.intArray[0] = value;
	}

	public void insert(int value, int index) {
		this.intArray[index] = value;
	}

	public boolean search(int value) {

		for (int i = 0; i < this.intArray.length; i++) {
			if (this.intArray[i] == value) {
				System.out.println("found value " + value + " at index " + i);
				return true;
			}
		}

		return false;
	}

	public boolean update(int existingValue, int newValue) {

		boolean foundValue = false; // used to replace all occurances.
		for (int i = 0; i < this.intArray.length; i++) {
			if (this.intArray[i] == existingValue) {
				this.intArray[i] = newValue;
				// return true; // replaced first occurence
				foundValue = true;
			}
		}

		return foundValue;
	}

	public boolean delete(int value) {

		boolean isDeleted = false; // used to delete all occurances.
		for (int i = 0; i < this.intArray.length; i++) {
			if (this.intArray[i] == value) {
				this.intArray[i] = 0;
				// return true; // replaced first occurence
				isDeleted = true;
			}
		}

		return isDeleted;
	}

	public void display() {
		for (int i = 0; i < this.intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + this.intArray[i]);
		}
	}

}
