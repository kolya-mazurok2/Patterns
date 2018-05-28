package com.stud.command;

public class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystem;
	
	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	public void execute() {
		this.fileSystem.openFile();
	}
}
