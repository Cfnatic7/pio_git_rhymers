package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();

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
