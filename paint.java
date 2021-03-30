package ca.utoronto.utm.paint;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class Paint extends JFrame {
	private static final long serialVersionUID = -4031525251752065381L;

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Paint();
			}
		});
	}
	
	private PaintPanel paintPanel;
	private ShapeChooserPanel shapeChooserPanel;
	
	public Paint() {
		super("Paint"); // set the title and do other JFrame init		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=this.getContentPane();
		this.paintPanel=new PaintPanel();
		this.shapeChooserPanel = new ShapeChooserPanel(this);
		c.add(this.paintPanel, BorderLayout.CENTER);	
		c.add(this.shapeChooserPanel,BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}

	public PaintPanel getPaintPanel(){
		return paintPanel;
	}
}
