package com.Donut.TicTacToe;

import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class O {
	private int c;
	private Ellipse2D.Double LetterO;

	public O(int c){
		this.c = c;
	}

	private void drawGraphics(Graphics2D g){
		Stroke stroke = new BasicStroke(10);
		g.setStroke(stroke);
		g.setColor(Color.red);
		g.draw(LetterO);
	}

	private void makeEllipse(){
		int w = (this.c % 3) * Board.getWidth();
		int h = (this.c / 3) * Board.getWidth();
		LetterO = new Ellipse2D.Double(23 + w,23 + h,100,100);
	}

	public void draw(Graphics2D g){
		makeEllipse();
		drawGraphics(g);
	}
}
