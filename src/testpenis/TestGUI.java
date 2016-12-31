package testpenis;

import org.junit.Test;

import gui.GUI;
import gui.GUIImplementation;

public class TestGUI {

	@Test
	public void TestGUIDisplayNull(){
		GUI g = new GUIImplementation();
		g.display(null);
	}
	
	@Test
	public void TestGUIDisplay(){
		GUI g = new GUIImplementation();
		g.display(null);//Warte auf Image
	}
	
}
