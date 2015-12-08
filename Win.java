package TicTacToe;

public class Win {
	public static int winner = 0;
	public static void winCalc()
	{
		if (mouse.XorO[0] != 0 && mouse.XorO[0] == mouse.XorO[1] && mouse.XorO[1] == mouse.XorO[2] ||
				mouse.XorO[3] != 0 && mouse.XorO[3] == mouse.XorO[4] && mouse.XorO[4] == mouse.XorO[5] ||
				mouse.XorO[6] != 0 && mouse.XorO[6] == mouse.XorO[7] && mouse.XorO[7] == mouse.XorO[8] ||
				mouse.XorO[0] != 0 && mouse.XorO[0] == mouse.XorO[3] && mouse.XorO[3] == mouse.XorO[6] ||
				mouse.XorO[1] != 0 && mouse.XorO[1] == mouse.XorO[4] && mouse.XorO[4] == mouse.XorO[7] ||
				mouse.XorO[2] != 0 && mouse.XorO[2] == mouse.XorO[5] && mouse.XorO[5] == mouse.XorO[8] ||
				mouse.XorO[0] != 0 && mouse.XorO[0] == mouse.XorO[4] && mouse.XorO[4] == mouse.XorO[8] ||
				mouse.XorO[2] != 0 && mouse.XorO[2] == mouse.XorO[4] && mouse.XorO[4] == mouse.XorO[6]){
			winner = 1;
		} 

		else {
			for(int i = 0; i < 9; ++i){
				if(mouse.boolArray[i] == false){
					mouse.tie = false;
					break;
				}
				mouse.tie = true;
			}
		}
	}
}
