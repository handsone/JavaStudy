class MainClass{
	public static void main(String args[]){
	Geometry[] tuxing = new Geometry[2];
	Rectangle A = new Rectangle(3, 5);
	Circle    B = new Circle(4);
	tuxing[0] = A ;
	tuxing[1] = B ;
	TotalArea C = new TotalArea(tuxing);
	System.out.printf("The h = " + A.h ) ;
	//System.out.printf("The totalArea area are %5.3f ", C.computeTotalArea());
	}
}
