class Oven{
    static String name = "Yavdo ondu";

	static int minheat;
    static int currentheat;
    static int maxheat = 30;
	static boolean isConnected;
	//method
	
		
	public static void increaseheat(){
		if(isConnected == false){
			if(currentheat < maxheat){
				currentheat = currentheat+1;
			System.out.println("The currentheat is"+currentheat);
			}
			else{
				System.out.println("Reached Max heat");
			}
		
		}else{
		System.out.println("Turnon the Oven first");
	}
				
				
			}
		
		public static void decreaseheat(){
		if(isConnected == true){
		if(currentheat > minheat){
		currentheat = currentheat-1;
		System.out.println("The currentheat is "+ currentheat);
		}else{
	           System.out.println("Minimum heat is reached");
			   }
			   
		}
		else{
		      System.out.println("Oven is tuned off... can't decrease the heat");
		
		
		
		}
	}
		
}
	
	
		
	
	
	
