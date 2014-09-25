package TicTacToe;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Board {
	public static int width;
	
	public Board(int aWidth)
	{
		width = aWidth;
	}
	public void draw(Graphics2D g)
	{
		Rectangle Rect1 = new Rectangle(0, 0, width, width);
		Rectangle Rect2 = new Rectangle(width, 0, width, width);
		Rectangle Rect3 = new Rectangle(width * 2, 0, width, width);
		Rectangle Rect4 = new Rectangle(0, width, width, width);
		Rectangle Rect5 = new Rectangle(width, width, width, width);
		Rectangle Rect6 = new Rectangle(width * 2, width, width, width);
		Rectangle Rect7 = new Rectangle(0, width * 2, width, width);
		Rectangle Rect8 = new Rectangle(width, width * 2, width, width);
		Rectangle Rect9 = new Rectangle(width * 2, width * 2, width, width);
		
		g.draw(Rect1);
		g.draw(Rect2);
		g.draw(Rect3);
		g.draw(Rect4);
		g.draw(Rect5);
		g.draw(Rect6);
		g.draw(Rect7);
		g.draw(Rect8);
		g.draw(Rect9);		
	}
}
