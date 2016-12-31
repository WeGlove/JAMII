package image;
import image.Image;
import image.pixel.Pixel;
import image.pixel.PixelImplementation;
public class ImageImplementation implements Image {
	int w, h;
	Pixel [] [] a;
	public  ImageImplementation (int wW , int hH)
	{int i1, i2;
	i1 = 0;
	i2 = 0;
		w = wW;
		h = hH;
		 a = new Pixel [w][h];
		while (i1 < w)
		{
			while ( i2 < h)
			{
				a [i1] [i2] = new PixelImplementation (0,0,0);
				i2++;
			}
			i2 = 0;
			i1++;
		}
	}

	@Override
	public Pixel getPixel(int x, int y) {
		if ((x < w) &&  (y <h))
		return a [x] [y];
		else
			return null;
	}

	@Override
	public int getWidth() {
		
		return w;
	}

	@Override
	public int getHeight() {
		return h;
		
	}

	@Override
	public void setPixel(int x, int y, Pixel p) {
		if ((x < w) &&  (y <h))
			a [x] [y] = p;
		else a [0] [0] = p;
		
	}

	@Override
	public void setBlack() {
		int i1,i2;
		i1 = 0;
		i2 = 0;
		while (i1 < w)
		{
			while ( i2 < h)
			{
				a [i1] [i2] = new PixelImplementation (0,0,0);
				i2++;
			}
			i2 = 0;
			i1++;
		}
	}

}
