package org.sherfu.java;
import java.util.List;
public class Triangle {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw()
	{
		for(Point point: points)
		{
			System.out.println("point.x = "+point.getX()+" point.y = "+point.getY());
		}
	}
	
/*
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
*/
/*
 	public void draw()
 	{
		System.out.println("PointB.x = "+getPointB().getX()+" PointB.y = "+getPointB().getY());
		System.out.println("PointC.x = "+getPointC().getX()+" PointC.y = "+getPointC().getY());
	}
*/
	/*
	private String type;
	private int height;
	
	public Triangle(String type){
		this.type = type;
	}
	
	public Triangle(int height){
		this.height = height;
	}
	
	public Triangle(String type,int height){
		this.type = type;
		this.height = height;
	}
	

	public String getType() {
		return type;
	}


	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	public void setHeight(int height) {
		this.height = height;
	}
	*/

	/*
	public void setType(String type) {
		this.type = type;
	}
	*/
	

	
}
