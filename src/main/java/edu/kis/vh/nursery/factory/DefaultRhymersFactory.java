package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

// Klasa jest fabryką stosów. Jej metody zwracają konkretne rodzaje stosów
public class DefaultRhymersFactory implements Rhymersfactory {

	// implementacja funkcji zwracającej standardowy stos
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	// implementacja funkcji zwracającej standardowy stos
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	// implementacja funkcji zwracającej kolejkę FIFO
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	// implementacja funkcji zwracającej standardowy stos typu hanoi
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
