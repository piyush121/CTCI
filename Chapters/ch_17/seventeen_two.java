package ch_17;

public class seventeen_two { //checking for 3x3 only.
	enum Piece { Empty, Red, Blue };
	
	public static Piece haswon(Piece[][] board)
	{
		for(int row=0;row<board.length;row++) //check rows
		{
			if(board[row][0]!=Piece.Empty && board[row][0]==board[row][1] && board[row][0]==board[row][2])
				return board[row][0] ;
		}	
		
		for(int col=0;col<board.length;col++) //check columns
		{
			if(board[0][col]!=Piece.Empty && board[0][col]==board[1][col] && board[0][col]==board[2][col])
				return board[0][col] ;
		}
		
		if(board[0][0]!=Piece.Empty && board[0][0]==board[1][1]&&board[2][2]==board[3][3])//diagonal
			return board[0][0];
		if(board[0][2]!=Piece.Empty && board[0][2]==board[1][1]&&board[0][2]==board[3][0])//cross diagonal
			return board[0][2];
		
		return Piece.Empty;
	}

}
