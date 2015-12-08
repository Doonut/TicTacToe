package TicTacToe;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.geom.Line2D;

public class X {
	private int c;
	private Line2D.Double LetterXL1, LetterXL2;

	public X(int c){
		this.c = c;
	}

	private void drawGraphics(Graphics2D g){
		Stroke stroke = new BasicStroke(10);
		g.setStroke(stroke);
		g.setColor(Color.blue);
		g.draw(LetterXL1);
		g.draw(LetterXL2);
	}

	private void makeLines(){
		int w = (this.c % 3) * Board.width;
		int h = (this.c / 3) * Board.width;
		LetterXL1 = new Line2D.Double(35 + w,35 + h,115 + w,115 + h);
		LetterXL2 = new Line2D.Double(115 + w,35 + h,35 + w,115 + h);
	}

	public void draw(Graphics2D g){
		makeLines();
		drawGraphics(g);
	}
}
