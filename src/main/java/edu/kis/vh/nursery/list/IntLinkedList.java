package edu.kis.vh.nursery.list;

// Klasa implementuje listę dwukierunkową
public class IntLinkedList {
	class Node {

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

	private static final int EMPTY_LIST = -1;
	private Node last;

	//TODO: delete this attribute, it's unused
	private int i;

	// rozszerza listę o kolejny węzeł
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	// sprawdza czy lista nie jest pusta
	public boolean isEmpty() {
		return last == null;
	}

	// sprawdza czy lista nie jest pełna (zawsze zwraca false, gdyż nie ma górnego ograniczenia rozmiaru)
	public boolean isFull() {
		return false;
	}

	// zwraca wartość ostatniego węzła, lub EMPTY_LIST gdy lista jest pusta
	public int top() {
		if (isEmpty())
			return EMPTY_LIST;
		return last.getValue();
	}

	// usuwa ostatni węzeł zmniejszając tym samym listę i zwraca wartość w usuniętym węźle
	// w przypadku gdy lista jest pusta zwraca EMPTY_LIST
	public int pop() {
		if (isEmpty())
			return EMPTY_LIST;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
