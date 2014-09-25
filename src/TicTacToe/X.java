package TicTacToe;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.geom.Line2D;

public class X {
	private int choice;
	
	public X(int aChoice)
	{
		choice = aChoice;
	}
	public void draw(Graphics2D g2)
	{
		if (choice == 1)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(35,35,115,115);
			Line2D.Double LetterXL2 = new Line2D.Double(115,35,35,115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 2)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(Board.width + 35,35,Board.width + 115,115);
			Line2D.Double LetterXL2 = new Line2D.Double(Board.width + 115,35,Board.width + 35,115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 3)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(Board.width*2 + 35,35,Board.width*2 +115,115);
			Line2D.Double LetterXL2 = new Line2D.Double(Board.width*2 +115,35,Board.width*2 +35,115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 4)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(35,Board.width + 35,115,Board.width + 115);
			Line2D.Double LetterXL2 = new Line2D.Double(115,Board.width + 35,35,Board.width + 115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 5)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(Board.width + 35,Board.width + 35,Board.width + 115,Board.width + 115);
			Line2D.Double LetterXL2 = new Line2D.Double(Board.width + 115,Board.width + 35,Board.width + 35,Board.width + 115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 6)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(Board.width*2 +35,Board.width + 35,Board.width*2 +115,Board.width + 115);
			Line2D.Double LetterXL2 = new Line2D.Double(Board.width*2 + 115,Board.width + 35,Board.width*2 + 35,Board.width + 115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 7)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(35,Board.width*2 + 35,115,Board.width*2 + 115);
			Line2D.Double LetterXL2 = new Line2D.Double(115,Board.width*2 + 35,35,Board.width*2 + 115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 8)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(Board.width + 35,Board.width*2 + 35,Board.width + 115,Board.width*2 + 115);
			Line2D.Double LetterXL2 = new Line2D.Double(Board.width + 115,Board.width*2 + 35,Board.width + 35,Board.width*2 + 115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
		else if (choice == 9)
		{
			Line2D.Double LetterXL1 = new Line2D.Double(Board.width*2 + 35,Board.width*2 + 35,Board.width*2 + 115,Board.width*2 + 115);
			Line2D.Double LetterXL2 = new Line2D.Double(Board.width*2 + 115,Board.width*2 + 35,Board.width*2 + 35,Board.width*2 + 115);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.blue);
			g2.draw(LetterXL1);
			g2.draw(LetterXL2);
		}
	}
}
