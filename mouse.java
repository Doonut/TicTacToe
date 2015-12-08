package TicTacToe;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

class mouse extends JPanel implements MouseListener,
MouseMotionListener {
  private int i = 0;
  private static int input;
  private static boolean initCanRun = false;
  public static boolean[] boolArray = new boolean[9];
  public static boolean tie = false;
  public static int[] XorO = new int[10];
  
  public mouse() {
	  addMouseListener(this);
	  addMouseMotionListener(this);
	  addTimer();
  }
  
  public static void initComplete(){
	  initCanRun = true;
  }
  
  private void addTimer(){
	  InitTimer timer = new InitTimer();
	  Thread t = new Thread(timer);
	  t.start();
  }
  
  private void setInput(int n){
    if(boolArray[n] == false){
      input = n;
      repaint();
      boolArray[n] = true;
    }
  }
  
  private void getPosition(int x, int y){
    for(int i = 0; i < 9; ++i){
      int w = (i % 3) * Board.width;
      int h = (i / 3) * Board.width;
      if(x >= w && x <= (w + Board.width) && y >= h && y <= (h + Board.width)){
        setInput(i);
      }
    }
  }

  public void mousePressed(MouseEvent me) {
	int x = me.getX();
	int y = me.getY();
    getPosition(x, y);
  }
  
  @Override
  public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    Board board = new Board(150);
    
    board.draw(g2);

    if(initCanRun == true){
      if(i % 2 == 0){
  	     XorO[input] = 1;
  	     O LetterO = new O(input);
  	     LetterO.draw(g2);
      }
  
      else{
        XorO[input] = 2;
        X LetterX = new X(input);
        LetterX.draw(g2);
      }
    }   
    ++i;
    
    Win.winCalc();
  
  	if(Win.winner != 0 || tie == true){
  		Graphics2D g3 = (Graphics2D) g;
  		DisplayWinner winDisp = new DisplayWinner();
  		winDisp.draw(g3);
  	}
  }
  public void mouseClicked(MouseEvent me) {}
  public void mouseEntered(MouseEvent me) {}
  public void mouseExited(MouseEvent me) {}
  public void mouseReleased(MouseEvent me) {}
  public void mouseDragged(MouseEvent me) {}
  public void mouseMoved(MouseEvent me) {}
}




