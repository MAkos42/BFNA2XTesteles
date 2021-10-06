package com.teszteles2021.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.teszteles2021.core.exceptions.AjtokSzamaNemMegfeleloException;

public class AutoTest {
	
	@Test
	public void testAjtokSzamaMegfelelo() throws AjtokSzamaNemMegfeleloException {
		Auto a = new Auto();
		a.setAjtokSzama(3);
	}
	
	@Test(expected = AjtokSzamaNemMegfeleloException.class)
	public void testAjtokSzamaTulMagas() throws AjtokSzamaNemMegfeleloException {
		Auto a = new Auto();
		a.setAjtokSzama(6);
	}
	
	@Test(expected = AjtokSzamaNemMegfeleloException.class)
	public void TestAjtokSzamaTulAlacsony() throws AjtokSzamaNemMegfeleloException {
		Auto a = new Auto();
		a.setAjtokSzama(-1);
	}

}
