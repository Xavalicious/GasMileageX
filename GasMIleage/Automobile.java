
public class Automobile {
	private double mpg;
	private double gas;
	
	public Automobile(double m){
		mpg=m;
		double g = 0;
		gas=g;
	}
	public double fillUp(double f){
		gas=f+gas;
		return gas;
	}
	public double taketrip(double t){
		gas=gas-(t/24);
		return gas;
		
	}
	public double reportFuel(){
		return gas;
		
	}
}
