package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
			CategoryAxis x=new CategoryAxis();   x.setLabel("Currency");
			NumberAxis y=new NumberAxis(10,100,10);
			BarChart<String,Float> b=new BarChart(x,y);
			XYChart.Series<String,Float> s = new XYChart.Series<>();  
		    s.getData().add(new XYChart.Data("Euro",83)); 
		    s.getData().add(new XYChart.Data("Pokhara",20));
		    s.getData().add(new XYChart.Data("Dollar",60)); 
		    s.getData().add(new XYChart.Data("Kathmandu",70));
			b.getData().add(s);
			Group root = new Group();  
		    root.getChildren().add(b);
					
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
