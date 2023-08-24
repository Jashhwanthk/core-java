class Ac{
    static String name = "Whirlpool";

	static int minTemperature;
    static int currentTemperature;
    static int maxTemperature = 30;
	static boolean isConnected;
	//method
	
		
	public static void increaseTemperature(){
		if(isConnected == false){
			if(currentTemperature < maxTemperature){
				currentTemperature = currentTemperature+1;
			System.out.println("The currentTemperature is"+currentTemperature);
			}
			else{
				System.out.println("Reached Max Temperature");
			}
		
		}else{
		System.out.println("Turnon the Ac first");
	}
				
				
			}
		
		public static void decreaseTemperature(){
		if(isConnected == true){
		if(currentTemperature > minTemperature){
		currentTemperature = currentTemperature-1;
		System.out.println("The currentTemperature is "+ currentTemperature);
		}else{
	           System.out.println("Minimum Temperature is reached");
			   }
			   
		}
		else{
		      System.out.println("Ac is tuned off... can't decrease the Temperature");
		
		
		
		}
	}
		
}
	
	
		
	
	
	
