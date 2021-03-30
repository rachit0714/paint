package ca.utoronto.utm.paint;

import java.awt.event.MouseEvent;

class TriangleManipulatorStrategy extends ShapeManipulatorStrategy {
	private Triangle triangle;
	int whichVertex = 0;

	@Override
	public void mouseClicked(MouseEvent e) {
		int x=e.getX(), y=e.getY();

		Point p = new Point(x,y);

		if(this.whichVertex == 0) {
			this.triangle = new Triangle(p);
			TriangleCommand triangleCommand = new TriangleCommand(this.triangle);
			this.paintPanel.addCommand(triangleCommand);
		} else {
			this.triangle.setVertex(this.whichVertex,p);
		}
		this.whichVertex = (this.whichVertex + 1) % 3;
		this.paintPanel.repaint();
	}
}
