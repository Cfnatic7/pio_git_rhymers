package edu.kis.vh.nursery.list;

// Klasa Node odpowiada za węzeł, który się umieszcza w implementacji listy dwukierunkowej (w tym przypadku)
public class Node {

	private int value;
	private Node prev;
	private Node next;

	// konstruktor inicjujący węzeł z konkretną wartością
	public Node(int i) {
		this.value = i;
	}

	// getter dla wartości w węźle
	public int getValue() {
		return value;
	}

	// getter dla poprzedniego węzła
	public Node getPrev() {
		return prev;
	}

	// ustawia wskaźnik na poprzedni węzeł
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	// getter dla następnego węzła
	public Node getNext() {
		return next;
	}

	// ustawia wskaźnik na następny węzeł
	public void setNext(Node next) {
		this.next = next;
	}
}
