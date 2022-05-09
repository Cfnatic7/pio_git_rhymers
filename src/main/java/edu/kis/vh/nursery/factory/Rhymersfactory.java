package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

// Jest to interfejs implementowany w klasie fabryki stosów (DefaultRhymersFactory)
	public interface Rhymersfactory {
	// TODO: change the name of this interface to StackFactory

		// deklaracja funkcji zwracającej standardowy stos
		public DefaultCountingOutRhymer getStandardRhymer();
	// TODO: change the name of this method to getStandardStack

		// deklaracja funkcji zwracającej standardowy stos
		public DefaultCountingOutRhymer getFalseRhymer();
	// TODO: change the name of this method to getFalseStack

		// deklaracja funkcji zwracającej kolejkę FIFO
		public DefaultCountingOutRhymer getFIFORhymer();
	// TODO: change the name of this method to getFIFOStack

		// deklaracja funkcji zwracającej stos typu hanoi
		public DefaultCountingOutRhymer getHanoiRhymer();
	// TODO: change the name of this method to getHanoiStack
		
	}
