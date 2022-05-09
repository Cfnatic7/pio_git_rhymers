package edu.kis.vh.nursery;

//Klasa implementuje stos typu FIFO, czyli kolejkę
public class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

    // odwraca ułożenie elementów na stosie i zwraca element na samej górze. Jest to implementacja FIFO (first in first out)
    @Override
    public int countOut() {
        while (!callCheck())

            rhymer.countIn(super.countOut());

        int ret = rhymer.countOut();

        while (!rhymer.callCheck())

            countIn(rhymer.countOut());

        return ret;
    }
}
