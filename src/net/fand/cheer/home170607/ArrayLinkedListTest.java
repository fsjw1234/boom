package net.fand.cheer.home170607;

public class ArrayLinkedListTest {
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,5,6};
		System.out.println(array[4]);
		
		Linked prev=new Linked();
		prev.setValue(1);
		Linked first=prev;
		System.out.println(first);
		System.out.println(prev.getValue());
	
	}
}

class Linked{
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