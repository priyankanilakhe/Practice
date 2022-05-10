//https://leetcode.com/problems/word-search/
package BackTracking;

public class WordSearch {

	public static boolean DFS(char[][] board, int i, int j, int index, String word) {

		if (index == word.length())
			return true;

		if (i == -1 || i == board.length || j == -1 || j == board[0].length || board[i][j] != word.charAt(index))
			return false;

		char temp = board[i][j];
		board[i][j] = '*';

		boolean found =    DFS(board, i, j + 1, index + 1, word) 
						|| DFS(board, i, j - 1, index + 1, word)
						|| DFS(board, i + 1, j, index + 1, word) 
						|| DFS(board, i - 1, j, index + 1, word);

		board[i][j] = temp;

		return found;

	}

	public static boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && DFS(board, i, j, 0, word))
					return true;

			}
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"SEE"));
	}

}
