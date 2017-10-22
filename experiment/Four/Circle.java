public class Circle extends Geometry {
	double R ;
	Circle(double r){
		R = r ; 
	}
	public double getArea(){
		return 3.14 * R * R ;
	}
}
