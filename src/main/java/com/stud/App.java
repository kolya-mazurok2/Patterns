package com.stud;

import com.stud.singleton.Configuration;

public class App {
	public static void main(String[] args) {
		String projectName = Configuration.getInstance().getProperty("project_name");
		String firstPattern = Configuration.getInstance().getProperty("first_pattern");
		System.out.println("Project name: " + projectName + "\nFirst pattern: " + firstPattern);
	}
}
