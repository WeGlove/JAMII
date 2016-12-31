package board;

import image.Image;
import image.pixel.Pixel;

import java.util.ArrayList;
import java.util.List;

import board.light.Light;
import board.wall.Wall;

public class BoardLib {
	
	static final int R = 190;
	static final int G = 190;
	static final int B = 190;

	public static Image DrawWalls(Image Img, List<Wall> Walls){
		return null;
	}
	
	public static Image DrawWall(Image Img, Wall Wall){
		return null;
	}
	
	public static Image rayTraceAll(Image Img, List<Light> Lights){
		return null;
	}

	public static Image rayTrace(Image Img, Light Light){
		int x=Light.getX();
		int y=Light.getY();
		return null;
	}
	
	public static Image ray(Image Img, Light Light, int x, int y){
		int distX = x - Light.getX();
		int distY = y - Light.getY();
		double pitch = (distX/distY);
		
		Pixel pix;
		if (x<Light.getX())
		for (int i=x; i<=Light.getX(); i++){
			pix = Img.getPixel(x+i, y+(int) (pitch*(i-x)));
			pix.setAll(255, 255, 255);
		}
		else
		for (int i=Light.getX(); i<=Light.getX(); i++){
			pix = Img.getPixel(Light.getX()+i, y+(int) (pitch*(i-Light.getX())));
			pix.setAll(255, 255, 255);
		}
	
		return Img;
	};
	
	public static int value(int x){
		if (x<0)return ~x; else return x;
	}
	
	public static boolean isWall(Image Img, int x, int y){
		Pixel Pixel = Img.getPixel(x, y);
		if(Pixel.getR()==R && Pixel.getG()==G && Pixel.getR()==B) return true; 
		else return false;
	}
}
