package chess;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.Lighting;

public class View {
	Pane root;
	Rectangle[][] chesses;
	public View(Pane root){
		this.root = root;
	}
	
	//Initiate Chess Board
	public Rectangle[][] initChessBoard(){
		return chesses;
	}
	
	//Choose Chess
	public void ChooseChess(int i, int j, int role){
		
	}
	
	//Animation of putting chess
	public void PutChess(int i, int j, int role){
		
	}
	
	public void Update(){
		
	}
	
	public void EndGame(int role){
		String result = "";
		if (role == Config.PlayerWin){
			result = "Player Win";
		}
		if (role == Config.ComputerWin){
			result = "Computer Win";
		}
		
		Stage stage = new Stage();
		Group group = new Group();
		Scene scene = new Scene(group,300,200,Color.WHITESMOKE);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.setTitle("Result");
		stage.centerOnScreen();
		stage.show();
		Text text = new Text(20,100,result);
		text.setFill(Color.DODGERBLUE);
		text.setEffect(new Lighting());
		text.setFont(Font.font(Font.getDefault().getFamily(),50));
		
		group.getChildren().add(text);
	}
}
