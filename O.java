package Ch7.tictactoe;

import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class O {
	private int choice;
	
	public O(int aChoice)
	{
		choice = aChoice;
	}
	public void draw(Graphics2D g2)
	{
		if (choice == 1)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(23,23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 2)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(Board.width + 23,23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 3)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(Board.width*2 + 23,23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 4)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(23,Board.width + 23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 5)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(Board.width + 23,Board.width + 23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 6)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(Board.width*2 + 23,Board.width + 23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 7)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(23,Board.width*2 + 23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 8)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(Board.width + 23,Board.width*2 + 23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
		else if(choice == 9)
		{
			Ellipse2D.Double LetterO = new Ellipse2D.Double(Board.width*2 + 23,Board.width*2 + 23,100,100);
			Stroke stroke = new BasicStroke(10);
			g2.setStroke(stroke);
			g2.setColor(Color.red);
			g2.draw(LetterO);
		}
	}
}
