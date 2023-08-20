public class App {
	///1.- first establish the arguments for the function
	/*
	 * its supposed to have  length X and the total of operations is Y which is 
	 * the total of integer for do the operations i,j,k =>3
	 * so:
	 * int x, int y
	 * after that we have 3 arrays since i, j and k because according to the
	 * problem we supposed to add k for all the numbers is the range between i and j.
	 * so i[z] += k[z]
	 * after that we can obtain the maximum value of the array[x]
	 * */
	public static int getMaxNumberOfOperations(int x, int y,int i[], int j[], int k[]) throws Exception{
		/**
		 * 1) We have to obtain an array of length[x]
		 * so:
		 * */
				int[] arr = new int[x];
		/*
		 * 2) After that we establish the number of operations we must do for our function
		 * we already have that number which is y   
		 * so we iterate the function "y" times to insert new data in arr[]
		 * so:
		 * */		
					for(int z = 0; z < y; z++)
{
  /*3) we are supposed to establish the range i and j which are the length for my top value
   * and my lower value and so the range would be for every iteration:
   * topValue =j[z]
   * belowValue=i[z]
   * so:
   * */
						int belowValue = i[z];
						int  topValue= j[z];

 /*3 .1) always the belowValue should be <topvalue if not the range is <0, therefore  won´t be 
  * a range for maximum value.
  * so:
  * 
  * */
		if(topValue<belowValue) {
			throw new Exception("change the value of " + j[z] + " it must be bigger than "  + i[z]);
		}else {
	/**
	 * 4) after that we set the values for arr[] for every value in k[].
	 * for that we must establish the range; in other words:
	 *  "for the value belowValue until topvalue we add  the values of k[z]
	 *  and keep adding it according to the index
	 *  so:
	 * */		
			for(int range = belowValue; range <= topValue; range++)
			     arr[range] += k[z];
			 
			}
		}				
						
  /**
   * 5) finally we obtain the maximum value of arr[arrange]
   * so:
   * 
   * */
	int maximum = arr[0];
	 for (int iteration = 0; iteration < arr.length; iteration++) {  
         //Compare elements of array with max  
        if(arr[iteration] > maximum)  
            maximum = arr[iteration];  
     }  
return maximum;
}

/*6) we call the method:
 * */
		public static void main (String[] args)
{

	int x = 5;
	int i[] = { 0, 1, 2 };
	int j[] = { 1, 4, 3 };
	int k[] = { 100, 100, 100 };

	///number of operations
	int y = 3;
	
	///or here we can obtain 'y' like i.length

try {
	System.out.println("Maximum value after the 'y' "
			+ "operations is " + getMaxNumberOfOperations(x,y,i,j,k));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
