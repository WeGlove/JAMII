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
	/**
	 *  Sets the RGB value of the Pixel @ x y to p's;
	 * @param x the Pixel's x coordinate 
	 * @param y the Pixel'S y coordinate
	 * @param p The Pixel containing replacemnet data
	 */
	public void setPixel (int x , int y, Pixel p); 
}
