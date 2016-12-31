package testpenis;

import org.junit.Test;

import board.Board;
import board.BoardImplementation;
import board.light.Lightimplementation;

public class TestBoard {

	@Test
	public void BoardTestWidth(){
		Board b = new BoardImplementation(2,2);
		assert(b.getWidth()==2);
	}
	
	@Test
	public void BoardTestHeight(){
		Board b = new BoardImplementation(2,2);
		assert(b.getHeight()==2);
	}

	@Test
	public void BoardTestHeightWidth(){
		Board b = new BoardImplementation(2,2);
		assert(b.getHeight()==2 && b.getWidth()==2);
	}
	
	@Test
	public void BoardTestWidthTooSmall(){
		Board b = new BoardImplementation(-2,2);
		assert(b.getWidth()==1);
	}
	
	@Test
	public void BoardTestHeightTooSmall(){
		Board b = new BoardImplementation(2,-2);
		assert(b.getHeight()==1);
	}

	@Test
	public void BoardTestWidthHeightTooSmall(){
		Board b = new BoardImplementation(-2,-2);
		assert(b.getHeight()==1 && b.getWidth()==1);
	}
	
	public void BoardTestLightListNotNull(){
		Board b = new BoardImplementation(2,2);
		assert(b.getLightList() != null);
	}
	
	public void BoardTestWallListNotNull(){
		Board b = new BoardImplementation(2,2);
		assert(b.getWallList() != null);
	}

}
