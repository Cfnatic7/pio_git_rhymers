package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

// Jest to interfejs implementowany w klasie fabryki stosów (DefaultRhymersFactory)
	public interface Rhymersfactory {

		// deklaracja funkcji zwracającej standardowy stos
		public DefaultCountingOutRhymer getStandardRhymer();

		// deklaracja funkcji zwracającej standardowy stos
		public DefaultCountingOutRhymer getFalseRhymer();

		// deklaracja funkcji zwracającej kolejkę FIFO
		public DefaultCountingOutRhymer getFIFORhymer();

		// deklaracja funkcji zwracającej stos typu hanoi
		public DefaultCountingOutRhymer getHanoiRhymer();
		
	}
