class Ubereatstester{
	
	
	public static void main(String foodDelivery[]){

	double foodPrice = Ubereats.search("Halwa ");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Laddu ");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Ubereats.search("Kova ");
     System.out.println("the searched food price is" +foodPrice);
	
	double priceWithGivenQuantity = Ubereats.search("Halwa ",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Ubereats.search("Laddu ",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Ubereats.search("Kova ",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	


     
	}
	
}
		