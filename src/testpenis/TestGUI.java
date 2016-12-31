package testpenis;

import org.junit.Test;

import gui.GUI;
import gui.GUIImplementation;
import image.Image;
import image.ImageImplementation;

public class TestGUI {

	@Test
	public void TestGUIDisplayNull(){
		GUI g = new GUIImplementation();
		g.display(null);
	}
	
	@Test
	public void TestGUIDisplay(){
		GUI g = new GUIImplementation();
		Image i = new ImageImplementation(100,100);
		g.display(i);
		while(true){
		}
	}
	
	
}
