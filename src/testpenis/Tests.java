package testpenis;
import org.junit.Test;
import board.wall.WallImplementation;
import gui.GUI;
import board.wall.Wall;
import board.light.Light;
import board.light.Lightimplementation;
import image.pixel.PixelImplementation;
import image.pixel.Pixel;
import image.Image;
import image.ImageImplementation;
import board.Board;
import gui.GUIImplementation;
import board.BoardLib;
public class Tests {//Penis
	
	@Test
	public void WallTestnegint () {
		int T;
		Wall w = new WallImplementation ( ~1, ~2, ~3, ~4);
		T = w.getStartX();
		assert (T == 1);
	}
	@Test
	public void LightTestnegint () {
		int T;
		Light L = new Lightimplementation (~1, ~2);
		T = L.getX();
		assert (T == 1);
	}
	
	@Test 
	public void TestgetR () {
		int T;
		Pixel p = new PixelImplementation ( 0 , 1 , 2);
		T = 0;
		assert (p.getR() == T);
	}
	

	@Test 
	public void TestsetR () {
		int T;
		Pixel p = new PixelImplementation ( 0 , 1 , 2);
		T = 42;
		p.setR(T);
		assert (p.getR() == T);
	}
	@Test
	public void Testgetwidth () {
	int T;
	Image I = new ImageImplementation (42, 43);
	T = 42;
	assert (I.getWidth() == T);
	
	
	
	}
	@Test
	public void Testwrongcoordinates () {
		Image I = new ImageImplementation (1,2);
		assert (I.getPixel(3, 2) == null);
	}
	
	@Test
	public void TestArray () {
		
		
		Image I  = new ImageImplementation (3,4);
		assert (I.getPixel(1, 2) != null);
		
	}
	
	@Test 
	public void TestsetPixel () {
		Image I = new ImageImplementation (3,4);
		Pixel p = new PixelImplementation (42, 42, 42);
		I.setPixel(1, 2, p);
		assert (I.getPixel(1, 2).getR() == 42);
	}
	
	@Test
	public void Testsetwrongcoordinates () {
		Image I = new ImageImplementation (3,4);
		Pixel p = new PixelImplementation (42, 42, 42);
		I.setPixel(0, 6, p);
		assert (I.getPixel(0, 0).getR() == 42);
	}
	
	@Test
	public void Testotherspot () {
		Image I = new ImageImplementation (3,4);
		Pixel p = new PixelImplementation (42, 42, 42);
		I.setPixel(1, 2, p);
		assert (I.getPixel(1, 0).getR() == 0);
	}
	
	@Test
	public void TestDrawWall () {
		Image I = new ImageImplementation (100,100);
		Wall W = new WallImplementation (1,1,10,10);
		I = BoardLib.DrawWall (I, W);
		assert (I.getPixel(2, 2).getR() == 190);
	}
	
	@Test
	public void TestOppositeWall () {
		Image I = new ImageImplementation (100,100);
		Wall W = new WallImplementation (10,10,1,1);
		I = BoardLib.DrawWall (I, W);
	
		assert (I.getPixel(2, 2).getR() == 190);

	}
}
