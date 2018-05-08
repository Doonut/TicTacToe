package com.Donut.TicTacToe;

import java.util.Timer;
import java.util.TimerTask;

public class InitTimer implements Runnable {
	public void run() {
		new Timer().schedule( 
		        new TimerTask() {
		            @Override
		            public void run() {
		            	mouse.initComplete();
		            }
		        }, 
		        1000 
		);
	}
}
