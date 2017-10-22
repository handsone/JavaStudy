class TotalArea{
	Geometry tuxing[];
	TotalArea(Geometry tuxing[]){
		this.tuxing = tuxing ;
	}
	public double computeTotalArea(){
		double sum  = 0 ; 
		for(int i = 0 ;  i < tuxing.length   ; i ++){
			sum += tuxing[i].getArea();
		}
		return sum ; 
	}

}
