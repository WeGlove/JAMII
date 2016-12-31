package testpenis;

import org.junit.Test;

import board.BoardLib;
import board.light.Light;
import board.light.Lightimplementation;
import gui.GUI;
import gui.GUIImplementation;
import image.Image;
import image.ImageImplementation;

public class TestRayTrace {

	@Test
	public void TestRay(){
		Image Img = new ImageImplementation(100,100);
		Img.setBlack();
		
		Light l = new Lightimplementation(1,1);
		
		GUI g = new GUIImplementation();
		g.display(BoardLib.ray(Img, l, 20, 20));
		while (true){
			
		}
	}
}
