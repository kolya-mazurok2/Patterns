package com.stud.proxy;

public class HighResolutionImage implements Image {
	public HighResolutionImage(String imageFilePath) {
		loadImage(imageFilePath);
	}
	
	private void loadImage(String imageFilePath) {
		//loading here
	}
	
	public void showImage() {
		//rendering logic
	}
}
