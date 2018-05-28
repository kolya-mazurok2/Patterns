package com.stud.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	private Socket sock = new Socket();
	
	public Volts get120Volts() {
		return sock.getVolts();
	}
	
	public Volts get12Volts() {
		Volts v = sock.getVolts();
		return convertVolts(v,10);
	}
	
	public Volts get3Volts() {
		Volts v = sock.getVolts();
		return convertVolts(v,40);
	}
	
	public Volts convertVolts(Volts v, int i) {
		return new Volts(v.getVolts() / i);
	}
}
