class Ubereats {
	
	public static double search(String foodName){
		if("Halwa " == foodName){
		System.out.println("Searched food name is"+foodName);
		return 30.00;
		}
		if("Laddu " == foodName){
		System.out.println("Searched food name is"+foodName);
			return 50.90;
		}
		if("Kova " == foodName){
			System.out.println("Searched food name is"+foodName);
			return 30.00;
		}
    
	return 0.0;	
		
		}
		public static double search(String foodName,int quantity){
		if("Halwa " == foodName){
		System.out.println("Searched food name is"+foodName);
		return 30.00*quantity;
		}
		if("Laddu " == foodName){
		System.out.println("Searched food name is"+foodName);
			return 50.90*quantity;
		}
		if("Kova " == foodName){
			System.out.println("Searched food name is"+foodName);
			return 30.00*quantity;
		}
		return 0.0;
		}
}
		
