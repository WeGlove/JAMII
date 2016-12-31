package testpenis;

import org.junit.Test;

import board.Board;
import board.BoardImplementation;

public class TestBoard {

	@Test
	public void BoardTestWidth(){
		Board b = new BoardImplementation(2,2);
		assert(b.getWidth()==2);
	}
	
}
