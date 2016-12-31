package board.light;
import board.light.Light;
public class Lightimplementation implements Light {
int x,y;
	
public Lightimplementation (int xX, int yY)
{ 
	if (xX >= 0)
	x = xX;
	else 
	{
		x = ~xX;
	}
	if (yY >= 0)
y = yY;
	else
	{
		y = ~yY;
	}
	
}
@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

}
