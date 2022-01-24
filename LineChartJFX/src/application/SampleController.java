package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class SampleController implements Initializable {
	@FXML
	private LineChart<?,?> linechart;
	@FXML
	private CategoryAxis categoryAxis;
	@FXML
	private NumberAxis numberAxis;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series c= new XYChart.Series();
		c.setName("marks");
		c.getData().add(new XYChart.Data("maths",70));
		c.getData().add(new XYChart.Data("java",80));
		c.getData().add(new XYChart.Data("Dsa",65));
		c.getData().add(new XYChart.Data("PQt",40));
		c.getData().add(new XYChart.Data("mpu",75));
		c.getData().add(new XYChart.Data("SEF",90));
		linechart.getData().addAll(c);
		
		
		
	}
	
}
