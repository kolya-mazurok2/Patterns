package com.stud.factory;

import com.stud.factory.model.Computer;
import com.stud.factory.model.PC;
import com.stud.factory.model.Server;

public class ComputerFactory {
	public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {
		if(ComputerType.PC.equals(type)) {
			return new PC(ram, hdd, cpu);
		}
		else if(ComputerType.SERVER.equals(type)) {
			return new Server(ram, hdd, cpu);
		}
		
		return null;
	}
}
