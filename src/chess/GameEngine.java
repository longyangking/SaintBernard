package chess;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameEngine {
	View view;
	ChessBoard chessboard;
	Player player;
	Computer computer;
	Rectangle[][] playboard;
	public GameEngine(Pane root){
		view = new View(root);
		chessboard = new ChessBoard();
		player = new Player();
		computer = new Computer();
	}
	public void Start(){
		playboard = view.initChessBoard();
		//Initiate Chess Board
	}
	
	public void End(int role){
		view.EndGame(role);
		this.Start();
	}
}
