package com.stud.adapter;

public class Volts {
	private int volts;
	
	public Volts(int volts) {
		this.volts = volts;
	}
	
	public int getVolts() {
		return volts;
	}
	
	public void setVolts(int volts) {
		this.volts = volts;
	}
	
	public String toString() {
		return "volts: " + volts;
	}
}
