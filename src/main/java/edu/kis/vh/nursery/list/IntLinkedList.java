package edu.kis.vh.nursery.list;

// Klasa implementuje listę dwukierunkową
public class IntLinkedList {

	private static final int EMPTY_LIST = -1;
	private Node last;
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
