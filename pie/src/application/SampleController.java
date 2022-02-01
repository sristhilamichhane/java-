package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
public class SampleController implements Initializable{
@FXML
private PieChart piechart;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			
		ObservableList<PieChart.Data> pieChartData=  FXCollections.observableArrayList(
				new PieChart.Data("Anita", 100),
				new PieChart.Data("Bimila", 300),
				new PieChart.Data("Rojan", 600),
				new PieChart.Data("Sandy", 10) );
		piechart.setData(pieChartData);
		piechart.setTitle("Income");
	}	
}
