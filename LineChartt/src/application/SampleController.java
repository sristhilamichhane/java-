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
	private LineChart<?,?> lc;
	@FXML
	private CategoryAxis x;
	@FXML
	private NumberAxis y;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		XYChart.Series c=new XYChart.Series();
		c.getData().add(new XYChart.Data("Jan",20));
		c.getData().add(new XYChart.Data("Feb",50));
		c.getData().add(new XYChart.Data("Mar",15));
		c.getData().add(new XYChart.Data("April",30));
		lc.getData().addAll(c);
	}

}
