package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//eu n�o coloquei a posi��o no construtor pois a primeira posi�ao j� � pr� definida
	public Piece(Board board) {
		this.board = board;
		position = null; //n�o precisa colocar pois por padr�o j� � nulo
	}

	protected Board getBoard() {
		return board;
	}

}
