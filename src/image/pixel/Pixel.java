package image.pixel;

public interface Pixel {

	/**
	 * @return the red part of the pixel
	 */
	public int getR();
	
	/**
	 * @return the green part of the pixel
	 */
	public int getG();
	
	/**
	 * @return the blue part of the pixel
	 */
	public int getB();
	
	/**
	 * Sets color parts to
	 * @param R for red
	 * @param G for green
	 * @param B for blue
	 */
	public void setAll (int R, int G, int B);
	
	/**
	 * Sets color parts to
	 * @param R for red
	 */
	public void setR(int R);
	
	/**
	 * Sets color parts to
	 * @param G for green
	 */
	public void setG(int G);
	
	/**
	 * Sets color parts to
	 * @param B for blue
	 */
	public void setB(int B);
}
