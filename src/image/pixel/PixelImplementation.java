package image.pixel;

public class PixelImplementation implements Pixel {
int r,g,b;

public PixelImplementation (int rR,int gG,int bB)
{r = rR;
g = gG;
b = bB;
	
}
	@Override
	public int getR() {
		
		return r;
	}

	@Override
	public int getG() {
				return g;
	}

	@Override
	public int getB() {
		
		return b;
	}

	@Override
	public void setAll(int R, int G, int B) {
		r = R;
		g = G;
		b = B;
		
	}

	@Override
	public void setR(int R) {
		r = R;
		
	}

	@Override
	public void setG(int G) {
		
		g = G;
		
	}

	@Override
	public void setB(int B) {
		b = B;
		
	}

}
