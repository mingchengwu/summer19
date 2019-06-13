import java.util.LinkedList;

public class test{
	
	
	public static void main(String [] args){
		
		
		LinkedList<Point2d> points = new LinkedList<Point2d>();
		Point2d p1 = new Point2d(1,1);
		Point2d p2 = new Point2d(2,2);
		Point2d p3 = new Point2d(3,3);
		
		
		points.add(p3);
		points.add(p1);
		Point2d p4 = points.get(1).prev;
		System.out.println(points.get(1));
		
	}
	
}