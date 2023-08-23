class Speaker3{
   static boolean isConnected;
   
   public static boolean onOroff(){
   System.out.println("ON or OFF invoked");
    
   if (isConnected == false){
	   isConnected = true;
	   System.out.println("The system is turned on.....enjoyyy");
   }   
   
   else if(isConnected == true){
	   isConnected = false;
	   System.out.println("The Speaker is turned off");
	   }
    System.out.println("end of onOroff");
	
	
	return isConnected;



   }


}
