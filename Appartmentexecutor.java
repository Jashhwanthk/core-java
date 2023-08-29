class Appartmentexecutor{
	public static void main(String args[]){
		//new 
		//classname ref = new className();
		Appartment aprtment = new Appartment();
		aprtment.appartmentId = 1;
		aprtment.appartmentName = "Sobha";
		aprtment.location = "Hosur";
		aprtment.noOffloors = 30 ;
		aprtment.noOf2bhkflats = 130;
		aprtment.noOf3bhkflats = 150;
		
		
		
		System.out.println("the appartment id is " +aprtment.appartmentId);
		System.out.println("the appartment name is " + aprtment.appartmentName);
		System.out.println("the appartment location is " +aprtment.location);
		System.out.println("the no of floors of an appartment is " +aprtment.noOffloors);
		System.out.println("the no of 2bhk flats in an appartment is " +aprtment.noOf2bhkflats);
		System.out.println("the no of 3bhk flats in an appartment is " +aprtment.noOf3bhkflats);
		
		aprtment.provideAccomodation();
		
		
		Appartment aprtment1 = new Appartment();
		aprtment1.appartmentId = 8;
		aprtment1.appartmentName = "Sobha";
		aprtment1.location = "Hebbal";
		aprtment1.noOffloors = 30 ;
		aprtment1.noOf2bhkflats = 130;
		aprtment1.noOf3bhkflats = 150;
		
		
		
		System.out.println("the appartment id is " +aprtment1.appartmentId);
		System.out.println("the appartment name is " + aprtment1.appartmentName);
		System.out.println("the appartment location is " +aprtment1.location);
		System.out.println("the no of floors of an appartment is " +aprtment1.noOffloors);
		System.out.println("the no of 2bhk flats in an appartment is " +aprtment1.noOf2bhkflats);
		System.out.println("the no of 3bhk flats in an appartment is " +aprtment1.noOf3bhkflats);
	    aprtment.provideAccomodation();
	    
	
	
	
	}
	
	
	
	
	
	
	
}