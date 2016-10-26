package chess;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Chess extends Application{
	public Parent createContent(){
		Pane root = new Pane();
		root.setPrefSize(Config.ChessBoardHeight*Config.ChessSize, Config.ChessBoardWidth*Config.ChessSize);
		root.setMinSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
		root.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
		
		GameEngine game = new GameEngine(root);
		game.Start();
		
		return root;
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Chess");
		stage.setScene(new Scene(createContent()));
		stage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}
}
