package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

// Klasa testuje implementację konkretnych odmian stosów
class RhymersDemo {
    // TODO: change the name of this class to StackDemo and similarly its attributes

    private static final int COUNT_IN_MAX_VALUE = 15;
    private static final int RHYMERS_MAX_VALUE = 3;
    private static final int MAX_RAND_VALUE = 20;

    // funkcja main stanowi punkt wejściowy programu
    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    /* testuje implementację konkretnych typów stosu*/
    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        // wypełnia stosy
        for (int i = 1; i < COUNT_IN_MAX_VALUE; i++)
            for (int j = 0; j < RHYMERS_MAX_VALUE; j++)
                rhymers[j].countIn(i);

        //testuje stos typu hanoi, potrzebne to jest do zwracania atrybuty totalRejected
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < COUNT_IN_MAX_VALUE; i++)
            rhymers[RHYMERS_MAX_VALUE].countIn(rn.nextInt(MAX_RAND_VALUE));

        // zrzuca i zwraca wartość z góry stosu ze wszystkich stosów i wyświetla te wartości
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        // pobiera atrybut totalRejected ze stosu typu hanoi
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[RHYMERS_MAX_VALUE]).reportRejected());
    }

}