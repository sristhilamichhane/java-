package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartExperiment extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void start(Stage primaryStage ) throws Exception {
		// TODO Auto-generated method stub
		
		String Euro="Euro";
		String Pound="Pound";
		String Dollar="Dollar";
		String Frenc="Swis Franc";
		
		
		CategoryAxis xAxis =new CategoryAxis();
		xAxis.setLabel("Currency");
		NumberAxis yAxis= new NumberAxis(0.1,2,0.1);
		yAxis.setLabel("Dollar");
		
		
		BarChart<String,Float> bc= new BarChart(xAxis,yAxis);
		bc.setTitle("Dollar Conversion Chart");
		XYChart.Series<String,Float> s=new XYChart.Series();
		
		s.getData().add(new XYChart.Data(Euro,0.83));
		s.getData().add(new XYChart.Data(Pound,0.73));
		s.getData().add(new XYChart.Data(Dollar,1.32));
		s.getData().add(new XYChart.Data(Frenc,1.00));
		bc.getData().add(s);
		
		
		
		Group root = new Group();
		root.getChildren().add(bc);
		Scene scene =new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bar Chart experiment");
		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		primaryStage.show();
	}

}
