package com.stud.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
	public Volts get120Volts() {
		return getVolts();
	}
	
	public Volts get12Volts() {
		Volts v = getVolts();
		return convertVolts(v, 10);
	}
	
	public Volts get3Volts() {
		Volts v = getVolts();
		return convertVolts(v, 40);
	}
	
	public Volts convertVolts(Volts v, int i) {
		return new Volts(v.getVolts() / i);
	}
}
