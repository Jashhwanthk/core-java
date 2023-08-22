class Minmax{
	public static void main(String args[]){
		int array[] = {100 , 54 , 76 , 65 };
		int max = array[0];
		int min = array[0];
		
		for(int index = 0 ; index < array.length ; index++){
			
			if (array[index] > max){
				max = array[index];
				
			}
			
			else if(array[index] < min ){
				min = array[index];
			}
			System.out.println(max + "  " + min);
		
		System.out.println(max + "  " +min);
		
		
		}	
		
	}
	
	}