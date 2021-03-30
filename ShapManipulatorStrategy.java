package ca.utoronto.utm.paint;

public class ShapeManipulatorFactory {
	public static ShapeManipulatorStrategy create(String strategyName){
		ShapeManipulatorStrategy strategy=null;
		if(strategyName=="Circle"){
			strategy=new CircleManipulatorStrategy();
		}
		if(strategyName=="Triangle"){
			strategy=new TriangleManipulatorStrategy();
		}
		return strategy;
	}
}
