package com.teszteles2021.core.exceptions;

public class AjtokSzamaNemMegfeleloException extends Exception {
	
	public AjtokSzamaNemMegfeleloException(int ajtokSzama) {
		super(String.valueOf(ajtokSzama));
	}
}
