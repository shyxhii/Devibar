package devibar;

public class Array {

	public static void main(String[] args) {
		int numbers [][] = { {120, 250, 789, 7},
					 {58, 79, 31, 87},
					 {8, 1, 2, 3},
					 {99, 98, 97, 96}
		};
		
		System.out.println("Array in table form:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == 1) {
					System.out.println("Number 1 is found at indices " + i + " and " + j);
					numbers[i][j] = 50;
				}
			}
		}
		
		System.out.println("\nUpdated 2D array = 1 -> 50:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nUpdated 2D array where row 2 is all zero:");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[1][j] = 0;
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
			

	}

}
