package edu.kis.vh.nursery;



// klasa HanoiRhymer jest typem stosu, który przyjmuje na swój wierzch tylko te wartości,
// które są mniejsze lub równe od poprzedniej wartości
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    // zwraca liczbę nieprzyjętych wartości w countIn
    public int reportRejected() {
        return totalRejected;
    }

    // odkłada wartość na stosie, wtedy gdy dana wartość jest mniejsza lub równa od poprzedniej, lub gdy stos jest pusty
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
// linie 5, 12, 14, 16 były źle sformatowane
