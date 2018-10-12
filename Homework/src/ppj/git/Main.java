package ppj.git;

/**
 * The Main class creates a 2D int array with n number of rows of different sizes
 * and displays each row in a separate line
 *
 */
public class Main {
	
	public static void createArr2D(int n) {
		
		// Declare 2D array
		int[][] array2D = new int[n][];
		
		// Initialize
		for(int i=0; i<array2D.length; i++) {
			array2D[i] = new int[i+1];
			for(int j=0; j<array2D[i].length; j++) {
				array2D[i][j] = j;
			}
		}
		
		// Display the values of 2D array
		for(int[] row : array2D) {
			for(int el : row) {
				if(el == row.length-1) {
					System.out.print(el + " ");
				}
				else {
					System.out.print(el + ", ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		createArr2D(10);
	}

}
