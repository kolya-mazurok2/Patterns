package com.stud.proxy;

public class ImageProxy implements Image{
	private String imageFilePath;
	private Image profixiedImage;
	
	public ImageProxy(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	
	public void showImage() {
		profixiedImage = new HighResolutionImage(imageFilePath);
		profixiedImage.showImage();
	}
}
