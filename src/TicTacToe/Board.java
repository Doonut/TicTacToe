package TicTacToe;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Board {
	public static int width;
	
	public Board(int width){
		this.width = width;
	}

	public void draw(Graphics2D g){
		for(int i = 0; i < 9; ++i){
			int w = (i % 3) * width;
			int h = (i / 3) * width;
			Rectangle rect = new Rectangle(w, h, width, width);
			g.draw(rect);
		}
	}
}
