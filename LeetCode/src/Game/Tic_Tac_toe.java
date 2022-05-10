package Game;

import java.util.Scanner;

public class Tic_Tac_toe {

	public static void main(String[] args) {
		/*
		 * char[][] tictactoegame={{'X',' ','o'}, {'X','o','o'}, {'o',' ','X'}};
		 */
		char[][] tictactoegame = new char[3][3];
		boolean win = false;
		boolean playA = true;
		try{
		while (win == false) {
			System.out.println("Please enter the position where you wnat to put the value");
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					boolean result=tictactoegame[i][j]=='X'||tictactoegame[i][j]=='o';
					if(!result){
					tictactoegame[i][j]='#';
					}
					System.out.print(tictactoegame[i][j]);
				}
				System.out.println();
			} 
			System.out.println("Please enter the row position");
			int rowPosition = input.nextInt()-1;
			System.out.println("Please enter the coloum position");
			int colposition = input.nextInt()-1;
		
			if(rowPosition < 0 ||rowPosition >3 || colposition<0 || colposition>3)
			{
				System.out.println("Please enter the valid input");
				continue;
			}
			if(tictactoegame[rowPosition][colposition]!='#')
			{
				System.out.println("Cell already used, Please select differnt cell");
				continue;
			}
			
			

			/*
			 * char playerA='X'; boolean playA=true; char playerB='o';
			 * 
			 * //playA==true?:
			 * 
			 * if(playA==true) {
			 * tictactoegame[rowPosition][colposition]=playerA; playA=false; }
			 * else { tictactoegame[rowPosition][colposition]=playerB;
			 * playA=true; }
			 */
			
			char inputStr = playA ? 'X' : 'o';
			tictactoegame[rowPosition][colposition] = inputStr;
			playA = playA ? false : true;

			/*
			 * char c=input.next().charAt(0); if(c !='X' || c !='o') {
			 * System.out.println("Please enter the valide input"); }
			 */

			for (int i = 0; i < 3; i++) {
				if ((tictactoegame[i][0] == 'X' && tictactoegame[i][1] == 'X' && tictactoegame[i][2] == 'X')
						|| (tictactoegame[0][i] == 'X' && tictactoegame[1][i] == 'X' && tictactoegame[2][i] == 'X')
						|| (tictactoegame[0][0] == 'X' && tictactoegame[1][1] == 'X' && tictactoegame[2][2] == 'X')
						|| (tictactoegame[0][2] == 'X' && tictactoegame[1][1] == 'X' && tictactoegame[2][0] == 'X')) {
					System.out.println("Congrats!! Player A win");
					win = true;
					break;
				} else if ((tictactoegame[i][0] == 'o' && tictactoegame[i][1] == 'o' && tictactoegame[i][2] == 'o')
						|| (tictactoegame[0][i] == 'o' && tictactoegame[1][i] == 'o' && tictactoegame[2][i] == 'o')
						|| (tictactoegame[0][0] == 'o' && tictactoegame[1][1] == 'o' && tictactoegame[2][2] == 'o')
						|| (tictactoegame[0][2] == 'o' && tictactoegame[1][1] == 'o' && tictactoegame[2][0] == 'o')) {
					System.out.println("Congrats!! Player B win");
					win = true;
					break;
				}
			}
			boolean visited = false;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (tictactoegame[i][j] == ' ') {
						visited = true;
					}
				}
			}
			if (win == false && visited == true) {
				System.out.println("Match Draw");
				break;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tictactoegame[i][j]);
			}
			System.out.println();
		} 
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
