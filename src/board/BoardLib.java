package board;

import image.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import board.light.Light;
import board.wall.Wall;

public class BoardLib {
	
	static final int R = 190;
	static final int G = 190;
	static final int B = 190;

	public static Image DrawWalls(Image Img, List<Wall> Walls){
		ListIterator <Wall> I = Walls.listIterator();
		while (I.hasNext())
		{
			DrawWall(Img, I.next());
		}
		return Img;
	}
	
	public static Image DrawWall(Image Img, Wall Wall){
		int m,sx,ex,sy,ey;
		sx = Wall.getStartX();
		sy = Wall.getStartY();
		ex = Wall.getEndX();
		ey = Wall.getEndY();
		m = (ey - sy) / (ex - sx);
		if (sx <= ex)
		{m = (ey - sy) / (ex - sx);
			while (sx <= ex)
		{ Img.getPixel(sx, sy).setAll(R, G, B);
		sx++;
		sy = sy + m;
			
		}}
		else
		{m = (sy - ey)  / (sx - ex);
			while (ex <= sx)
			{ Img.getPixel(ex, ey).setAll(R, G, B);
			ex++;
			ey = ey + m;
				
			}
		}
		return Img;
	}
	
	public static Image rayTraceAll(Image Img, List<Light> Lights){
		return null;
	}

	public static Image rayTrace(Image Img, Light Light){
		return null;
	}
	
	public static boolean isWall(Image Img, int x, int y){
		return false;
	}
}
