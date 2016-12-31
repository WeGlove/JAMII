package board.wall;

public interface Wall {

	/**
	 * @return get starting position x
	 */
	public int getStartX();

	/**
	 * @return get starting position y
	 */
	public int getStartY();
	
	/**
	 * @return get ending position x
	 */
	public int getEndX();
	
	/**
	 * @return get ending position y
	 */
	public int getEndY();
	
}
