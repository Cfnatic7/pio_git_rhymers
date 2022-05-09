package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

//wszystkie testy przechodzą poprawnie

/*
Jest to klasa testująca implementację metod klasy DefaultCountingOutRhymer
*/
public class RhymersJUnitTest {

    private static final int TEST_VALUE = 888;

    // testuje odkładanie wartości na stos i zwracanie najwyższej wartości
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    // testuje sprawdzanie czy stos jest pusty
    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    // testuje sprawdzanie czy stos jest pełny
    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(TEST_VALUE);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    // testuje zwracanie ostatniej położonej wartości na stosie i NO_NUMS gdy stos jest pusty
    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    // testuje zwracanie i usuwanie ostatniej położonej wartości na stosie
    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
