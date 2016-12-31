package board;

import java.util.ArrayList;
import java.util.List;

import board.light.Light;
import board.wall.Wall;
import image.Image;

public class BoardImplementation implements Board {

	int width, height;
	List <Light> LightList;
	List <Wall> WallList;
	
	public BoardImplementation(int width, int height){
		if (width < 1 || height < 1) {
			this.width  = 1;
			this.height = 1;
		}
		else {
			this.width  = width;
			this.height = height;	
		}
		LightList = new ArrayList<Light>();
		WallList = new ArrayList<Wall>();
	}
	
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public List<Light> getLightList() {
		return LightList;
	}

	@Override
	public List<Wall> getWallList() {
		return WallList;
	}

	@Override
	public Image computeImage() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
