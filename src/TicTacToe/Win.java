package TicTacToe;

public class Win {
	public static int winner = 0;
	public static void winCalc()
	{
		if(mouse.XorO[1] != 0 && mouse.XorO[1] == mouse.XorO[2] && mouse.XorO[2] == mouse.XorO[3] ||
				mouse.XorO[4] != 0 && mouse.XorO[4] == mouse.XorO[5] && mouse.XorO[5] == mouse.XorO[6] ||
				mouse.XorO[7] != 0 && mouse.XorO[7] == mouse.XorO[8] && mouse.XorO[8] == mouse.XorO[9] ||
				mouse.XorO[1] != 0 && mouse.XorO[1] == mouse.XorO[4] && mouse.XorO[4] == mouse.XorO[7] ||
				mouse.XorO[2] != 0 && mouse.XorO[2] == mouse.XorO[5] && mouse.XorO[5] == mouse.XorO[8] ||
				mouse.XorO[3] != 0 && mouse.XorO[3] == mouse.XorO[6] && mouse.XorO[6] == mouse.XorO[9] ||
				mouse.XorO[1] != 0 && mouse.XorO[1] == mouse.XorO[5] && mouse.XorO[5] == mouse.XorO[9] ||
				mouse.XorO[3] != 0 && mouse.XorO[3] == mouse.XorO[5] && mouse.XorO[5] == mouse.XorO[7])
		{
			winner = 1;
		}
		else if(mouse.boolArray[0] == true &&
				mouse.boolArray[1] == true &&
				mouse.boolArray[2] == true &&
				mouse.boolArray[3] == true &&
				mouse.boolArray[4] == true &&
				mouse.boolArray[5] == true &&
				mouse.boolArray[6] == true &&
				mouse.boolArray[7] == true &&
				mouse.boolArray[8] == true)
		{
			mouse.tie = true;
		}
	}
}
