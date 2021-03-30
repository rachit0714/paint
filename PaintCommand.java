package ca.utoronto.utm.paint;
import java.awt.Graphics2D;

public interface PaintCommand {
	public abstract void execute(Graphics2D g2d);
}
