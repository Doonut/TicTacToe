package TicTacToe;

import javax.swing.JFrame;

public class BoardViewer{
public static void main(String[] args) {
	    JFrame aWindow = new JFrame();
	    aWindow.setSize(467, 490);
	    aWindow.setTitle("Tic-Tac-Toe");
	    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    aWindow.add(new mouse());
	    aWindow.setVisible(true);
	  }
	}