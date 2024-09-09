package com.DP;

public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AdvancedImageViewer PngShower = new PngShower();
    AdvancedImageViewer JpgShower = new JpgShower();
    ImageViewer galleryApp = new GalleryApp();
    ImageAdapter imageAdapter = new ImageAdapter(galleryApp);
    galleryApp.show();
    imageAdapter.show();
    imageAdapter.imageAdapter("advanced");
    PngShower.showPNG();
    JpgShower.showJPG();
	}

}
