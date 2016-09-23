package TicTacToe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class DisplayWinner {
	public DisplayWinner(Graphics2D g){
		draw(g);
	}

	private void draw(Graphics2D g)
	{
		g.setFont(new Font("TimesRoman", Font.PLAIN, 80)); 
		g.setColor(Color.black);
		if(mouse.tie == true){
			g.drawString("Draw!", 120, 250);
		}
		if(Win.winner == 1){
			g.drawString("Winner!", 100, 250);
		}		
	}
}
