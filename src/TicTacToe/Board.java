package TicTacToe;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Board {
	private static int width;
	
	public Board(int width){
		Board.width = width;
	}

	public static int getWidth(){
		return Board.width;
	}

	public void draw(Graphics2D g){
		for(int i = 0; i < 9; ++i){
			int w = (i % 3) * Board.width;
			int h = (i / 3) * Board.width;
			Rectangle rect = new Rectangle(w, h, Board.width, Board.width);
			g.draw(rect);
		}
	}
}
