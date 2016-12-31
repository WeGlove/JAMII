package testpenis;
import org.junit.Test;
import board.wall.WallImplementation;
import board.wall.Wall;
import board.light.Light;
import board.light.Lightimplementation;
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
}
