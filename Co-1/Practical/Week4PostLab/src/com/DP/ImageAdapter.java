package com.DP;

public class ImageAdapter implements ImageViewer{
private ImageViewer advancedImageViewer;
public ImageAdapter(ImageViewer advancedImageViewer) {
	this.advancedImageViewer = advancedImageViewer;
}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Image viewer");
		advancedImageViewer.displayAdvancedImage();
	}
	public void imageAdapter(String imageType) {
		if(imageType.equalsIgnoreCase("advanced")) {
			System.out.println("Handling advanced image format");
		}
		else {
			System.out.println("Handling basic image format");
		}
	}
	@Override
	public void displayAdvancedImage() {
		// TODO Auto-generated method stub
		System.out.println("This is image viewer");
	}

}
