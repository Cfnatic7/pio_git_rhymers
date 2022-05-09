package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

// Klasa testuje implementację konkretnych odmian stosów
class RhymersDemo {

    private static final int COUNT_IN_MAX_VALUE = 15;
    private static final int RHYMERS_MAX_VALUE = 3;
    private static final int MAX_RAND_VALUE = 20;

    // funckcja main stanowi entry point programu
    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    /* testuje implementację konkretnych typów stosu
    * testuje 
    *
    *
    * */
    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < COUNT_IN_MAX_VALUE; i++)
            for (int j = 0; j < RHYMERS_MAX_VALUE; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < COUNT_IN_MAX_VALUE; i++)
            rhymers[RHYMERS_MAX_VALUE].countIn(rn.nextInt(MAX_RAND_VALUE));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[RHYMERS_MAX_VALUE]).reportRejected());
    }

}