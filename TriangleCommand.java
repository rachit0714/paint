package ca.utoronto.utm.paint;
import java.awt.Graphics2D;

public class TriangleCommand implements PaintCommand {
	private Triangle triangle;
	public TriangleCommand(Triangle triangle){
		this.triangle=triangle;
	}
	public void execute(Graphics2D g2d){
		for(int i=0;i<3;i++) {
			int x1 = this.triangle.getVerticies()[i].x;
			int y1= this.triangle.getVerticies()[i].y;
			int x2 = this.triangle.getVerticies()[(i+1)%3].x;
			int y2 = this.triangle.getVerticies()[(i+1)%3].y;
			g2d.drawLine(x1,y1,x2,y2);
		}
	}
}
