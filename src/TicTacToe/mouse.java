package TicTacToe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

class mouse extends JPanel implements MouseListener,
MouseMotionListener {

private static final long serialVersionUID = -8326902159754732403L;
Point p;
private int i=0;
public static boolean[] boolArray = new boolean[9];
public static boolean tie = false;
public static int[] XorO = new int[10];
public Graphics g;
public static int input;
public mouse() {
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me) {
}


public void mouseEntered(MouseEvent me) {
}

public void mouseExited(MouseEvent me) {
}

public void mousePressed(MouseEvent me) {
  int xPos = me.getX();
  int yPos = me.getY();
  if(xPos >= 0 && xPos <= 0 + Board.width && yPos >= 0 && yPos <= 0 + Board.width) {
      System.out.println("rect1");
      if(boolArray[0] == false)
      {
      input = 1;
      repaint();
      boolArray[0] = true;
      }
  }
  else if(xPos >= Board.width && xPos <= Board.width + Board.width && yPos >= 0 && yPos <= 0 + Board.width) {
      System.out.println("rect2");
      if(boolArray[1] == false)
      {
      input = 2;
      repaint();
      boolArray[1] = true;
      }
  }
  else if(xPos >= Board.width*2 && xPos <= Board.width*2 + Board.width && yPos >= 0 && yPos <= 0 + Board.width) {
      System.out.println("rect3");
      if(boolArray[2] == false)
      {
      input = 3;
      repaint();
      boolArray[2] = true;
      }
  }
  else if(xPos >= 0 && xPos <= 0 + Board.width && yPos >= Board.width && yPos <= Board.width + Board.width) {
      System.out.println("rect4");
      if(boolArray[3] == false)
      {
      input = 4;
      repaint();
      boolArray[3] = true;
      }
  }
  else if(xPos >= Board.width && xPos <= Board.width + Board.width && yPos >= Board.width && yPos <= Board.width + Board.width) {
      System.out.println("rect5");
      if(boolArray[4] == false)
      {
      input = 5;
      repaint();
      boolArray[4] = true;
      }
  }
  else if(xPos >= Board.width*2 && xPos <= Board.width*2 + Board.width && yPos >= Board.width && yPos <= Board.width + Board.width) {
      System.out.println("rect6");
      if(boolArray[5] == false)
      {
      input = 6;
      repaint();
      boolArray[5] = true;
      }
  }
  else if(xPos >= 0 && xPos <= 0 + Board.width && yPos >= Board.width*2 && yPos <= Board.width*2 + Board.width) {
      System.out.println("rect7");
      if(boolArray[6] == false)
      {
      input = 7;
      repaint();
      boolArray[6] = true;
      }
  }
  else if(xPos >= Board.width && xPos <= Board.width + Board.width && yPos >= Board.width*2 && yPos <= Board.width*2 + Board.width) {
      System.out.println("rect8");
      if(boolArray[7] == false)
      {
      input = 8;
      repaint();
      boolArray[7] = true;
      }
  }
  else if(xPos >= Board.width*2 && xPos <= Board.width*2 + Board.width && yPos >= Board.width*2 && yPos <= Board.width*2 + Board.width) {
      System.out.println("rect9");
      if(boolArray[8] == false)
      {
      input = 9;
      repaint();
      boolArray[8] = true;
      }
  }
}


public void mouseReleased(MouseEvent me) {

}

public void mouseDragged(MouseEvent me) {

}

public void mouseMoved(MouseEvent me) {
}
@Override
public void paintComponent(Graphics g)
{
  Graphics2D g2 = (Graphics2D) g;
  Board board1 = new Board(150);
  
  board1.draw(g2);
 
  if(i % 2 == 0)
  {
	  XorO[input] = 1;
	  O LetterO = new O(input);
	  LetterO.draw(g2);
	  ++i;
  }
  else
  {
	  XorO[input] = 2;
	  X LetterX = new X(input);
	  LetterX.draw(g2);
	  ++i;
  }
  Win.winCalc();
	if(Win.winner != 0 || tie == true)
	{
		Graphics2D g3 = (Graphics2D) g;
		DisplayWinner winDisp = new DisplayWinner();
		winDisp.draw(g3);
	}
}
}