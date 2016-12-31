package board;

import java.util.List;

import board.light.Light;
import board.wall.Wall;
import image.Image;

public interface Board {

	/**
	 * @return width of the image
	 */
	public int getWidth();

	/**
	 * @return height of the image
	 */
	public int getHeight();
	
	/**
	 * @return a List of all light sources
	 */
	public List<Light> getLightList();

	/**
	 * @return a List of all walls
	 */
	public List<Wall> getWallList();
	
	/**
	 * @return an image of the light correctly shining on walls
	 */
	public Image computeImage();
	
}
