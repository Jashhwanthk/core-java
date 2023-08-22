class Sorting{
	public static void main(String args[]){
		int arrays[] = {100 , 56 , 78 , 89 , 1};
		for(int index = 0; index < arrays.length-1; index++){
			//100 > 56//
			
		 for(int anotherindex = 0 ; anotherindex < arrays.length-1-index; anotherindex++){
			 //100 > 78//
			if(arrays[anotherindex] > arrays[anotherindex+1]){
			int temp = arrays[anotherindex];
			arrays[anotherindex] = arrays[anotherindex+1];
			arrays[anotherindex+1] = temp;
			}
		 }
		}
	

			System.out.println("Sorted array:");
			for(int array:arrays){
				System.out.println(array+"");
			}
	}
	
}
		
			
			
		