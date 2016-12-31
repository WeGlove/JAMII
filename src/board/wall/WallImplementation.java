package board.wall;
import board.wall.Wall;
public class WallImplementation implements Wall {
int x,y, ex, ey;

public WallImplementation (int xX, int yY,int  exX,int eyY)
{ if (xX >= 0)
	x = xX;
else
{
	x = ~xX;
}
if (yY >= 0)
	y = yY;
else
	y = ~yY;
if (exX >= 0)
	ex = exX;
else
	ex = ~exX;
if (eyY >= 0)
	ey = eyY;
else 
	ey = ~eyY;
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
