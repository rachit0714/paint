package ca.utoronto.utm.paint;
import java.awt.Graphics2D;

public class CircleCommand implements PaintCommand {
	private Circle circle;
	public CircleCommand(Circle circle){
		this.circle=circle;
	}
	public void execute(Graphics2D g2d){
		int x = this.circle.getCentre().x;
		int y = this.circle.getCentre().y;
		int radius = this.circle.getRadius();
		g2d.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}
}
