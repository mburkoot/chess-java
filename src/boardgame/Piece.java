package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//eu não coloquei a posição no construtor pois a primeira posiçao já é pré definida
	public Piece(Board board) {
		this.board = board;
		position = null; //não precisa colocar pois por padrão já é nulo
	}

	protected Board getBoard() {
		return board;
	}

}
