package com.stud;

import com.stud.factory.ComputerFactory;
import com.stud.factory.ComputerType;
import com.stud.factory.model.Computer;
import com.stud.singleton.Configuration;

public class App {
	public static void main(String[] args) {
		//singleton
		String projectName = Configuration.getInstance().getProperty("project_name");
		String firstPattern = Configuration.getInstance().getProperty("first_pattern");
		System.out.println("Project name: " + projectName + "\nFirst pattern: " + firstPattern);
		//factory
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "8 GB", "500 GB", "3 GHz");
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "32 GB", "4 TB", "4.2 GHz");
		System.out.println("PC config: " + pc);
		System.out.println("Server config: " + server);
	}
}
