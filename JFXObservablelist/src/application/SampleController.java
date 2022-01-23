package application;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class SampleController implements Initializable {
	
	public void nonOvservable() {
		int a=10;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
		a=20;
		System.out.println(sum);//20
		
	}
	public  void Ovservable() {
		SimpleIntegerProperty x=new SimpleIntegerProperty(10);
		SimpleIntegerProperty y=new SimpleIntegerProperty(10);
		NumberBinding sum =x.add(y);//20
		System.out.println(sum.getValue());
		x.set(40);		
		System.out.println(sum.getValue());//30		
	}
	@FXML
	private TextField tx1;
	@FXML
	private TextField tx2;
	@FXML
	private Text level;
	@FXML
	private SimpleStringProperty text=new SimpleStringProperty("A");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		MyTask task=new MyTask();
		Timer timer=new Timer(true);
		timer.scheduleAtFixedRate(task, 1000, 1000);		
		level.textProperty().bind(text);// binding text to label
		tx1.textProperty().bindBidirectional(tx2.textProperty());// two way writing text
	}
	class MyTask extends TimerTask{
				@Override
		public void run() {
			int ch=text.get().charAt(0);
			ch++;
			text.set(String.valueOf((char)ch));}
		 
	}
	
}
