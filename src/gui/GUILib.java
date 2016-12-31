package gui;

import java.awt.image.BufferedImage;

import image.Image;

public class GUILib{

	public static BufferedImage ImgToBufImg(Image image){
		BufferedImage BufImg = new BufferedImage(image.getWidth(), image.getHeight(), 1);
		for(int x=0; x<image.getWidth(); x++){
			for(int y=0; y<image.getHeight(); y++){	
				BufImg.setRGB(x, y, (image.getPixel(x, y).getR()<<16) | 
									(image.getPixel(x, y).getG()<<8)  | 
									 image.getPixel(x, y).getB());
			}
		}
		return BufImg;
	}
	
}
