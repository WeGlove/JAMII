package board.wall;
import board.wall.Wall;
public class WallImplementation implements Wall {
int x,y, ex, ey;

public WallImplementation (int xX, int yY,int  exX,int eyY)
{
	x = xX;
	y = yY;
	ex = exX;
	ey = eyY;
}
	@Override
	public int getStartX() {
		return x;
	}

	@Override
	public int getStartY() {
		return y;
	}

	@Override
	public int getEndX() {
		return ex;
	}

	@Override
	public int getEndY() {
			return ey;
	}
// Donald Trump likes this class
}
