import java.awt.geom.*;

public class Rectangle {

		Point2D.Double origine;
		Point2D.Double corner;

		Rectangle(double ox, double oy, double cx, double cy){

		this.origine= new Point2D.Double(ox, oy);
		this.corner= new Point2D.Double(cx, cy);;

		}


		public String toString(){

			return "Origine: " + this.origine + " Corner:" + this.corner ;

		}


		public double largeur(){
			return corner.getX() - origine.getX(); 
		}

		public double longeur(){
			return corner.getY() - origine.getY(); 
		}

		public double surface(){
			return (corner.getX() - origine.getX()) * (corner.getY() - origine.getY()); 
		}

		public double perimetre(){
			return 2*(corner.getX() - origine.getX()) + 2*(corner.getY() - origine.getY()); 
		}

}
