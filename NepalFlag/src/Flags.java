import java.applet.*;
import java.awt.*;

public class Flags extends Applet {
	static Color NEPALIFLAG=new Color(221,12,39);
	

	public  void paint(Graphics flag) {
//		for upper triangle
		int upperTriangleX[]= {210,360,210};
		int upperTriangleY[]= {10,160,160};
		Polygon upperTriangle=new Polygon(upperTriangleX,upperTriangleY,3);
		flag.drawPolygon(upperTriangle);
		flag.setColor(NEPALIFLAG);
		flag.fillPolygon(upperTriangle);
//		for lower triangle
		int lowerTriangleX[]= {210,360,210};
		int lowerTriangleY[]= {160,340,340};
		Polygon lowerTriangle=new Polygon(lowerTriangleX,lowerTriangleY,3);
		flag.drawPolygon(lowerTriangle);
		flag.setColor(NEPALIFLAG);
		flag.fillPolygon(lowerTriangle);
//		for standing rod
		int rodX[]= {207,210,210,207};
		int rodY[]= {7,7,500,498};
		Polygon rod=new Polygon(rodX,rodY,4);
		flag.drawPolygon(rod);
		flag.setColor(Color.black);
		flag.fillPolygon(rod);
//		for borders
		int borderX[]= {210,210,360,210,390,210,210,396,216,366};
		int borderY[]= {7,10,160,160,340,340,343,343,163,163};
		Polygon border=new Polygon(borderX,borderY,3);
		flag.drawPolygon(border);
		flag.setColor(Color.blue);
		flag.fillPolygon(border);
//		for moon
		flag.setColor(Color.blue);
		flag.fillOval(240,100,30,30);
		flag.setColor(NEPALIFLAG);
		flag.fillOval(240,91,30,30);
//		for star
		int starX[]= {240,250,255,260,270,265,270,260,255,250,240,245};
		int starY[]= {260,260,250,260,260,270,280,280,290,280,280,270};
		Polygon star=new Polygon(starX,starY,3);
		flag.drawPolygon(star);
		flag.setColor(Color.white);
		flag.fillPolygon(star);
	}

}
