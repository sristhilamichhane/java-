package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartTest extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		CategoryAxis xaxis=new CategoryAxis();
		xaxis.setLabel("Covid");
		NumberAxis yaxis=new NumberAxis();
		yaxis.setLabel("Cases");
		
		LineChart lc=new LineChart(xaxis,yaxis);
		XYChart.Series s=new XYChart.Series<>();
		s.setName("Yearly covid cases");
		s.getData().add(new XYChart.Data("2020",1000));
		s.getData().add(new XYChart.Data("2021",2000));
		s.getData().add(new XYChart.Data("2022",3000));
		s.getData().add(new XYChart.Data("2023",4000));
		
		lc.getData().add(s);
		
		Group root=new Group();
		root.getChildren().add(lc);
		Scene scene= new Scene(root,600,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Linechart example");
		primaryStage.show();
		
		
		
		
		
		
		
		
		
		
	}

}
