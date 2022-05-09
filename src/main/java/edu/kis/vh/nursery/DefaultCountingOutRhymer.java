package edu.kis.vh.nursery;

// Klasa stanowi domyślną implementację stosu
public class DefaultCountingOutRhymer {

    private static final int NUM_SIZE = 12;

    // TODO: NO_NUMS should be 0
    private static final int NO_NUMS = -1;
    final private int[] numbers = new int[NUM_SIZE];

    private int total = NO_NUMS;

    // zwraca indeks ostatniego położonego elementu na stosie
    public int getTotal() {
        return total;
    }


    // odkłada element na stosie, gdy nie jest on wypełniony
    public void countIn(int in) {
        // TODO: change method name to push, change numbers[++total] to numbers[total++]
        if (!isFull())
            numbers[++total] = in;
    }

    // sprawdza czy stos jest pusty
    public boolean callCheck() {
        // TODO: change method name to isEmpty
        return total == NO_NUMS;
    }

    // sprawdza czy stos jest pełny
    public boolean isFull() {
        // TODO: the comparison below should be total == NUM_SIZE
        return total == 11;
    }

    // zwraca ostatnią położoną wartość na stosie, w przypadku gdy stos jest pusty zwraca NO_NUMS
    protected int peekaboo() {
        // TODO: the current method name is really bad, should be changed to getFront
        if (callCheck())
            return NO_NUMS;
        return numbers[total];
    }

    // zwraca ostatnią położoną wartość na stosie i zrzuca ją ze stosu
    public int countOut() {
        // TODO: change method name to pop, and it should return numbers[--total]
        if (callCheck())
            return NO_NUMS;
        return numbers[total--];
    }

}
// al + strzałka przechodzi między otwartymi plikami