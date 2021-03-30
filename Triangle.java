package ca.utoronto.utm.paint;
 
public class Triangle {
	private Point[] verticies=new Point[3];
	
	public Triangle(Point start){
		for(int i=0;i<3;i++)verticies[i]=start;
	}
	public Point[] getVerticies(){ return verticies; }
	public Point getVertex(int i){ return verticies[i]; }
	public void setVertex(int i, Point p) {
		this.verticies[i]=p;
	}
}
