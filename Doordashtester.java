class Doordashtester{
	
	
	public static void main(String foodDelivery[]){
	
	double foodPrice = Doordash.search("Dhai puri");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Lemon rice");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Samosa");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Poori");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Pongal");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Chapathi");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Obbattu");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Ragi ball special");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Sprite");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Doordash.search("Fanta");
     System.out.println("the searched food price is" +foodPrice);
	 
	 double priceWithGivenQuantity = Doordash.search("Dhai puri",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Lemon rice",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Samosa",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Poori",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Pongal",5);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Chapathi",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Obbattu",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Ragi ball special",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Sprite",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Doordash.search("Fanta",1);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	
	
	
	}
	 
	}