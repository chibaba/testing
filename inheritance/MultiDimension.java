public class MultiDimension{
	
	public static void main(String[] args){
		
		int [][] a = {{1,2}, {3,4}};
		int [][] b = {{1,2,3}, {4,5,6}};
		int [][] c = {{1,2},{3},{4,5,6}};
		
		System.out.println("First Array");
		displayArray(a);
		
		System.out.println("Second Array");
		displayArray(b);
		
		System.out.println("Third Array");
		displayArray(c);
		
	}

	public static void displayArray(int[][] array){
			
			for(int row=0; row<array.length; row++){
				
				for(int column=0; column < array[row].length; column++)
					System.out.printf("%d ", array[row][column]);
				
				System.out.println();
			}
	}

}