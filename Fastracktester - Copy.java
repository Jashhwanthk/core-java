class Fastracktester{

        public static void main(String args[]){
			
			Fastrack reference = new Fastrack();
			reference.fastrackID=1;
			reference.material="Silicon";
			reference.color="Black";
			reference.warranty=1;
			reference.size=2;
			reference.type="Smart Watch";
			
			reference.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference.fastrackID);
			System.out.println(" Material Used is  " + reference.material);
			System.out.println("Color is  " + reference.color);
			System.out.println("Warranty is  " + reference.warranty);
			System.out.println("Dimension is   " + reference.size);
			System.out.println("Type Of Material is  " + reference.type);
			
			Fastrack reference1= new Fastrack();
			reference1.fastrackID=2;
			reference1.material="Stainless";
			reference1.color="Grey";
			reference1.warranty=2;
			reference1.size=3;
			reference1.type="Digital Watch";
			
			reference.targettingGrowth();
			System.out.println("Fastrack ID is  " +reference1.fastrackID);
			System.out.println(" Material Used is  " + reference1.material);
			System.out.println("Color is  " + reference1.color);
			System.out.println("Warranty is  " + reference1.warranty);
			System.out.println("Dimension is   " + reference1.size);
			System.out.println("Type Of Material is  " + reference1.type);
			
		}
		
}