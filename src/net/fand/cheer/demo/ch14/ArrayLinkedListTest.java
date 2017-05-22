package net.fand.cheer.demo.ch14;

public class ArrayLinkedListTest {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(array[4]);
		Linked prev = new Linked();
		prev.setValue(11);
		int i = 0;
		prev.setValue(1);

		Linked first = prev;
		while (i <= 10) {
			Linked next = new Linked();
			next.setValue(i);
			prev.setNext(prev);
			i++;
		}

		Linked obj = new Linked();
		obj.setValue(i);

		Linked next = new Linked();
		next.setValue(2);
		obj.setNext(next);
		System.out.println(first);
	}
}

class Linked {
	private int value;
	private Linked next;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Linked getNext() {
		return next;
	}

	public void setNext(Linked next) {
		this.next = next;
	}

}