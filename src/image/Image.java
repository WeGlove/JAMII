package image;

import image.pixel.Pixel;

public interface Image {

	/**
	 * Returns pixel at
	 * @param x
	 * @param y
	 * @return
	 */
	public Pixel getPixel(int x, int y);
	
	/**
	 * @return width of the image
	 */
	public int getWidth();

	/**
	 * @return height of the image
	 */
	public int getHeight();
}
