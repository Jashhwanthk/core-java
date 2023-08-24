class Television{
    static String name = "Samsung";

	static int minBrightness;
    static int currentBrightness;
    static int maxBrightness = 30;
	static boolean isConnected;
	//method
	
		
	public static void increaseBrightness(){
		if(isConnected == false){
			if(currentBrightness < maxBrightness){
				currentBrightness = currentBrightness+1;
			System.out.println("The currentBrightness is"+currentBrightness);
			}
			else{
				System.out.println("Reached Max Brightness");
			}
		
		}else{
		System.out.println("Turnon the Tv first");
	}
				
				
			}
		
		public static void decreaseBrightness(){
		if(isConnected == true){
		if(currentBrightness > minBrightness){
		currentBrightness = currentBrightness-1;
		System.out.println("The currentBrightness is "+ currentBrightness);
		}else{
	           System.out.println("Minimum Brightness is reached");
			   }
			   
		}
		else{
		      System.out.println("Tv is tuned off... can't decrease the Brightness");
		
		
		
		}
	}
		
}
	
	
		
	
	
	
