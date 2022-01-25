package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ChartTest  extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		// TODO Auto-generated method stub
		PieChart pc= new PieChart();
		pc.setData(getChartData());
		StackPane root=new StackPane();
		root.getChildren().add(pc);
		
		Scene s= new Scene(root,400,400);
		PrimaryStage.setScene(s);
		PrimaryStage.setTitle("Piechart Example");
		PrimaryStage.show();
	}
	
	private ObservableList<Data> getChartData()
	{
		ObservableList<Data> list= FXCollections.observableArrayList();
		list.addAll(new PieChart.Data("American", 10),
				new PieChart.Data("British", 20),
				new PieChart.Data("Nepali", 30),
				new PieChart.Data("Chinese", 10),
				new PieChart.Data("Spanish", 30)
				);
		return list;
	}

}
