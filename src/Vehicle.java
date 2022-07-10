
public class Vehicle {

	//
	String petrol = "";
	
	void drive(String p) {
		petrol = p;
		
	}
	
	
	public static void main(String[] args) {
		Vehicle baleno = new Vehicle();
		
		baleno.drive("Indian Oil");
	}
}
