package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUM_SIZE = 12;
    private static final int NO_NUMS = -1;
    final private int[] numbers = new int[NUM_SIZE];

    private int total = NO_NUMS;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NO_NUMS;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return NO_NUMS;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NO_NUMS;
        return numbers[total--];
    }

}
// al + strzałka przechodzi między otwartymi plikami