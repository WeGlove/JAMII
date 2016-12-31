package testpenis;
import org.junit.Test;
import board.wall.WallImplementation;
import board.wall.Wall;
import board.light.Light;
import board.light.Lightimplementation;
import image.pixel.PixelImplementation;
import image.pixel.Pixel;
import image.Image;
import image.ImageImplementation;
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
}
